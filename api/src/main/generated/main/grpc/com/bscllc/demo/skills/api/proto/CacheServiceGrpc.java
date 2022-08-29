package com.bscllc.demo.skills.api.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: WirePayload.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CacheServiceGrpc {

  private CacheServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.CacheService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.GetPayloadRequest,
      com.bscllc.demo.skills.api.proto.CachePayloadResponse> getGetWirePayloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWirePayload",
      requestType = com.bscllc.demo.skills.api.proto.GetPayloadRequest.class,
      responseType = com.bscllc.demo.skills.api.proto.CachePayloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.GetPayloadRequest,
      com.bscllc.demo.skills.api.proto.CachePayloadResponse> getGetWirePayloadMethod() {
    io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.GetPayloadRequest, com.bscllc.demo.skills.api.proto.CachePayloadResponse> getGetWirePayloadMethod;
    if ((getGetWirePayloadMethod = CacheServiceGrpc.getGetWirePayloadMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetWirePayloadMethod = CacheServiceGrpc.getGetWirePayloadMethod) == null) {
          CacheServiceGrpc.getGetWirePayloadMethod = getGetWirePayloadMethod =
              io.grpc.MethodDescriptor.<com.bscllc.demo.skills.api.proto.GetPayloadRequest, com.bscllc.demo.skills.api.proto.CachePayloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWirePayload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.GetPayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CachePayloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("GetWirePayload"))
              .build();
        }
      }
    }
    return getGetWirePayloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CachePutPayloadRequest,
      com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> getPutWirePayloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutWirePayloads",
      requestType = com.bscllc.demo.skills.api.proto.CachePutPayloadRequest.class,
      responseType = com.bscllc.demo.skills.api.proto.CachePutPayloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CachePutPayloadRequest,
      com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> getPutWirePayloadsMethod() {
    io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CachePutPayloadRequest, com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> getPutWirePayloadsMethod;
    if ((getPutWirePayloadsMethod = CacheServiceGrpc.getPutWirePayloadsMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getPutWirePayloadsMethod = CacheServiceGrpc.getPutWirePayloadsMethod) == null) {
          CacheServiceGrpc.getPutWirePayloadsMethod = getPutWirePayloadsMethod =
              io.grpc.MethodDescriptor.<com.bscllc.demo.skills.api.proto.CachePutPayloadRequest, com.bscllc.demo.skills.api.proto.CachePutPayloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutWirePayloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CachePutPayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CachePutPayloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("PutWirePayloads"))
              .build();
        }
      }
    }
    return getPutWirePayloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheLengthRequest,
      com.bscllc.demo.skills.api.proto.CacheLengthResponse> getGetLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLength",
      requestType = com.bscllc.demo.skills.api.proto.CacheLengthRequest.class,
      responseType = com.bscllc.demo.skills.api.proto.CacheLengthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheLengthRequest,
      com.bscllc.demo.skills.api.proto.CacheLengthResponse> getGetLengthMethod() {
    io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheLengthRequest, com.bscllc.demo.skills.api.proto.CacheLengthResponse> getGetLengthMethod;
    if ((getGetLengthMethod = CacheServiceGrpc.getGetLengthMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetLengthMethod = CacheServiceGrpc.getGetLengthMethod) == null) {
          CacheServiceGrpc.getGetLengthMethod = getGetLengthMethod =
              io.grpc.MethodDescriptor.<com.bscllc.demo.skills.api.proto.CacheLengthRequest, com.bscllc.demo.skills.api.proto.CacheLengthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLength"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CacheLengthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CacheLengthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("GetLength"))
              .build();
        }
      }
    }
    return getGetLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheGetAllRequest,
      com.bscllc.demo.skills.api.proto.CacheGetAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAll",
      requestType = com.bscllc.demo.skills.api.proto.CacheGetAllRequest.class,
      responseType = com.bscllc.demo.skills.api.proto.CacheGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheGetAllRequest,
      com.bscllc.demo.skills.api.proto.CacheGetAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.bscllc.demo.skills.api.proto.CacheGetAllRequest, com.bscllc.demo.skills.api.proto.CacheGetAllResponse> getGetAllMethod;
    if ((getGetAllMethod = CacheServiceGrpc.getGetAllMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetAllMethod = CacheServiceGrpc.getGetAllMethod) == null) {
          CacheServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.bscllc.demo.skills.api.proto.CacheGetAllRequest, com.bscllc.demo.skills.api.proto.CacheGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CacheGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bscllc.demo.skills.api.proto.CacheGetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("GetAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CacheServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub>() {
        @java.lang.Override
        public CacheServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceStub(channel, callOptions);
        }
      };
    return CacheServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CacheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub>() {
        @java.lang.Override
        public CacheServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceBlockingStub(channel, callOptions);
        }
      };
    return CacheServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CacheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub>() {
        @java.lang.Override
        public CacheServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceFutureStub(channel, callOptions);
        }
      };
    return CacheServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CacheServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWirePayload(com.bscllc.demo.skills.api.proto.GetPayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePayloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWirePayloadMethod(), responseObserver);
    }

    /**
     */
    public void putWirePayloads(com.bscllc.demo.skills.api.proto.CachePutPayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutWirePayloadsMethod(), responseObserver);
    }

    /**
     */
    public void getLength(com.bscllc.demo.skills.api.proto.CacheLengthRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheLengthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLengthMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.bscllc.demo.skills.api.proto.CacheGetAllRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheGetAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWirePayloadMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bscllc.demo.skills.api.proto.GetPayloadRequest,
                com.bscllc.demo.skills.api.proto.CachePayloadResponse>(
                  this, METHODID_GET_WIRE_PAYLOAD)))
          .addMethod(
            getPutWirePayloadsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bscllc.demo.skills.api.proto.CachePutPayloadRequest,
                com.bscllc.demo.skills.api.proto.CachePutPayloadResponse>(
                  this, METHODID_PUT_WIRE_PAYLOADS)))
          .addMethod(
            getGetLengthMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bscllc.demo.skills.api.proto.CacheLengthRequest,
                com.bscllc.demo.skills.api.proto.CacheLengthResponse>(
                  this, METHODID_GET_LENGTH)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bscllc.demo.skills.api.proto.CacheGetAllRequest,
                com.bscllc.demo.skills.api.proto.CacheGetAllResponse>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class CacheServiceStub extends io.grpc.stub.AbstractAsyncStub<CacheServiceStub> {
    private CacheServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWirePayload(com.bscllc.demo.skills.api.proto.GetPayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePayloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWirePayloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putWirePayloads(com.bscllc.demo.skills.api.proto.CachePutPayloadRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutWirePayloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLength(com.bscllc.demo.skills.api.proto.CacheLengthRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheLengthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLengthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.bscllc.demo.skills.api.proto.CacheGetAllRequest request,
        io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheGetAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CacheServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CacheServiceBlockingStub> {
    private CacheServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bscllc.demo.skills.api.proto.CachePayloadResponse getWirePayload(com.bscllc.demo.skills.api.proto.GetPayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWirePayloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bscllc.demo.skills.api.proto.CachePutPayloadResponse putWirePayloads(com.bscllc.demo.skills.api.proto.CachePutPayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutWirePayloadsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bscllc.demo.skills.api.proto.CacheLengthResponse getLength(com.bscllc.demo.skills.api.proto.CacheLengthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLengthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bscllc.demo.skills.api.proto.CacheGetAllResponse getAll(com.bscllc.demo.skills.api.proto.CacheGetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CacheServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CacheServiceFutureStub> {
    private CacheServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bscllc.demo.skills.api.proto.CachePayloadResponse> getWirePayload(
        com.bscllc.demo.skills.api.proto.GetPayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWirePayloadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bscllc.demo.skills.api.proto.CachePutPayloadResponse> putWirePayloads(
        com.bscllc.demo.skills.api.proto.CachePutPayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutWirePayloadsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bscllc.demo.skills.api.proto.CacheLengthResponse> getLength(
        com.bscllc.demo.skills.api.proto.CacheLengthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLengthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bscllc.demo.skills.api.proto.CacheGetAllResponse> getAll(
        com.bscllc.demo.skills.api.proto.CacheGetAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WIRE_PAYLOAD = 0;
  private static final int METHODID_PUT_WIRE_PAYLOADS = 1;
  private static final int METHODID_GET_LENGTH = 2;
  private static final int METHODID_GET_ALL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CacheServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CacheServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WIRE_PAYLOAD:
          serviceImpl.getWirePayload((com.bscllc.demo.skills.api.proto.GetPayloadRequest) request,
              (io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePayloadResponse>) responseObserver);
          break;
        case METHODID_PUT_WIRE_PAYLOADS:
          serviceImpl.putWirePayloads((com.bscllc.demo.skills.api.proto.CachePutPayloadRequest) request,
              (io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CachePutPayloadResponse>) responseObserver);
          break;
        case METHODID_GET_LENGTH:
          serviceImpl.getLength((com.bscllc.demo.skills.api.proto.CacheLengthRequest) request,
              (io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheLengthResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.bscllc.demo.skills.api.proto.CacheGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.bscllc.demo.skills.api.proto.CacheGetAllResponse>) responseObserver);
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

  private static abstract class CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CacheServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bscllc.demo.skills.api.proto.WirePayloadOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CacheService");
    }
  }

  private static final class CacheServiceFileDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier {
    CacheServiceFileDescriptorSupplier() {}
  }

  private static final class CacheServiceMethodDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CacheServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CacheServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CacheServiceFileDescriptorSupplier())
              .addMethod(getGetWirePayloadMethod())
              .addMethod(getPutWirePayloadsMethod())
              .addMethod(getGetLengthMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
