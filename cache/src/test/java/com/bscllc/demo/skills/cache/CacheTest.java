package com.bscllc.demo.skills.cache;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static java.util.Map.entry;
import static java.util.stream.Collectors.groupingBy;

public class CacheTest {
    static LoadingCache<String, String> toDosCache = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterAccess(60, TimeUnit.SECONDS)
            .build(
                    new CacheLoader<String, String>() {
                        @Override
                        public String load(String key) throws Exception {
                            System.out.format("\t*** load(%s) called\n", key);
                            return UUID.randomUUID().toString();
                        }

                        @Override
                        public Map<String, String> loadAll(Iterable<? extends String> keys) throws Exception {
                            System.out.println("\t*** load all called");
                            Map<String, String> map = new ConcurrentHashMap<>();

                            keys.forEach(k -> {
                                map.put(k, UUID.randomUUID().toString());
                            });

                            return map;
                        }

                        @Override
                        public ListenableFuture<String> reload(String key, String oldValue) throws Exception {
                            return super.reload(key, oldValue);
                        }
                    }
            );


    @Test
    public void doCacheTest() {
        try {
            System.out.format("First call: %s\n", toDosCache.get("Edwin"));
            System.out.format("First call: %s\n", toDosCache.get("Sabrina"));
            System.out.format("First call: %s\n", toDosCache.get("Jayden"));
            System.out.format("First call: %s\n", toDosCache.get("Sierra"));
            System.out.println("-----");
            System.out.format("Second call: %s\n", toDosCache.get("Edwin"));
            System.out.format("Second call: %s\n", toDosCache.get("Sabrina"));
            System.out.format("Second call: %s\n", toDosCache.get("Jayden"));
            System.out.format("Second call: %s\n", toDosCache.get("Sierra"));
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void doLoadCache() {
        List<String>names = Arrays.asList("edwin", "sabrina", "jayden", "sierra", "carolyn");

        Map<String, String>loadMap = Map.ofEntries(entry("edwin", "husband"),
                entry("sabrina", "wife"), entry("jayden", "son"),
                entry("sierra", "daughter"));

        toDosCache.putAll(loadMap);

        ConcurrentMap<String, String> map =  toDosCache.asMap();

        System.out.format("Cache: %s\n", map);

        try {
            ImmutableMap<String, String>imap =
            toDosCache.getAll(Arrays.asList("edwin", "joshua", "nothing", "google"));

            System.out.format("----- im map -----\n%s\n", imap);
            System.out.format("**** the map: %s\n", toDosCache.asMap());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cleanup() throws IOException {
        System.err.println("Current dir: " + System.getProperty("user.dir"));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/51.json")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/resources/fixed.json"))));

        String line;

        while ((line = in.readLine()) != null) {
            if (!line.isEmpty() && !line.isBlank()) {
                out.println(line);
            }
        }

        in.close();
        out.close();
    }

    @Test
    public void getKeys() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/fixed.json")));
        ObjectMapper mapper = new ObjectMapper();
        HashSet<String>keys = new HashSet<>();

        String line;
        JsonNode jsonNode;

        while ((line = in.readLine()) != null) {
            jsonNode = mapper.readTree(line);

            jsonNode = jsonNode.get("payload");

            Iterator<String>fieldNames = jsonNode.fieldNames();
            fieldNames.forEachRemaining(k -> keys.add(k));
        }
        in.close();

        System.out.format("Total field: %d\n", keys.size());
        keys.forEach(k -> {
            System.out.format("\t%s\n", k);
        });



    }

    @Test
    public void parseMe() throws IOException {
        System.err.println("Current dir: " + System.getProperty("user.dir"));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/fixed.json")));

        ObjectMapper mapper = new ObjectMapper();
        MyDevice device;

        String line;

        while ((line = in.readLine()) != null) {
            device = mapper.readValue(line, MyDevice.class);

            System.out.format("Object: %s\n", device);
        }

        in.close();
    }

    @Test
    public void getSatellites() throws IOException {
        System.err.println("Current dir: " + System.getProperty("user.dir"));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/arrayed-fixed.json")));

        ObjectMapper mapper = new ObjectMapper();
//        Satellites satellites = mapper.readValue(in, Satellites.class);
//        in.close();
//
//        List<Payload>payloads = Arrays.stream(satellites.getSatellites())
//                .map(MyDevice::getPayload)
//                .collect(Collectors.toList());
//
//        System.out.format("Payloads size: %d\n", payloads.size());
//
//        Map<String, List<Payload>>payloadMap = payloads.stream().collect(groupingBy(Payload::getDeviceUrn));
//
//        TreeMap<String, List<Payload>>sortedMap = new TreeMap<String, List<Payload>>();
//
//        sortedMap.putAll(payloadMap);
//
//        sortedMap.entrySet().
//                forEach(theEntry -> {
//            System.out.format("Key: %s. Length %d\n", theEntry.getKey(), theEntry.getValue().size());
//        });

    }

    @Test
    public void listTest() {

    }
}
