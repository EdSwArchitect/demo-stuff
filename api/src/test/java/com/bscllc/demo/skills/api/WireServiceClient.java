package com.bscllc.demo.skills.api;

import com.bscllc.demo.skills.api.proto.PayloadRequest;
import com.bscllc.demo.skills.api.proto.WirePayload;
import com.bscllc.demo.skills.api.proto.WireServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WireServiceClient {
    private static final Logger logger = Logger.getLogger(WireServiceClient.class.getName());

    private final WireServiceGrpc.WireServiceBlockingStub blockingStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public WireServiceClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = WireServiceGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public void payload(String name) {
        logger.info("Will try to greet " + name + " ...");
        PayloadRequest request = PayloadRequest.newBuilder().setId(name).build();
        WirePayload response;
        try {
            response = blockingStub.getWirePayload(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }

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
            WireServiceClient client = new WireServiceClient(channel);
            client.payload(id);

            logger.info("Waiting 15 seconds for cache call for length");
            Thread.sleep(1000* 15L);

            CacheServiceClient cacheClient = new CacheServiceClient(channel);
            cacheClient.length(id);

            logger.info("Putting entries in cache");
            Thread.sleep(1000* 15L);

            cacheClient.putIt();

            logger.info("Now getting length.");
            cacheClient.length(id);

            logger.info("Now getting list");
            logger.info("------ All the first_things -----");

            cacheClient.getIt();

            logger.info("------ NOTHING -------");

            cacheClient.getDoesntExist();


            logger.info("------ GET ALL -------");

            cacheClient.getAll();


        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
