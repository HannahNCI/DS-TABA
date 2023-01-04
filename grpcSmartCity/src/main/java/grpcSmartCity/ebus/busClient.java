package grpcSmartCity.ebus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import grpcSmartCity.ebus.smartcityDSGrpc.smartcityDSBlockingStub;
import grpcSmartCity.ebus.smartcityDSGrpc.smartcityDSStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class busClient {

	private static smartcityDSBlockingStub blockingStub;
	private static smartcityDSStub asyncStub;


	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50053)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = smartcityDSGrpc.newBlockingStub(channel);

		asyncStub = smartcityDSGrpc.newStub(channel);
	}
}
