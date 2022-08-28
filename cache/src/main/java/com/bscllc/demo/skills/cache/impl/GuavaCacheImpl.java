package com.bscllc.demo.skills.cache.impl;

import com.bscllc.demo.skills.cache.Payload;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.bscllc.demo.skills.cache.MyCache;
import com.bscllc.demo.skills.cache.MyDevice;
import com.bscllc.demo.skills.cache.Satellites;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GuavaCacheImpl implements MyCache {
    private LoadingCache<String, List<Payload>>payloadCache;
    private Map<String, List<Payload>>serviceValues;

    public GuavaCacheImpl() {

        try {
            localLoad();
        } catch (IOException e) {
            serviceValues = new ConcurrentHashMap<>();
        }

        payloadCache = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .expireAfterAccess(60, TimeUnit.SECONDS)
                .build(
                        new CacheLoader<String, List<Payload>>() {
                            @Override
                            public List<Payload> load(String key) throws Exception {
                                return serviceValues.get(key);
                            }

                            @Override
                            public Map<String, List<Payload>> loadAll(Iterable<? extends String> keys) throws Exception {
                                Map<String, List<Payload>> map = new ConcurrentHashMap<>();

                                keys.forEach(k -> {
                                    map.put(k, serviceValues.get(k));
                                });
                                return map;
                            }
                            @Override
                            public ListenableFuture<List<Payload>> reload(String key, List<Payload> oldValue) throws Exception {
                                return super.reload(key, oldValue);
                            }
                        }
                );
    }


    @Override
    public List<Payload> getPayloadList(String key) {

        try {
            return payloadCache.get(key);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String putPayload(String key, Payload payload) {
        List<Payload>existingList = payloadCache.getIfPresent(key);

        if (existingList != null) {
            existingList.add(payload);
        } else {
            ArrayList<Payload> list = new ArrayList<>();
            list.add(payload);

            payloadCache.put(key, list);
        }

        return key;
    }

    @Override
    public Map<String, List<Payload>> getAll() {
        return payloadCache.asMap();
    }

    @Override
    public void clear() {
        payloadCache.invalidateAll();
    }

    @Override
    public long getLength() {
        return payloadCache.size();
    }

    @Override
    public String putPayloads(String key, List<Payload> payloads) {
        List<Payload>existingList = payloadCache.getIfPresent(key);

        if (existingList != null) {
            existingList.addAll(payloads);
        } else {
            ArrayList<Payload> list = new ArrayList<>();
            list.addAll(payloads);

            payloadCache.put(key, list);
        }

        return key;
    }

    @Override
    public String getCacheInfo() {
        CacheStats stats = payloadCache.stats();

        StringBuilder builder = new StringBuilder().append("loadPenalty: ").append(stats.averageLoadPenalty());
        builder.append("\nEviction count: ").append(stats.evictionCount());
        builder.append("\nHit count: ").append(stats.hitCount());
        builder.append("\nLoad count: ").append(stats.loadCount());
        builder.append("\nTotal load time: ").append(stats.totalLoadTime());
        builder.append("\nRequest count: ").append(stats.requestCount()).append("\n");

        return builder.toString();
    }

    /**
     * Acting like this is the service to call to load the cache
     */
    private void localLoad() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/arrayed-fixed.json")));

        ObjectMapper mapper = new ObjectMapper();
        Satellites satellites = mapper.readValue(in, Satellites.class);
        in.close();

        List<Payload>payloads = Arrays.stream(satellites.getSatellites())
                .map(MyDevice::getPayload)
                .collect(Collectors.toList());

        serviceValues = payloads.stream().collect(groupingBy(Payload::getDeviceUrn));

        System.out.format("Keyset: %s\n", serviceValues.keySet());

    }
}
