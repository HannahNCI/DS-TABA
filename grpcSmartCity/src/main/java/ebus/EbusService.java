package ebus;

import com.smartcityDS.APIResponse;
import com.smartcityDS.Timetable;
import com.smartcityDS.busNumber;
import com.smartcityDS.busSpecific;
import com.smartcityDS.busstopLocation;
import com.smartcityDS.ebusGrpc.ebusImplBase;
import com.smartcityDS.numberofSeats;
import com.smartcityDS.usbPorts;

import io.grpc.stub.StreamObserver;

public class EbusService extends ebusImplBase {

	public void getTimetable(busNumber request, StreamObserver<Timetable> responseObserver) {
		// TODO Auto-generated method stub
		super.getTimetable(request, responseObserver);
	}

	public void getNumberofSeats(busNumber request, StreamObserver<numberofSeats> responseObserver) {
		// TODO Auto-generated method stub
		super.getNumberofSeats(request, responseObserver);
	}

	@Override
	public void getUsbPortsAvailable(busNumber request, StreamObserver<usbPorts> responseObserver) {
		// TODO Auto-generated method stub
		super.getUsbPortsAvailable(request, responseObserver);
	}

	
}
