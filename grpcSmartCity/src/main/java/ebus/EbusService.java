package ebus;

import com.smartcityDS.Timetable;
import com.smartcityDS.busNumber;
import com.smartcityDS.ebusGrpc.ebusImplBase;

import io.grpc.stub.StreamObserver;

public class EbusService extends ebusImplBase {

	@Override
	public void getTimetable(busNumber request, StreamObserver<Timetable> responseObserver) {
	    
	}

}