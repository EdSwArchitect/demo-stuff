package com.bscllc.demo.skills.api.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: WirePayload.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WireServiceGrpc {

  private WireServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.WireService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.PayloadRequest,
      com.bscllc.demo.skills.api.proto.WirePayload> getGetWirePayloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWirePayload",
      requestType = com.bscllc.demo.skills.api.proto.PayloadRequest.class,
      responseType = com.bscllc.demo.skills.api.proto.WirePayload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.PayloadRequest,
      com.bscllc.demo.skills.api.proto.WirePayload> getGetWirePayloadMethod() {
    io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.PayloadRequest, com.bscllc.demo.skills.api.proto.WirePayload> getGetWirePayloadMethod;
    if ((getGetWirePayloadMethod = WireServiceGrpc.getGetWirePayloadMethod) == null) {
      synchronized (WireServiceGrpc.class) {
        if ((getGetWirePayloadMethod = WireServiceGrpc.getGetWirePayloadMethod) == null) {
          WireServiceGrpc.getGetWirePayloadMethod = getGetWirePayloadMethod =
              io.grpc.MethodDescriptor.<com.bscllc.demo.skills.api.proto.PayloadRequest, com.bscllc.demo.skills.api.proto.WirePayload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWirePayload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.PayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.WirePayload.getDefaultInstance()))
              .setSchemaDescriptor(new WireServiceMethodDescriptorSupplier("GetWirePayload"))
              .build();
        }
      }
    }
    return getGetWirePayloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WireServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WireServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WireServiceStub>() {
        @java.lang.Override
        public WireServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WireServiceStub(channel, callOptions);
        }
      };
    return WireServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WireServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WireServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WireServiceBlockingStub>() {
        @java.lang.Override
        public WireServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WireServiceBlockingStub(channel, callOptions);
        }
      };
    return WireServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WireServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WireServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WireServiceFutureStub>() {
        @java.lang.Override
        public WireServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WireServiceFutureStub(channel, callOptions);
        }
      };
    return WireServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WireServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWirePayload(com.bscllc.demo.skills.api.proto.PayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.WirePayload> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWirePayloadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWirePayloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bscllc.demo.skills.api.proto.PayloadRequest,
                com.bscllc.demo.skills.api.proto.WirePayload>(
                  this, METHODID_GET_WIRE_PAYLOAD)))
          .build();
    }
  }

  /**
   */
  public static final class WireServiceStub extends io.grpc.stub.AbstractAsyncStub<WireServiceStub> {
    private WireServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WireServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WireServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWirePayload(com.bscllc.demo.skills.api.proto.PayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.WirePayload> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWirePayloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WireServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WireServiceBlockingStub> {
    private WireServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WireServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WireServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bscllc.demo.skills.api.proto.WirePayload getWirePayload(com.bscllc.demo.skills.api.proto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWirePayloadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WireServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WireServiceFutureStub> {
    private WireServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WireServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WireServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bscllc.demo.skills.api.proto.WirePayload> getWirePayload(
        com.bscllc.demo.skills.api.proto.PayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWirePayloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WIRE_PAYLOAD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WireServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WireServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WIRE_PAYLOAD:
          serviceImpl.getWirePayload((com.bscllc.demo.skills.api.proto.PayloadRequest) request,
              (io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.WirePayload>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WireServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bscllc.demo.skills.api.proto.WirePayloadOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WireService");
    }
  }

  private static final class WireServiceFileDescriptorSupplier
      extends WireServiceBaseDescriptorSupplier {
    WireServiceFileDescriptorSupplier() {}
  }

  private static final class WireServiceMethodDescriptorSupplier
      extends WireServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WireServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WireServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WireServiceFileDescriptorSupplier())
              .addMethod(getGetWirePayloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
