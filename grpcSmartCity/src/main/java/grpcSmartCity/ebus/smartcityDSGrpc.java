package grpcSmartCity.ebus;

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

import grpcSmartCity.ecar.carDelete;
import grpcSmartCity.ecar.pluginAmount;
import grpcSmartCity.ecar.pluginAvailability;
import grpcSmartCity.ecar.pluginSpecific;
import grpcSmartCity.ecar.preciseLocation;
import grpcSmartCity.escooter.rentalCost;
import grpcSmartCity.escooter.scooterAvailability;
import grpcSmartCity.escooter.scooterDelete;
import io.grpc.ManagedChannel;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ebus.proto")
public final class smartcityDSGrpc {

  private smartcityDSGrpc() {}

  public static final String SERVICE_NAME = "grpcSmartCity.smartcityDS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busTimetable> getGetTimetableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimetable",
      requestType = grpcSmartCity.ebus.busNumber.class,
      responseType = grpcSmartCity.ebus.busTimetable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busTimetable> getGetTimetableMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busTimetable> getGetTimetableMethod;
    if ((getGetTimetableMethod = smartcityDSGrpc.getGetTimetableMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetTimetableMethod = smartcityDSGrpc.getGetTimetableMethod) == null) {
          smartcityDSGrpc.getGetTimetableMethod = getGetTimetableMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busTimetable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "getTimetable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busTimetable.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getTimetable"))
                  .build();
          }
        }
     }
     return getGetTimetableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busNumberofSeats> getGetNumberofSeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumberofSeats",
      requestType = grpcSmartCity.ebus.busNumber.class,
      responseType = grpcSmartCity.ebus.busNumberofSeats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busNumberofSeats> getGetNumberofSeatsMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busNumberofSeats> getGetNumberofSeatsMethod;
    if ((getGetNumberofSeatsMethod = smartcityDSGrpc.getGetNumberofSeatsMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetNumberofSeatsMethod = smartcityDSGrpc.getGetNumberofSeatsMethod) == null) {
          smartcityDSGrpc.getGetNumberofSeatsMethod = getGetNumberofSeatsMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busNumberofSeats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "getNumberofSeats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumberofSeats.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getNumberofSeats"))
                  .build();
          }
        }
     }
     return getGetNumberofSeatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busNumberofUsb> getGetNumberofUsbMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumberofUsb",
      requestType = grpcSmartCity.ebus.busNumber.class,
      responseType = grpcSmartCity.ebus.busNumberofUsb.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busNumberofUsb> getGetNumberofUsbMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busNumberofUsb> getGetNumberofUsbMethod;
    if ((getGetNumberofUsbMethod = smartcityDSGrpc.getGetNumberofUsbMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getGetNumberofUsbMethod = smartcityDSGrpc.getGetNumberofUsbMethod) == null) {
          smartcityDSGrpc.getGetNumberofUsbMethod = getGetNumberofUsbMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busNumberofUsb>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "getNumberofUsb"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumberofUsb.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("getNumberofUsb"))
                  .build();
          }
        }
     }
     return getGetNumberofUsbMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ebus.busSpecific,
      grpcSmartCity.ebus.busAmount> getSeeBusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "seeBus",
      requestType = grpcSmartCity.ebus.busSpecific.class,
      responseType = grpcSmartCity.ebus.busAmount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ebus.busSpecific,
      grpcSmartCity.ebus.busAmount> getSeeBusMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ebus.busSpecific, grpcSmartCity.ebus.busAmount> getSeeBusMethod;
    if ((getSeeBusMethod = smartcityDSGrpc.getSeeBusMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getSeeBusMethod = smartcityDSGrpc.getSeeBusMethod) == null) {
          smartcityDSGrpc.getSeeBusMethod = getSeeBusMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ebus.busSpecific, grpcSmartCity.ebus.busAmount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "seeBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busSpecific.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busAmount.getDefaultInstance()))
                  .setSchemaDescriptor(new smartcityDSMethodDescriptorSupplier("seeBus"))
                  .build();
          }
        }
     }
     return getSeeBusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busDelete> getDeleteBusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBus",
      requestType = grpcSmartCity.ebus.busNumber.class,
      responseType = grpcSmartCity.ebus.busDelete.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber,
      grpcSmartCity.ebus.busDelete> getDeleteBusMethod() {
    io.grpc.MethodDescriptor<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busDelete> getDeleteBusMethod;
    if ((getDeleteBusMethod = smartcityDSGrpc.getDeleteBusMethod) == null) {
      synchronized (smartcityDSGrpc.class) {
        if ((getDeleteBusMethod = smartcityDSGrpc.getDeleteBusMethod) == null) {
          smartcityDSGrpc.getDeleteBusMethod = getDeleteBusMethod = 
              io.grpc.MethodDescriptor.<grpcSmartCity.ebus.busNumber, grpcSmartCity.ebus.busDelete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpcSmartCity.smartcityDS", "deleteBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcSmartCity.ebus.busDelete.getDefaultInstance()))
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
    public void getTimetable(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busTimetable> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimetableMethod(), responseObserver);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public void getNumberofSeats(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofSeats> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberofSeatsMethod(), responseObserver);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public void getNumberofUsb(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofUsb> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberofUsbMethod(), responseObserver);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public void seeBus(grpcSmartCity.ebus.busSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busAmount> responseObserver) {
      asyncUnimplementedUnaryCall(getSeeBusMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public void deleteBus(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busDelete> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimetableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ebus.busNumber,
                grpcSmartCity.ebus.busTimetable>(
                  this, METHODID_GET_TIMETABLE)))
          .addMethod(
            getGetNumberofSeatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ebus.busNumber,
                grpcSmartCity.ebus.busNumberofSeats>(
                  this, METHODID_GET_NUMBEROF_SEATS)))
          .addMethod(
            getGetNumberofUsbMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ebus.busNumber,
                grpcSmartCity.ebus.busNumberofUsb>(
                  this, METHODID_GET_NUMBEROF_USB)))
          .addMethod(
            getSeeBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ebus.busSpecific,
                grpcSmartCity.ebus.busAmount>(
                  this, METHODID_SEE_BUS)))
          .addMethod(
            getDeleteBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcSmartCity.ebus.busNumber,
                grpcSmartCity.ebus.busDelete>(
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
    public void getTimetable(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busTimetable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public void getNumberofSeats(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofSeats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public void getNumberofUsb(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofUsb> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberofUsbMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public void seeBus(grpcSmartCity.ebus.busSpecific request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busAmount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeeBusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public void deleteBus(grpcSmartCity.ebus.busNumber request,
        io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busDelete> responseObserver) {
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
    public grpcSmartCity.ebus.busTimetable getTimetable(grpcSmartCity.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetTimetableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public grpcSmartCity.ebus.busNumberofSeats getNumberofSeats(grpcSmartCity.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberofSeatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public grpcSmartCity.ebus.busNumberofUsb getNumberofUsb(grpcSmartCity.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberofUsbMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public grpcSmartCity.ebus.busAmount seeBus(grpcSmartCity.ebus.busSpecific request) {
      return blockingUnaryCall(
          getChannel(), getSeeBusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public grpcSmartCity.ebus.busDelete deleteBus(grpcSmartCity.ebus.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBusMethod(), getCallOptions(), request);
    }

	public busAmount getBusAmount(busNumber requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public preciseLocation getpluginAmount(preciseLocation requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public pluginAmount getPluginAmount(pluginAmount requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public pluginAvailability getpluginAvailability(preciseLocation requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public carDelete deleteCar(pluginSpecific request) {
		// TODO Auto-generated method stub
		return null;
	}

	public scooterAvailability getScooterAvailability(preciseLocation requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public scooterDelete deleteScooter(pluginSpecific request) {
		// TODO Auto-generated method stub
		return null;
	}

	public rentalCost getRentalCost(ManagedChannel requests) {
		// TODO Auto-generated method stub
		return null;
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
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ebus.busTimetable> getTimetable(
        grpcSmartCity.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get number of seats on bus
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ebus.busNumberofSeats> getNumberofSeats(
        grpcSmartCity.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get number of usb ports on bus
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ebus.busNumberofUsb> getNumberofUsb(
        grpcSmartCity.ebus.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberofUsbMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *seeing all busses out of specific bus type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ebus.busAmount> seeBus(
        grpcSmartCity.ebus.busSpecific request) {
      return futureUnaryCall(
          getChannel().newCall(getSeeBusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *delete busses
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcSmartCity.ebus.busDelete> deleteBus(
        grpcSmartCity.ebus.busNumber request) {
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
          serviceImpl.getTimetable((grpcSmartCity.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busTimetable>) responseObserver);
          break;
        case METHODID_GET_NUMBEROF_SEATS:
          serviceImpl.getNumberofSeats((grpcSmartCity.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofSeats>) responseObserver);
          break;
        case METHODID_GET_NUMBEROF_USB:
          serviceImpl.getNumberofUsb((grpcSmartCity.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busNumberofUsb>) responseObserver);
          break;
        case METHODID_SEE_BUS:
          serviceImpl.seeBus((grpcSmartCity.ebus.busSpecific) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busAmount>) responseObserver);
          break;
        case METHODID_DELETE_BUS:
          serviceImpl.deleteBus((grpcSmartCity.ebus.busNumber) request,
              (io.grpc.stub.StreamObserver<grpcSmartCity.ebus.busDelete>) responseObserver);
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
      return grpcSmartCity.ebus.smartcityDSServiceImpl.getDescriptor();
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
