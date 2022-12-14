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
    comments = "Source: ebus.proto")
public final class ebusGrpc {

  private ebusGrpc() {}

  public static final String SERVICE_NAME = "ebus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcityDS.busNumber,
      com.smartcityDS.Timetable> getGetTimetableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimetable",
      requestType = com.smartcityDS.busNumber.class,
      responseType = com.smartcityDS.Timetable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcityDS.busNumber,
      com.smartcityDS.Timetable> getGetTimetableMethod() {
    io.grpc.MethodDescriptor<com.smartcityDS.busNumber, com.smartcityDS.Timetable> getGetTimetableMethod;
    if ((getGetTimetableMethod = ebusGrpc.getGetTimetableMethod) == null) {
      synchronized (ebusGrpc.class) {
        if ((getGetTimetableMethod = ebusGrpc.getGetTimetableMethod) == null) {
          ebusGrpc.getGetTimetableMethod = getGetTimetableMethod = 
              io.grpc.MethodDescriptor.<com.smartcityDS.busNumber, com.smartcityDS.Timetable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ebus", "getTimetable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.Timetable.getDefaultInstance()))
                  .setSchemaDescriptor(new ebusMethodDescriptorSupplier("getTimetable"))
                  .build();
          }
        }
     }
     return getGetTimetableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcityDS.busstopLocation,
      com.smartcityDS.numberofSeats> getGetNumberofSeatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNumberofSeats",
      requestType = com.smartcityDS.busstopLocation.class,
      responseType = com.smartcityDS.numberofSeats.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcityDS.busstopLocation,
      com.smartcityDS.numberofSeats> getGetNumberofSeatsMethod() {
    io.grpc.MethodDescriptor<com.smartcityDS.busstopLocation, com.smartcityDS.numberofSeats> getGetNumberofSeatsMethod;
    if ((getGetNumberofSeatsMethod = ebusGrpc.getGetNumberofSeatsMethod) == null) {
      synchronized (ebusGrpc.class) {
        if ((getGetNumberofSeatsMethod = ebusGrpc.getGetNumberofSeatsMethod) == null) {
          ebusGrpc.getGetNumberofSeatsMethod = getGetNumberofSeatsMethod = 
              io.grpc.MethodDescriptor.<com.smartcityDS.busstopLocation, com.smartcityDS.numberofSeats>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ebus", "getNumberofSeats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.busstopLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.numberofSeats.getDefaultInstance()))
                  .setSchemaDescriptor(new ebusMethodDescriptorSupplier("getNumberofSeats"))
                  .build();
          }
        }
     }
     return getGetNumberofSeatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcityDS.busNumber,
      com.smartcityDS.usbPorts> getGetUsbPortsAvailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsbPortsAvailable",
      requestType = com.smartcityDS.busNumber.class,
      responseType = com.smartcityDS.usbPorts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcityDS.busNumber,
      com.smartcityDS.usbPorts> getGetUsbPortsAvailableMethod() {
    io.grpc.MethodDescriptor<com.smartcityDS.busNumber, com.smartcityDS.usbPorts> getGetUsbPortsAvailableMethod;
    if ((getGetUsbPortsAvailableMethod = ebusGrpc.getGetUsbPortsAvailableMethod) == null) {
      synchronized (ebusGrpc.class) {
        if ((getGetUsbPortsAvailableMethod = ebusGrpc.getGetUsbPortsAvailableMethod) == null) {
          ebusGrpc.getGetUsbPortsAvailableMethod = getGetUsbPortsAvailableMethod = 
              io.grpc.MethodDescriptor.<com.smartcityDS.busNumber, com.smartcityDS.usbPorts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ebus", "getUsbPortsAvailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.busNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcityDS.usbPorts.getDefaultInstance()))
                  .setSchemaDescriptor(new ebusMethodDescriptorSupplier("getUsbPortsAvailable"))
                  .build();
          }
        }
     }
     return getGetUsbPortsAvailableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ebusStub newStub(io.grpc.Channel channel) {
    return new ebusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ebusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ebusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ebusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ebusFutureStub(channel);
  }

  /**
   */
  public static abstract class ebusImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTimetable(com.smartcityDS.busNumber request,
        io.grpc.stub.StreamObserver<com.smartcityDS.Timetable> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimetableMethod(), responseObserver);
    }

    /**
     */
    public void getNumberofSeats(com.smartcityDS.busstopLocation request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberofSeats> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberofSeatsMethod(), responseObserver);
    }

    /**
     */
    public void getUsbPortsAvailable(com.smartcityDS.busNumber request,
        io.grpc.stub.StreamObserver<com.smartcityDS.usbPorts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsbPortsAvailableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTimetableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartcityDS.busNumber,
                com.smartcityDS.Timetable>(
                  this, METHODID_GET_TIMETABLE)))
          .addMethod(
            getGetNumberofSeatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartcityDS.busstopLocation,
                com.smartcityDS.numberofSeats>(
                  this, METHODID_GET_NUMBEROF_SEATS)))
          .addMethod(
            getGetUsbPortsAvailableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.smartcityDS.busNumber,
                com.smartcityDS.usbPorts>(
                  this, METHODID_GET_USB_PORTS_AVAILABLE)))
          .build();
    }
  }

  /**
   */
  public static final class ebusStub extends io.grpc.stub.AbstractStub<ebusStub> {
    private ebusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ebusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ebusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ebusStub(channel, callOptions);
    }

    /**
     */
    public void getTimetable(com.smartcityDS.busNumber request,
        io.grpc.stub.StreamObserver<com.smartcityDS.Timetable> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNumberofSeats(com.smartcityDS.busstopLocation request,
        io.grpc.stub.StreamObserver<com.smartcityDS.numberofSeats> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsbPortsAvailable(com.smartcityDS.busNumber request,
        io.grpc.stub.StreamObserver<com.smartcityDS.usbPorts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsbPortsAvailableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ebusBlockingStub extends io.grpc.stub.AbstractStub<ebusBlockingStub> {
    private ebusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ebusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ebusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ebusBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartcityDS.Timetable getTimetable(com.smartcityDS.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetTimetableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartcityDS.numberofSeats getNumberofSeats(com.smartcityDS.busstopLocation request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberofSeatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartcityDS.usbPorts getUsbPortsAvailable(com.smartcityDS.busNumber request) {
      return blockingUnaryCall(
          getChannel(), getGetUsbPortsAvailableMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ebusFutureStub extends io.grpc.stub.AbstractStub<ebusFutureStub> {
    private ebusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ebusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ebusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ebusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcityDS.Timetable> getTimetable(
        com.smartcityDS.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTimetableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcityDS.numberofSeats> getNumberofSeats(
        com.smartcityDS.busstopLocation request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberofSeatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcityDS.usbPorts> getUsbPortsAvailable(
        com.smartcityDS.busNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsbPortsAvailableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TIMETABLE = 0;
  private static final int METHODID_GET_NUMBEROF_SEATS = 1;
  private static final int METHODID_GET_USB_PORTS_AVAILABLE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ebusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ebusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TIMETABLE:
          serviceImpl.getTimetable((com.smartcityDS.busNumber) request,
              (io.grpc.stub.StreamObserver<com.smartcityDS.Timetable>) responseObserver);
          break;
        case METHODID_GET_NUMBEROF_SEATS:
          serviceImpl.getNumberofSeats((com.smartcityDS.busstopLocation) request,
              (io.grpc.stub.StreamObserver<com.smartcityDS.numberofSeats>) responseObserver);
          break;
        case METHODID_GET_USB_PORTS_AVAILABLE:
          serviceImpl.getUsbPortsAvailable((com.smartcityDS.busNumber) request,
              (io.grpc.stub.StreamObserver<com.smartcityDS.usbPorts>) responseObserver);
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

  private static abstract class ebusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ebusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcityDS.Ebus.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ebus");
    }
  }

  private static final class ebusFileDescriptorSupplier
      extends ebusBaseDescriptorSupplier {
    ebusFileDescriptorSupplier() {}
  }

  private static final class ebusMethodDescriptorSupplier
      extends ebusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ebusMethodDescriptorSupplier(String methodName) {
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
      synchronized (ebusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ebusFileDescriptorSupplier())
              .addMethod(getGetTimetableMethod())
              .addMethod(getGetNumberofSeatsMethod())
              .addMethod(getGetUsbPortsAvailableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
