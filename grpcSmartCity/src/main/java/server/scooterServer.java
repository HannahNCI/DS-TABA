package server;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.smartcityDS.electricscootersGrpc.electricscootersImplBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import escooter.EscooterService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class scooterServer {
	 public static void main(String args[]) throws IOException, InterruptedException {
			 
			 System.out.println("starting GRPC Server");
			 Server server = ServerBuilder.forPort(8080).addService(

					 new UserService()).build();
			 System.out.println("Welcome!");
			 
			 server.start();
			 System.out.println("server started at "+ server.getPort());
		        server.awaitTermination();
		     System.out.println("Successfully Logged out!");
	  }
	 
	}
