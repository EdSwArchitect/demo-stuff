package com.bscllc.demo.skills.api;

import com.bscllc.demo.skills.api.impl.CacheServiceImpl;
import com.bscllc.demo.skills.api.proto.*;
import com.bscllc.demo.skills.cache.PayloadCache;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WireServiceServer {
    private Server server;
    private static final Logger logger = Logger.getLogger(WireServiceServer.class.getName());
    private PayloadCache cache;

    public WireServiceServer() {
        this.cache = new PayloadCache();
    }


    static class WireServiceImpl extends WireServiceGrpc.WireServiceImplBase {
        @Override
        public void getWirePayload(PayloadRequest request, StreamObserver<WirePayload> responseObserver) {
            WirePayload payload = WirePayload.newBuilder().
                    setDevice(58L).
                    setDeviceUrn("myUrn").
                    setServiceHandler(request.getId()).
                    build();
            responseObserver.onNext(payload);
            responseObserver.onCompleted();
//
//        super.getWirePayload(request, responseObserver);
        }
    }

//    static class CacheServiceImpl extends CacheServiceGrpc.CacheServiceImplBase {
//        @Override
//        public void getWirePayload(GetPayloadRequest request, StreamObserver<CachePayloadResponse> responseObserver) {
//            super.getWirePayload(request, responseObserver);
//        }
//
//        @Override
//        public void putWirePayloads(CachePutPayloadRequest request, StreamObserver<CachePutPayloadResponse> responseObserver) {
//            super.putWirePayloads(request, responseObserver);
//        }
//
//        @Override
//        public void getLength(CacheLengthRequest request, StreamObserver<CacheLengthResponse> responseObserver) {
//            CacheLengthResponse response = CacheLengthResponse.newBuilder().setLength(55L).build();
//            responseObserver.onNext(response);
//            responseObserver.onCompleted();
//        }
//    }

    public void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new WireServiceImpl())
                .addService(new CacheServiceImpl())
                .build()
                .start();


        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    WireServiceServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String... args) {
        final WireServiceServer server = new WireServiceServer();
        try {
            server.start();
            server.blockUntilShutdown();
        } catch (IOException | InterruptedException e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            logger.warning(sw.toString());
        }
    }
}
