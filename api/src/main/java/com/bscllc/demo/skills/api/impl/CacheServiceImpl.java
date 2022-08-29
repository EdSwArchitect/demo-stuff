package com.bscllc.demo.skills.api.impl;

import com.bscllc.demo.skills.api.proto.*;
import com.bscllc.demo.skills.api.util.PayloadMap;
import com.bscllc.demo.skills.cache.Payload;
import com.bscllc.demo.skills.cache.PayloadCache;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Implement the cache mechanism using the cache class
 */
public class CacheServiceImpl extends CacheServiceGrpc.CacheServiceImplBase {
    private static final Logger logger = Logger.getLogger(CacheServiceImpl.class.getName());
    private PayloadCache cache;

    public CacheServiceImpl() {
        cache = new PayloadCache();
    }
    @Override
    public void getWirePayload(GetPayloadRequest request, StreamObserver<CachePayloadResponse> responseObserver) {

        String key = request.getId();

        logger.info(String.format("Getting payloads for %s", key));

        List<Payload>payloads = cache.getPayloadList(key);

        if (payloads != null) {

            List<WirePayload> list = payloads.stream().map(PayloadMap::payloadToWire).collect(Collectors.toList());

            logger.info(String.format("Returned list of size %d for key %s. Returning empty list.", list.size(), key));


            CachePayloadResponse response = CachePayloadResponse.newBuilder().addAllPayloads(list).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        else {
            CachePayloadResponse response = CachePayloadResponse.newBuilder().
                    addAllPayloads(new ArrayList<WirePayload>()).build();

            logger.info(String.format("Nothing for key %s. Returning empty list.", key));

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        }
    }

    @Override
    public void putWirePayloads(CachePutPayloadRequest request, StreamObserver<CachePutPayloadResponse> responseObserver) {
        int numberOfPayloads = request.getPayloadsCount();
        String key = request.getId();

        logger.info(String.format("Putting %d payload entries into cache", numberOfPayloads));
        logger.info(String.format("The key for the entries is: %s", key));

        List<WirePayload>list =  request.getPayloadsList();

        List<Payload> payloads = list.stream().map(PayloadMap::wireToPayload).collect(Collectors.toList());

        cache.putPayloads(key, payloads);

        CachePutPayloadResponse response = CachePutPayloadResponse.newBuilder().setSucceeded(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getLength(CacheLengthRequest request, StreamObserver<CacheLengthResponse> responseObserver) {
        CacheLengthResponse response = CacheLengthResponse.newBuilder().
                setLength(cache.getLength()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAll(CacheGetAllRequest request, StreamObserver<CacheGetAllResponse> responseObserver) {
        Map<String, List<Payload>>map =  cache.getAll();
        Map<String, WirePayloadList>wireMap = new HashMap<>();

        map.entrySet().forEach(entry -> {
            List<WirePayload>wplist = entry.getValue().stream().map(PayloadMap::payloadToWire).collect(Collectors.toList());

            WirePayloadList wpl = WirePayloadList.newBuilder().addAllPayloads(wplist).build();

            wireMap.put(entry.getKey(), wpl);
        });

        CacheGetAllResponse response = CacheGetAllResponse.newBuilder().putAllPayloads(wireMap).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
