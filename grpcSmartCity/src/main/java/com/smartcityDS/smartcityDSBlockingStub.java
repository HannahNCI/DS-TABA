package com.smartcityDS;

import grpcSmartCity.ebus.busNumber;
import grpcSmartCity.ebus.busTimetable;
import grpcSmartCity.ecar.pluginAvailability;
import grpcSmartCity.ecar.preciseLocation;
import grpcSmartCity.escooter.scooterAvailability;
import io.grpc.ManagedChannel;

public class smartcityDSBlockingStub {

	public busTimetable getbusTimetable(busNumber requests) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public pluginAvailability getpluginAvailability(preciseLocation requests) {
		// TODO Auto-generated method stub
		return null;
	}

	public scooterAvailability getScooterAvailability(preciseLocation requests) {
		// TODO Auto-generated method stub
		return null;
	}

}
