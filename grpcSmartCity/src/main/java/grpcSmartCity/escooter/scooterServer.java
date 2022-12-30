package grpcSmartCity.escooter;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Properties;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import org.apache.commons.lang3.ArrayUtils;

import grpcSmartCity.escooter.smartcityDSGrpc.smartcityDSImplBase;

//scooter server class
public class scooterServer extends smartcityDSImplBase{

    static int [] scooters = {1,9,11,4};


    public static void main(String[] args) throws IOException, InterruptedException {

        scooterServer server = new scooterServer();
        Properties prop = server.getProperties();
        server.register(prop);
        int port = Integer.valueOf(prop.getProperty("service_port"));

        try {
            //creating the server
            Server servers = ServerBuilder.forPort(port).addService(server).build().start();
            System.out.println("Server started, awaiting RPC calls...");
            servers.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public Properties getProperties() {
        Properties p = null;
        try (InputStream input = new FileInputStream("src/main/resources/properties/escooter.properties")) {
            p = new Properties();
            p.load(input);
            System.out.println("Service properties...");
            System.out.println("\t service_description: " + p.getProperty("service_description"));
            System.out.println("\t service_type: " + p.getProperty("service_type"));
            System.out.println("\t service_name: " + p.getProperty("service_name"));
            System.out.println("\t service_port: " + p.getProperty("service_port"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return p;

    }

    public void register(Properties paper) throws IOException, InterruptedException {
        //service is discoverable
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        String service_type = paper.getProperty("service_type");
        String service_name = paper.getProperty("service_name");
        String service_description_properties = paper.getProperty("service_description");
        int service_port = Integer.valueOf(paper.getProperty("service_port"));

        ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
                service_description_properties);

        //final register
        jmdns.registerService(serviceInfo);
        System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
        Thread.sleep(1000);
    }

    @Override
    //delete scooter request
    public void deleteScooter(scooterAmount request, StreamObserver<scooterDelete> responseObserver) {

        int scooterrequest = Integer.parseInt(request.getScooterAmount());

        for (int i = 0; i < scooters.length; i++) {
            if (scooterrequest == scooters[i]) {
                //removing scooters from system
                scooters = ArrayUtils.remove(scooters, i);
                scooterDelete reply = scooterDelete.newBuilder().setScooterDelete("Positive").build();
                responseObserver.onNext(reply);
                break;
            } else {
                scooterDelete reply = scooterDelete.newBuilder().setScooterDelete("Negitive").build();
                responseObserver.onNext(reply);
                break;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    //get amount of scooters
    public void seeScooter (scooterSpecific request, StreamObserver<scooterAmount> responseObserver){
        scooterAmount reply = scooterAmount.newBuilder().setScooterAmount(String.valueOf(scooters)).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    //Is Scooter Available?
    public void getScooterAvailability(scooterAmount request, StreamObserver<scooterAvailability> responseObserver){
        scooterAvailability reply = scooterAvailability.newBuilder().setScooterAvailability("Sold Out").build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
