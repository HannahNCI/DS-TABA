package escooter;

import com.smartcityDS.electricscootersGrpc.electricscootersImplBase;
import com.smartcityDS.locationPrecise;
import com.smartcityDS.numberAvailable;

import io.grpc.stub.StreamObserver;

public class EscooterService extends electricscootersImplBase {

	@Override
	public void getAvailability(locationPrecise request, StreamObserver<numberAvailable> responseObserver) {
		
	}

}