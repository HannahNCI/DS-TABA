package escooter;

import com.smartcityDS.electricscootersGrpc.electricscootersImplBase;
import com.smartcityDS.APIResponse;
import com.smartcityDS.locationPrecise;
import com.smartcityDS.numberAvailable;
import com.smartcityDS.rentalCost;
import com.smartcityDS.rentalDuration;

import io.grpc.stub.StreamObserver;

public class EscooterService extends electricscootersImplBase {

	@Override
	public void getAvailability(locationPrecise request, StreamObserver<numberAvailable> responseObserver) {
		// TODO Auto-generated method stub
		super.getAvailability(request, responseObserver);
	}

	@Override
	public void getRentalCost(locationPrecise request, StreamObserver<rentalCost> responseObserver) {
		// TODO Auto-generated method stub
		super.getRentalCost(request, responseObserver);
	}

	@Override
	public void getRentalDuration(locationPrecise request, StreamObserver<rentalDuration> responseObserver) {
		// TODO Auto-generated method stub
		super.getRentalDuration(request, responseObserver);
	}

	
}