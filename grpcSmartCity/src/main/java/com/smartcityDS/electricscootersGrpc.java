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
    comments = "Source: escooter.proto")
public final class electricscootersGrpc {

  private electricscootersGrpc() {}

  public static final String SERVICE_NAME = "electricscooters";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcityDS.locationPrecise,
      com.smartcityDS.numberAvailable> getGetAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAvailability",
      requestType = com.smartcityDS.locationPrecise.class,
      responseType = com.smartcityDS.numberAvailable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcityDS.locationPrecise,
      com.smartcityDS.numberAvailable> getGetAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.smartcityDS.locationPrecise, com.smartcityDS.numberAvailable> getGetAvailabilityMethod;
    if ((getGetAvailabilityMethod = electricscootersGrpc.getGetAvailabilityMethod) == null) {
      synchronized (electricscootersGrpc.class) {
        if ((getGetAvailabilityMethod = electricscootersGrpc.getGetAvailabilityMethod) == null) {
          electricscootersGrpc.getGetAvailabilityMethod = getGetAvailabilityMethod = 
              io.grpc.MethodDescriptor.<com.smartcityDS.locationPrecise, com.smartcityDS.numberAvailable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "electricscooters", "getAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.locationPrecise.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.numberAvailable.getDefaultInstance()))
                  .setSchemaDescriptor(new electricscootersMethodDescriptorSupplier("getAvailability"))
                  .build();
          }
        }
     }
     return getGetAvailabilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static electricscootersStub newStub(io.grpc.Channel channel) {
    return new electricscootersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static electricscootersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new electricscootersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static electricscootersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new electricscootersFutureStub(channel);
  }

  /**
   */
  public static abstract class electricscootersImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAvailability(com.smartcityDS.locationPrecise request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberAvailable> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvailabilityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartcityDS.locationPrecise,
                com.smartcityDS.numberAvailable>(
                  this, METHODID_GET_AVAILABILITY)))
          .build();
    }
  }

  /**
   */
  public static final class electricscootersStub extends io.grpc.stub.AbstractStub<electricscootersStub> {
    private electricscootersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private electricscootersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected electricscootersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new electricscootersStub(channel, callOptions);
    }

    /**
     */
    public void getAvailability(com.smartcityDS.locationPrecise request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberAvailable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class electricscootersBlockingStub extends io.grpc.stub.AbstractStub<electricscootersBlockingStub> {
    private electricscootersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private electricscootersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected electricscootersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new electricscootersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartcityDS.numberAvailable getAvailability(com.smartcityDS.locationPrecise request) {
      return blockingUnaryCall(
          getChannel(), getGetAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class electricscootersFutureStub extends io.grpc.stub.AbstractStub<electricscootersFutureStub> {
    private electricscootersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private electricscootersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected electricscootersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new electricscootersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcityDS.numberAvailable> getAvailability(
        com.smartcityDS.locationPrecise request) {
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
    private final electricscootersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(electricscootersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABILITY:
          serviceImpl.getAvailability((com.smartcityDS.locationPrecise) request,
              (io.grpc.stub.StreamObserver<com.smartcityDS.numberAvailable>) responseObserver);
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

  private static abstract class electricscootersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    electricscootersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcityDS.Escooter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("electricscooters");
    }
  }

  private static final class electricscootersFileDescriptorSupplier
      extends electricscootersBaseDescriptorSupplier {
    electricscootersFileDescriptorSupplier() {}
  }

  private static final class electricscootersMethodDescriptorSupplier
      extends electricscootersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    electricscootersMethodDescriptorSupplier(String methodName) {
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
      synchronized (electricscootersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new electricscootersFileDescriptorSupplier())
              .addMethod(getGetAvailabilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
