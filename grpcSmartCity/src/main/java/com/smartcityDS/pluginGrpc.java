package com.smartcityDS;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ecar.proto")
public final class pluginGrpc {

  private pluginGrpc() {}

  public static final String SERVICE_NAME = "plugin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcityDS.preciseLocation,
      com.smartcityDS.numberofchargingPoints> getGetAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAvailability",
      requestType = com.smartcityDS.preciseLocation.class,
      responseType = com.smartcityDS.numberofchargingPoints.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcityDS.preciseLocation,
      com.smartcityDS.numberofchargingPoints> getGetAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.smartcityDS.preciseLocation, com.smartcityDS.numberofchargingPoints> getGetAvailabilityMethod;
    if ((getGetAvailabilityMethod = pluginGrpc.getGetAvailabilityMethod) == null) {
      synchronized (pluginGrpc.class) {
        if ((getGetAvailabilityMethod = pluginGrpc.getGetAvailabilityMethod) == null) {
          pluginGrpc.getGetAvailabilityMethod = getGetAvailabilityMethod = 
              io.grpc.MethodDescriptor.<com.smartcityDS.preciseLocation, com.smartcityDS.numberofchargingPoints>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "plugin", "getAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.preciseLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.numberofchargingPoints.getDefaultInstance()))
                  .setSchemaDescriptor(new pluginMethodDescriptorSupplier("getAvailability"))
                  .build();
          }
        }
     }
     return getGetAvailabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static pluginStub newStub(io.grpc.Channel channel) {
    return new pluginStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static pluginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new pluginBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static pluginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new pluginFutureStub(channel);
  }

  /**
   */
  public static abstract class pluginImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAvailability(com.smartcityDS.preciseLocation request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberofchargingPoints> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvailabilityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartcityDS.preciseLocation,
                com.smartcityDS.numberofchargingPoints>(
                  this, METHODID_GET_AVAILABILITY)))
          .build();
    }
  }

  /**
   */
  public static final class pluginStub extends io.grpc.stub.AbstractStub<pluginStub> {
    private pluginStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pluginStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pluginStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pluginStub(channel, callOptions);
    }

    /**
     */
    public void getAvailability(com.smartcityDS.preciseLocation request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberofchargingPoints> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class pluginBlockingStub extends io.grpc.stub.AbstractStub<pluginBlockingStub> {
    private pluginBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pluginBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pluginBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pluginBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartcityDS.numberofchargingPoints getAvailability(com.smartcityDS.preciseLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class pluginFutureStub extends io.grpc.stub.AbstractStub<pluginFutureStub> {
    private pluginFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pluginFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pluginFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pluginFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcityDS.numberofchargingPoints> getAvailability(
        com.smartcityDS.preciseLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AVAILABILITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final pluginImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(pluginImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABILITY:
          serviceImpl.getAvailability((com.smartcityDS.preciseLocation) request,
              (io.grpc.stub.StreamObserver<com.smartcityDS.numberofchargingPoints>) responseObserver);
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

  private static abstract class pluginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    pluginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcityDS.Ecar.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("plugin");
    }
  }

  private static final class pluginFileDescriptorSupplier
      extends pluginBaseDescriptorSupplier {
    pluginFileDescriptorSupplier() {}
  }

  private static final class pluginMethodDescriptorSupplier
      extends pluginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    pluginMethodDescriptorSupplier(String methodName) {
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
      synchronized (pluginGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new pluginFileDescriptorSupplier())
              .addMethod(getGetAvailabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
