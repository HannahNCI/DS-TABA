package grpcSmartCity.ecar;

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
public final class smartcityDSGrpc {

  private smartcityDSGrpc() {}

  public static final String SERVICE_NAME = "grpcSmartCity.smartcityDS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ecar.preciseLocation,
      grpcSmartCity.ecar.pluginAvailability> getGetpluginAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getpluginAvailability",
      requestType = grpcSmartCity.ecar.preciseLocation.class,
      responseType = grpcSmartCity.ecar.pluginAvailability.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ecar.preciseLocation,
      grpcSmartCity.ecar.pluginAvailability> getGetpluginAvailabilityMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ecar.preciseLocation, grpcSmartCity.ecar.pluginAvailability> getGetpluginAvailabilityMethod;
    if ((getGetpluginAvailabilityMethod = smartcityDSGrpc.getGetpluginAvailabilityMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetpluginAvailabilityMethod = smartcityDSGrpc.getGetpluginAvailabilityMethod) == null) {
          smartcityDSGrpc.getGetpluginAvailabilityMethod = getGetpluginAvailabilityMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ecar.preciseLocation, grpcSmartCity.ecar.pluginAvailability>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "getpluginAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.preciseLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginAvailability.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getpluginAvailability"))
                  .build();
          }
        }
     }
     return getGetpluginAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginAvailability,
      grpcSmartCity.ecar.chargingDuration> getGetChargingDurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChargingDuration",
      requestType = grpcSmartCity.ecar.pluginAvailability.class,
      responseType = grpcSmartCity.ecar.chargingDuration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginAvailability,
      grpcSmartCity.ecar.chargingDuration> getGetChargingDurationMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginAvailability, grpcSmartCity.ecar.chargingDuration> getGetChargingDurationMethod;
    if ((getGetChargingDurationMethod = smartcityDSGrpc.getGetChargingDurationMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetChargingDurationMethod = smartcityDSGrpc.getGetChargingDurationMethod) == null) {
          smartcityDSGrpc.getGetChargingDurationMethod = getGetChargingDurationMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ecar.pluginAvailability, grpcSmartCity.ecar.chargingDuration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "getChargingDuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginAvailability.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.chargingDuration.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getChargingDuration"))
                  .build();
          }
        }
     }
     return getGetChargingDurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific,
      grpcSmartCity.ecar.pluginAmount> getSeePluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "seePlugin",
      requestType = grpcSmartCity.ecar.pluginSpecific.class,
      responseType = grpcSmartCity.ecar.pluginAmount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific,
      grpcSmartCity.ecar.pluginAmount> getSeePluginMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific, grpcSmartCity.ecar.pluginAmount> getSeePluginMethod;
    if ((getSeePluginMethod = smartcityDSGrpc.getSeePluginMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getSeePluginMethod = smartcityDSGrpc.getSeePluginMethod) == null) {
          smartcityDSGrpc.getSeePluginMethod = getSeePluginMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ecar.pluginSpecific, grpcSmartCity.ecar.pluginAmount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "seePlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginSpecific.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginAmount.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("seePlugin"))
                  .build();
          }
        }
     }
     return getSeePluginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific,
      grpcSmartCity.ecar.pluginDelete> getDeletePluginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePlugin",
      requestType = grpcSmartCity.ecar.pluginSpecific.class,
      responseType = grpcSmartCity.ecar.pluginDelete.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific,
      grpcSmartCity.ecar.pluginDelete> getDeletePluginMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ecar.pluginSpecific, grpcSmartCity.ecar.pluginDelete> getDeletePluginMethod;
    if ((getDeletePluginMethod = smartcityDSGrpc.getDeletePluginMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getDeletePluginMethod = smartcityDSGrpc.getDeletePluginMethod) == null) {
          smartcityDSGrpc.getDeletePluginMethod = getDeletePluginMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ecar.pluginSpecific, grpcSmartCity.ecar.pluginDelete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "deletePlugin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginSpecific.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ecar.pluginDelete.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("deletePlugin"))
                  .build();
          }
        }
     }
     return getDeletePluginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartcityDSStub newStub(io.grpc.Channel channel) {
    return new smartcityDSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartcityDSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartcityDSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartcityDSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartcityDSFutureStub(channel);
  }

  /**
   */
  public static abstract class smartcityDSImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *get available ecar plugin points
     * </pre>
     */
    public void getpluginAvailability(grpcSmartCity.ecar.preciseLocation request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAvailability> responseObserver) {
      asyncUnimplementedUnaryCall(getGetpluginAvailabilityMethod(), responseObserver);
    }

    /**
     * <pre>
     *get plugin duration
     * </pre>
     */
    public void getChargingDuration(grpcSmartCity.ecar.pluginAvailability request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.chargingDuration> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChargingDurationMethod(), responseObserver);
    }

    /**
     * <pre>
     *seeing all pluginpoints out of specific type
     * </pre>
     */
    public void seePlugin(grpcSmartCity.ecar.pluginSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAmount> responseObserver) {
      asyncUnimplementedUnaryCall(getSeePluginMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete pluginpoints
     * </pre>
     */
    public void deletePlugin(grpcSmartCity.ecar.pluginSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginDelete> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePluginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetpluginAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ecar.preciseLocation,
                grpcSmartCity.ecar.pluginAvailability>(
                  this, METHODID_GETPLUGIN_AVAILABILITY)))
          .addMethod(
            getGetChargingDurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ecar.pluginAvailability,
                grpcSmartCity.ecar.chargingDuration>(
                  this, METHODID_GET_CHARGING_DURATION)))
          .addMethod(
            getSeePluginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ecar.pluginSpecific,
                grpcSmartCity.ecar.pluginAmount>(
                  this, METHODID_SEE_PLUGIN)))
          .addMethod(
            getDeletePluginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ecar.pluginSpecific,
                grpcSmartCity.ecar.pluginDelete>(
                  this, METHODID_DELETE_PLUGIN)))
          .build();
    }
  }

  /**
   */
  public static final class smartcityDSStub extends io.grpc.stub.AbstractStub<smartcityDSStub> {
    private smartcityDSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcityDSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcityDSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcityDSStub(channel, callOptions);
    }

    /**
     * <pre>
     *get available ecar plugin points
     * </pre>
     */
    public void getpluginAvailability(grpcSmartCity.ecar.preciseLocation request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAvailability> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetpluginAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get plugin duration
     * </pre>
     */
    public void getChargingDuration(grpcSmartCity.ecar.pluginAvailability request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.chargingDuration> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChargingDurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *seeing all pluginpoints out of specific type
     * </pre>
     */
    public void seePlugin(grpcSmartCity.ecar.pluginSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAmount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeePluginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *delete pluginpoints
     * </pre>
     */
    public void deletePlugin(grpcSmartCity.ecar.pluginSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginDelete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePluginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartcityDSBlockingStub extends io.grpc.stub.AbstractStub<smartcityDSBlockingStub> {
    private smartcityDSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcityDSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcityDSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcityDSBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *get available ecar plugin points
     * </pre>
     */
    public grpcSmartCity.ecar.pluginAvailability getpluginAvailability(grpcSmartCity.ecar.preciseLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetpluginAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get plugin duration
     * </pre>
     */
    public grpcSmartCity.ecar.chargingDuration getChargingDuration(grpcSmartCity.ecar.pluginAvailability request) {
      return blockingUnaryCall(
          getChannel(), getGetChargingDurationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *seeing all pluginpoints out of specific type
     * </pre>
     */
    public grpcSmartCity.ecar.pluginAmount seePlugin(grpcSmartCity.ecar.pluginSpecific request) {
      return blockingUnaryCall(
          getChannel(), getSeePluginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *delete pluginpoints
     * </pre>
     */
    public grpcSmartCity.ecar.pluginDelete deletePlugin(grpcSmartCity.ecar.pluginSpecific request) {
      return blockingUnaryCall(
          getChannel(), getDeletePluginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartcityDSFutureStub extends io.grpc.stub.AbstractStub<smartcityDSFutureStub> {
    private smartcityDSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartcityDSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartcityDSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartcityDSFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *get available ecar plugin points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ecar.pluginAvailability> getpluginAvailability(
        grpcSmartCity.ecar.preciseLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetpluginAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get plugin duration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ecar.chargingDuration> getChargingDuration(
        grpcSmartCity.ecar.pluginAvailability request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChargingDurationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *seeing all pluginpoints out of specific type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ecar.pluginAmount> seePlugin(
        grpcSmartCity.ecar.pluginSpecific request) {
      return futureUnaryCall(
          getChannel().newCall(getSeePluginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *delete pluginpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ecar.pluginDelete> deletePlugin(
        grpcSmartCity.ecar.pluginSpecific request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePluginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GETPLUGIN_AVAILABILITY = 0;
  private static final int METHODID_GET_CHARGING_DURATION = 1;
  private static final int METHODID_SEE_PLUGIN = 2;
  private static final int METHODID_DELETE_PLUGIN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartcityDSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartcityDSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GETPLUGIN_AVAILABILITY:
          serviceImpl.getpluginAvailability((grpcSmartCity.ecar.preciseLocation) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAvailability>) responseObserver);
          break;
        case METHODID_GET_CHARGING_DURATION:
          serviceImpl.getChargingDuration((grpcSmartCity.ecar.pluginAvailability) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ecar.chargingDuration>) responseObserver);
          break;
        case METHODID_SEE_PLUGIN:
          serviceImpl.seePlugin((grpcSmartCity.ecar.pluginSpecific) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginAmount>) responseObserver);
          break;
        case METHODID_DELETE_PLUGIN:
          serviceImpl.deletePlugin((grpcSmartCity.ecar.pluginSpecific) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ecar.pluginDelete>) responseObserver);
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

  private static abstract class smartcityDSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartcityDSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcSmartCity.ecar.smartcityDSServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartcityDS");
    }
  }

  private static final class smartcityDSFileDescriptorSupplier
      extends smartcityDSBaseDescriptorSupplier {
    smartcityDSFileDescriptorSupplier() {}
  }

  private static final class smartcityDSMethodDescriptorSupplier
      extends smartcityDSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartcityDSMethodDescriptorSupplier(String methodName) {
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
      synchronized (smartcityDSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartcityDSFileDescriptorSupplier())
              .addMethod(getGetpluginAvailabilityMethod())
              .addMethod(getGetChargingDurationMethod())
              .addMethod(getSeePluginMethod())
              .addMethod(getDeletePluginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
