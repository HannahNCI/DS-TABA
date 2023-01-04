package smartcityds.ebus;

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
    comments = "Source: ebus.proto")
public final class smartcityDSGrpc {

  private smartcityDSGrpc() {}

  public static final String SERVICE_NAME = "smartcityds.smartcityDS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busTimetable> getGetTimetableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimetable",
      requestType = smartcityds.ebus.busNumber.class,
      responseType = smartcityds.ebus.busTimetable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busTimetable> getGetTimetableMethod() {
    io.grpc.MethodDescriptor<smartcityds.ebus.busNumber, smartcityds.ebus.busTimetable> getGetTimetableMethod;
    if ((getGetTimetableMethod = smartcityDSGrpc.getGetTimetableMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetTimetableMethod = smartcityDSGrpc.getGetTimetableMethod) == null) {
          smartcityDSGrpc.getGetTimetableMethod = getGetTimetableMethod = 
              io.grpc.MethodDescriptor.<smartcityds.ebus.busNumber, smartcityds.ebus.busTimetable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcityds.smartcityDS", "getTimetable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busTimetable.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getTimetable"))
                  .build();
          }
        }
     }
     return getGetTimetableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busNumberofSeats> getGetNumberofSeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumberofSeats",
      requestType = smartcityds.ebus.busNumber.class,
      responseType = smartcityds.ebus.busNumberofSeats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busNumberofSeats> getGetNumberofSeatsMethod() {
    io.grpc.MethodDescriptor<smartcityds.ebus.busNumber, smartcityds.ebus.busNumberofSeats> getGetNumberofSeatsMethod;
    if ((getGetNumberofSeatsMethod = smartcityDSGrpc.getGetNumberofSeatsMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetNumberofSeatsMethod = smartcityDSGrpc.getGetNumberofSeatsMethod) == null) {
          smartcityDSGrpc.getGetNumberofSeatsMethod = getGetNumberofSeatsMethod = 
              io.grpc.MethodDescriptor.<smartcityds.ebus.busNumber, smartcityds.ebus.busNumberofSeats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcityds.smartcityDS", "getNumberofSeats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumberofSeats.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getNumberofSeats"))
                  .build();
          }
        }
     }
     return getGetNumberofSeatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busNumberofUsb> getGetNumberofUsbMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumberofUsb",
      requestType = smartcityds.ebus.busNumber.class,
      responseType = smartcityds.ebus.busNumberofUsb.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busNumberofUsb> getGetNumberofUsbMethod() {
    io.grpc.MethodDescriptor<smartcityds.ebus.busNumber, smartcityds.ebus.busNumberofUsb> getGetNumberofUsbMethod;
    if ((getGetNumberofUsbMethod = smartcityDSGrpc.getGetNumberofUsbMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetNumberofUsbMethod = smartcityDSGrpc.getGetNumberofUsbMethod) == null) {
          smartcityDSGrpc.getGetNumberofUsbMethod = getGetNumberofUsbMethod = 
              io.grpc.MethodDescriptor.<smartcityds.ebus.busNumber, smartcityds.ebus.busNumberofUsb>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcityds.smartcityDS", "getNumberofUsb"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumberofUsb.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getNumberofUsb"))
                  .build();
          }
        }
     }
     return getGetNumberofUsbMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartcityds.ebus.busSpecific,
      smartcityds.ebus.busAmount> getSeeBusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "seeBus",
      requestType = smartcityds.ebus.busSpecific.class,
      responseType = smartcityds.ebus.busAmount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartcityds.ebus.busSpecific,
      smartcityds.ebus.busAmount> getSeeBusMethod() {
    io.grpc.MethodDescriptor<smartcityds.ebus.busSpecific, smartcityds.ebus.busAmount> getSeeBusMethod;
    if ((getSeeBusMethod = smartcityDSGrpc.getSeeBusMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getSeeBusMethod = smartcityDSGrpc.getSeeBusMethod) == null) {
          smartcityDSGrpc.getSeeBusMethod = getSeeBusMethod = 
              io.grpc.MethodDescriptor.<smartcityds.ebus.busSpecific, smartcityds.ebus.busAmount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcityds.smartcityDS", "seeBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busSpecific.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busAmount.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("seeBus"))
                  .build();
          }
        }
     }
     return getSeeBusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busDelete> getDeleteBusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBus",
      requestType = smartcityds.ebus.busNumber.class,
      responseType = smartcityds.ebus.busDelete.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartcityds.ebus.busNumber,
      smartcityds.ebus.busDelete> getDeleteBusMethod() {
    io.grpc.MethodDescriptor<smartcityds.ebus.busNumber, smartcityds.ebus.busDelete> getDeleteBusMethod;
    if ((getDeleteBusMethod = smartcityDSGrpc.getDeleteBusMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getDeleteBusMethod = smartcityDSGrpc.getDeleteBusMethod) == null) {
          smartcityDSGrpc.getDeleteBusMethod = getDeleteBusMethod = 
              io.grpc.MethodDescriptor.<smartcityds.ebus.busNumber, smartcityds.ebus.busDelete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartcityds.smartcityDS", "deleteBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartcityds.ebus.busDelete.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("deleteBus"))
                  .build();
          }
        }
     }
     return getDeleteBusMethod;
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
     *get bus timetables
     * </pre>
     */
    public void getTimetable(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busTimetable> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimetableMethod(), responseObserver);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public void getNumberofSeats(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofSeats> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberofSeatsMethod(), responseObserver);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public void getNumberofUsb(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofUsb> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberofUsbMethod(), responseObserver);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public void seeBus(smartcityds.ebus.busSpecific request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busAmount> responseObserver) {
      asyncUnimplementedUnaryCall(getSeeBusMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public void deleteBus(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busDelete> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimetableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartcityds.ebus.busNumber,
                smartcityds.ebus.busTimetable>(
                  this, METHODID_GET_TIMETABLE)))
          .addMethod(
            getGetNumberofSeatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartcityds.ebus.busNumber,
                smartcityds.ebus.busNumberofSeats>(
                  this, METHODID_GET_NUMBEROF_SEATS)))
          .addMethod(
            getGetNumberofUsbMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartcityds.ebus.busNumber,
                smartcityds.ebus.busNumberofUsb>(
                  this, METHODID_GET_NUMBEROF_USB)))
          .addMethod(
            getSeeBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartcityds.ebus.busSpecific,
                smartcityds.ebus.busAmount>(
                  this, METHODID_SEE_BUS)))
          .addMethod(
            getDeleteBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartcityds.ebus.busNumber,
                smartcityds.ebus.busDelete>(
                  this, METHODID_DELETE_BUS)))
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
     *get bus timetables
     * </pre>
     */
    public void getTimetable(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busTimetable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public void getNumberofSeats(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofSeats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public void getNumberofUsb(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofUsb> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberofUsbMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public void seeBus(smartcityds.ebus.busSpecific request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busAmount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeeBusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public void deleteBus(smartcityds.ebus.busNumber request,
        io.grpc.stub.StreamObserver<smartcityds.ebus.busDelete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBusMethod(), getCallOptions()), request, responseObserver);
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
     *get bus timetables
     * </pre>
     */
    public smartcityds.ebus.busTimetable getTimetable(smartcityds.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetTimetableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public smartcityds.ebus.busNumberofSeats getNumberofSeats(smartcityds.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberofSeatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public smartcityds.ebus.busNumberofUsb getNumberofUsb(smartcityds.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberofUsbMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public smartcityds.ebus.busAmount seeBus(smartcityds.ebus.busSpecific request) {
      return blockingUnaryCall(
          getChannel(), getSeeBusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public smartcityds.ebus.busDelete deleteBus(smartcityds.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBusMethod(), getCallOptions(), request);
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
     *get bus timetables
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartcityds.ebus.busTimetable> getTimetable(
        smartcityds.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartcityds.ebus.busNumberofSeats> getNumberofSeats(
        smartcityds.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartcityds.ebus.busNumberofUsb> getNumberofUsb(
        smartcityds.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberofUsbMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartcityds.ebus.busAmount> seeBus(
        smartcityds.ebus.busSpecific request) {
      return futureUnaryCall(
          getChannel().newCall(getSeeBusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartcityds.ebus.busDelete> deleteBus(
        smartcityds.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TIMETABLE = 0;
  private static final int METHODID_GET_NUMBEROF_SEATS = 1;
  private static final int METHODID_GET_NUMBEROF_USB = 2;
  private static final int METHODID_SEE_BUS = 3;
  private static final int METHODID_DELETE_BUS = 4;

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
        case METHODID_GET_TIMETABLE:
          serviceImpl.getTimetable((smartcityds.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<smartcityds.ebus.busTimetable>) responseObserver);
          break;
        case METHODID_GET_NUMBEROF_SEATS:
          serviceImpl.getNumberofSeats((smartcityds.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofSeats>) responseObserver);
          break;
        case METHODID_GET_NUMBEROF_USB:
          serviceImpl.getNumberofUsb((smartcityds.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<smartcityds.ebus.busNumberofUsb>) responseObserver);
          break;
        case METHODID_SEE_BUS:
          serviceImpl.seeBus((smartcityds.ebus.busSpecific) request,
              (io.grpc.stub.StreamObserver<smartcityds.ebus.busAmount>) responseObserver);
          break;
        case METHODID_DELETE_BUS:
          serviceImpl.deleteBus((smartcityds.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<smartcityds.ebus.busDelete>) responseObserver);
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
      return smartcityds.ebus.smartcityDSServiceImpl.getDescriptor();
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
              .addMethod(getGetTimetableMethod())
              .addMethod(getGetNumberofSeatsMethod())
              .addMethod(getGetNumberofUsbMethod())
              .addMethod(getSeeBusMethod())
              .addMethod(getDeleteBusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
