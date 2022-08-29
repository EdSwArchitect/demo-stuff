package com.bscllc.demo.skills.api;

import com.bscllc.demo.skills.api.proto.*;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CacheServiceClient {
    private static final Logger logger = Logger.getLogger(CacheServiceClient.class.getName());

    private final CacheServiceGrpc.CacheServiceBlockingStub blockingStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public CacheServiceClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = CacheServiceGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public void length(String name) {
        logger.info("Will try to greet " + name + " ...");
        CacheLengthRequest request = CacheLengthRequest.newBuilder().build();
        CacheLengthResponse response;

        try {
            response = blockingStub.getLength(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info("Response: " + response.toString());
    }

    /** Say hello to server. */
    public void putIt() {
        CachePutPayloadRequest request;
        CachePutPayloadResponse response;
        ArrayList<WirePayload>list = new ArrayList<>();

        WirePayload pl = WirePayload.newBuilder().setDeviceUrn("edwin").
                setDevMotion(true).
                setServiceHandler("regular person").
                build();
        list.add(pl);
        pl = WirePayload.newBuilder().setDeviceUrn("janet jackson").
                setDevMotion(true).
                setServiceHandler("singer").
                build();
        list.add(pl);
        pl = WirePayload.newBuilder().setDeviceUrn("gumby").
                setDevMotion(true).
                setServiceHandler("claymation").
                build();
        list.add(pl);
        pl = WirePayload.newBuilder().setDeviceUrn("blackhole").
                setDevMotion(true).
                setServiceHandler("astronomy").
                build();
        list.add(pl);

        request = CachePutPayloadRequest.newBuilder().addAllPayloads(list).setId("first_list").build();


        try {
            response = blockingStub.putWirePayloads(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info("Response: " + response.toString());
    }

    public void getIt() {
        GetPayloadRequest request = GetPayloadRequest.newBuilder().setId("first_list").build();
        CachePayloadResponse response;

        try {
            response = blockingStub.getWirePayload(request);

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info("Response: " + response.toString());

        //   rpc GetWirePayload(GetPayloadRequest) returns (CachePayloadResponse) {}
        // message GetPayloadRequest {
        //  string id = 1;
        //}
        // message CachePayloadResponse {
        //  repeated WirePayload payloads = 1;
        //}


//        Cache
    }

    public void getDoesntExist() {
        GetPayloadRequest request = GetPayloadRequest.newBuilder().setId("foobar").build();
        CachePayloadResponse response;

        try {
            response = blockingStub.getWirePayload(request);

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

        logger.info(String.format("The payload count: %d", response.getPayloadsCount()));

        logger.info("Response: " + response.toString());

    }

    public static void main(String[] args) throws Exception {
        String id = "Edwin";
        // Access a service running on the local machine on port 50051
        String target = "localhost:50051";
        // Allow passing in the user and target strings as command line arguments

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        try {
            CacheServiceClient client = new CacheServiceClient(channel);
            client.length(id);

            logger.info("Waiting 15 seconds for cache call");
            Thread.sleep(1000* 15L);

            client.putIt();

            logger.info("Now doing cache length.");
            Thread.sleep(1000*10L);

            client.length("gooober");

            logger.info("------ All the things -----");

            client.getIt();


        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
