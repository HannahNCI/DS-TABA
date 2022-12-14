package GUI;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sun.security.x509.IPAddressName;
import smartcityDS.bus.*;
import smartcityDS.bus.smartcityDSGrpc.smartcityDSBlockingStub;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;

import com.smartcityDS.busNumber;

import ebus.busSpecific;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import smartcityDS.bus.smartcityDSGrpc.*;
import smartcityDS.bus.Timetable;
import smartcityDS.bus.smartcityDSGrpc.smartcityDSStub;


public class GUI {
    public JFrame frame;
    public static ServiceInfo serviceinfo;
    public static smartcityDS.bus.smartcityDSGrpc.smartcityDSBlockingStub smartcitydsstub;
    public static void main (String[]args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    GUI window = new GUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
}
    public GUI() throws IOException, InterruptedException {
        String service_type = "_http._tcp.local.";
        discoveryService(service_type);
        String host = serviceinfo.getHostAddresses()[0];
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, 50053).usePlaintext().build();
        ManagedChannel channel2 = ManagedChannelBuilder.forAddress(host, 50052).usePlaintext().build();
        smartcitydsstub = smartcityDSGrpc.newBlockingStub(channel);
        intializer();
    }

    public void intializer(){
        frame = new JFrame();
        frame.setTitle("Client - Service Controller");
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui(frame);
    }

    public void discoveryService(String service_type) throws IOException, InterruptedException {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        //jmdns.addServiceListener(service_type, new MyServiceListener());
        Thread.sleep(10000);
        jmdns.close();
    }

    public static class MyServiceListener implements ServiceListener {
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            serviceinfo = event.getInfo();
        }
    }

    //buttons
    public void ui(JFrame frame){
        //Bus Buttons
        JButton getTimetableBtn = new JButton("Get train Number");
        JButton getNumberofSeatsBtn = new JButton("Amount of trains out on route");
        JButton getUsbPortsAvailableBtn = new JButton("Delete train from route");
        
        //Car Buttons
        JButton getAvailabilePointsBtn = new JButton("Get train Number");
        JButton getChargingDurationBtn = new JButton("Amount of trains out on route");
        
        //Scooter Buttons
        JButton  getAvailabilityBtn = new JButton("Get train Number");
        JButton getRentalCostBtn = new JButton("Amount of trains out on route");
        JButton getRentalDurationBtn = new JButton("Delete train from route");
        
        // bus text fields
        JTextField getTimetableTf = new JTextField();
        JTextField getNumberofSeatsTf = new JTextField();
        JTextField getUsbPortsAvailableTf = new JTextField();
        
        // car text fields
        JTextField getAvailabilePointsTf = new JTextField();
        JTextField getChargingDurationTf = new JTextField();
        
        // scooter text fields
        JTextField getAvailabilityTf = new JTextField();
        JTextField getRentalCostTf = new JTextField();
        JTextField getRentalDurationTf = new JTextField();

        //adding to the GUI
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        //Bus
        panel.add(getTimetableTf);
        panel.add(getTimetableBtn);
        panel.add(getNumberofSeatsTf);
        panel.add(getNumberofSeatsBtn); 
        panel.add(getUsbPortsAvailableTf);
        panel.add(getUsbPortsAvailableBtn);
        //Car
        panel.add(getAvailabilePointsTf);
        panel.add(getAvailabilePointsBtn);
        panel.add(getChargingDurationTf);
        panel.add(getChargingDurationBtn);
        //Scooter
        panel.add(getAvailabilityTf);
        panel.add(getAvailabilityBtn);
        panel.add(getRentalCostTf);
        panel.add(getRentalCostBtn);
        panel.add(getRentalDurationTf);
        panel.add(getRentalDurationBtn);
        frame.add(panel);

        getTimetableBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(getTimetableTf.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(getTimetableTf.getText()).build();
                    busNumber reply =  smartcitydsstub.getTimetable(requests);
                    JOptionPane.showMessageDialog(frame, reply.getTimetable());

                }
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });


        getNumberofSeatsBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(getNumberofSeatsTf.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(getTimetableTf.getText()).build();
                    busSpecific reply =  smartcitydsstub.getNumberofSeats(requests);
                    JOptionPane.showMessageDialog(frame, reply.getNumberofSeats());

                }
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });



        getUsbPortsAvailableBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(getUsbPortsAvailableTf.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(getTimetableTf.getText()).build();
                    busSpecific reply =  smartcitydsstub.getUsbPortsAvailable(requests);
                    JOptionPane.showMessageDialog(frame, reply.getUsbPortsAvailable());

                }
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
    }

}