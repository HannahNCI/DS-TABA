package ecar;

import com.smartcityDS.APIResponse;
import com.smartcityDS.chargingDuration;
import com.smartcityDS.numberofchargingPoints;
import com.smartcityDS.pluginGrpc.pluginImplBase;
import com.smartcityDS.preciseLocation;

import io.grpc.stub.StreamObserver;

public class EcarService extends pluginImplBase{

	@Override
	public void getAvailabilePoints(preciseLocation request, StreamObserver<numberofchargingPoints> responseObserver) {
		// TODO Auto-generated method stub
		super.getAvailabilePoints(request, responseObserver);
	}

	@Override
	public void getChargingDuration(preciseLocation request, StreamObserver<chargingDuration> responseObserver) {
		// TODO Auto-generated method stub
		super.getChargingDuration(request, responseObserver);
	}

	
}
