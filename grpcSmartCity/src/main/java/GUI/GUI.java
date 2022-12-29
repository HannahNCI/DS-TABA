package GUI;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sun.security.x509.IPAddressName;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;

import com.google.protobuf.Message;
import com.smartcityDS.busNumber;
import com.smartcityDS.busstopLocation;
import com.smartcityDS.locationPrecise;
import com.smartcityDS.preciseLocation;
import com.smartcityDS.smartcityDSBlockingStub;
import com.smartcityDS.smartcityDSGrpc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GUI {
    public JFrame frame;
    public static ServiceInfo serviceinfo;
    public static smartcityDSBlockingStub smartcitydsstub;
    private JTextField BusTf;
    private JTextField CarTf;
    private JTextField ScooterTf;
    private JTextField deleteBusTf;
    private JTextField textField;
    private JTextField deleteScooterTf;
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
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\genaz\\source\\repos\\Let's-Watch\\istockphoto-966446232-1024x1024.jpg"));
        frame.setTitle("Client - Service Controller");
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui(frame);
        frame.getContentPane().setLayout(null);
    }
        private void ui(JFrame frame2) {
    		
        JLabel lblHeadline = new JLabel("Smart City Application");
        lblHeadline.setBounds(165, 5, 158, 17);
        lblHeadline.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblHeadline);
        
        JButton btnBus = new JButton("EBus");
        btnBus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(BusTf.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusTf.getText()).build();
                    busstopLocation reply =  smartcitydsstub.getTimetable(requests);
                    JOptionPane.showMessageDialog(frame, reply.getTimetable());

                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Letters");
                }
            }
        });
        btnBus.setBounds(24, 287, 115, 23);
        frame.getContentPane().add(btnBus);
        
        JButton btnCar = new JButton("ECar");
        btnCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(CarTf.getText());
                    Message requests = (Message) preciseLocation.newBuilder().setAvailabilePoints(CarTf.getText()).build();
                    preciseLocation reply =  smartcitydsstub. getAvailabilePoints(requests);
                    JOptionPane.showMessageDialog(frame, reply. getAvailabilePoints());

                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Letters");
                }
            }
        });
        btnCar.setBounds(196, 287, 115, 23);
        frame.getContentPane().add(btnCar);
        
        JButton btnScooter = new JButton("EScooter");
        btnScooter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(ScooterTf.getText());
                    Message requests = (Message) locationPrecise.newBuilder().setAvailability(ScooterTf.getText()).build();
                    locationPrecise reply =  smartcitydsstub.getAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getAvailability());

                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Letters");
                }
           }
        	 public void discoveryService(String service_type) throws IOException, InterruptedException {
                 JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
                 jmdns.addServiceListener(service_type, new MyServiceListener());
                 Thread.sleep(10000);
                 jmdns.close();
             }

             class MyServiceListener implements ServiceListener {
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
       
        });

        btnScooter.setBounds(343, 287, 122, 23);
        frame.getContentPane().add(btnScooter);
        
        JLabel lblInfo = new JLabel("Welcome to Smart City Application!!");
        lblInfo.setBounds(154, 36, 229, 14);
        frame.getContentPane().add(lblInfo);
        
        JLabel lblInfo2 = new JLabel("Our mission is to provide relevant information on etransport");
        lblInfo2.setBounds(86, 61, 367, 17);
        frame.getContentPane().add(lblInfo2);
        
        JLabel lblInfo3 = new JLabel("Choose from ebus , escooter or ecar plugin points in your area.");
        lblInfo3.setBounds(75, 88, 367, 14);
        frame.getContentPane().add(lblInfo3);
        
        JLabel lblIcon = new JLabel("");
        lblIcon.setIcon(new ImageIcon("C:\\Users\\genaz\\source\\repos\\Let's-Watch\\Capture.PNG"));
        lblIcon.setBounds(173, 123, 229, 145);
        frame.getContentPane().add(lblIcon);
        
        BusTf = new JTextField();
        BusTf.setBounds(10, 321, 159, 31);
        frame.getContentPane().add(BusTf);
        BusTf.setColumns(10);
        
        CarTf = new JTextField();
        CarTf.setBounds(183, 321, 150, 31);
        frame.getContentPane().add(CarTf);
        CarTf.setColumns(10);
        
        ScooterTf = new JTextField();
        ScooterTf.setBounds(343, 321, 135, 31);
        frame.getContentPane().add(ScooterTf);
        ScooterTf.setColumns(10);
        
        JButton btndeleteBus = new JButton("Delete Bus");
        btndeleteBus.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
             
        	}
        });
  
        btndeleteBus.setBounds(24, 373, 115, 23);
        frame.getContentPane().add(btndeleteBus);
        
        deleteBusTf = new JTextField();
        deleteBusTf.setColumns(10);
        deleteBusTf.setBounds(10, 407, 159, 31);
        frame.getContentPane().add(deleteBusTf);
        
        JButton btndeleteCar = new JButton("Delete Car");
        btndeleteCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
               
            }


        });
        btndeleteCar.setBounds(196, 373, 115, 23);
        frame.getContentPane().add(btndeleteCar);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(183, 407, 150, 31);
        frame.getContentPane().add(textField);
        
        JButton btndeleteScooter = new JButton("Delete Scooter");
        btndeleteScooter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            }


        });
        btndeleteScooter.setBounds(343, 373, 122, 23);
        frame.getContentPane().add(btndeleteScooter);
        
        deleteScooterTf = new JTextField();
        deleteScooterTf.setColumns(10);
        deleteScooterTf.setBounds(343, 407, 135, 31);
        frame.getContentPane().add(deleteScooterTf);
    }
		
	public void discoveryService(String service_type) throws IOException, InterruptedException {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        jmdns.addServiceListener(service_type, new MyServiceListener());
        Thread.sleep(10000);
        jmdns.close();
    }

    private static class MyServiceListener implements ServiceListener {
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
}