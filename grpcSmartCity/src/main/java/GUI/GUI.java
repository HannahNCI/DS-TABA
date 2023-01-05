package GUI;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import sun.security.x509.IPAddressName;
import grpcSmartCity.ebus.*;
import grpcSmartCity.ebus.smartcityDSGrpc;
import grpcSmartCity.ebus.smartcityDSGrpc.smartcityDSBlockingStub;
import grpcSmartCity.ebus.smartcityDSGrpc.*;
import grpcSmartCity.ebus.smartcityDSGrpc.smartcityDSStub;
import grpcSmartCity.escooter.*;
import grpcSmartCity.ecar.*;
import grpcSmartCity.ecar.preciseLocation;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class GUI {
    public JFrame frame;
    private JTextField deleteScooterTf;
    public static ServiceInfo serviceinfo;
    public static smartcityDSBlockingStub smartcitydsstub;
    private JTextField BusNumberTF;
    private JTextField BusAmountTF;
    private JTextField BusSeatsTF;
    private JTextField BusUsbTF;
    private JTextField BusDeleteTF;
    private JTextField LocationTf;
    private JTextField PluginAmountsTf;
    private JTextField AvailabilityTF;
    private JTextField DurationTF;
    private JTextField DeleteCarTf;
    private JTextField ScooterLocationTF;
    private JTextField ScooterAmountTF;
    private JTextField ScooterAvailabilityTF;
    private JTextField DeleteScooterTF;
    private JTextField RentalCostTF;
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
        String service_type = "_smartcity._tcp.local.";
        ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
        intializer();
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
	public void intializer(){
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\genaz\\source\\repos\\Let's-Watch\\istockphoto-966446232-1024x1024.jpg"));
        frame.setTitle("Client - Service Controller");
        frame.setBounds(100, 100, 722, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui(frame);
        frame.getContentPane().setLayout(null);
        
        JLabel lblBusInfo = new JLabel("BUS INFO");
        lblBusInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBusInfo.setBounds(282, 285, 127, 14);
        frame.getContentPane().add(lblBusInfo);
        
        JLabel lblCarInfo = new JLabel("CAR INFO");
        lblCarInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCarInfo.setBounds(282, 390, 81, 14);
        frame.getContentPane().add(lblCarInfo);
        
        JLabel lblScooterInfo = new JLabel("SCOOTER INFO");
        lblScooterInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblScooterInfo.setBounds(265, 492, 127, 14);
        frame.getContentPane().add(lblScooterInfo);
        
        JButton btnBusNumber = new JButton("BusNumber");
        btnBusNumber.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(BusNumberTF.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusNumberTF.getText()).build();
                    busTimetable reply =  smartcitydsstub.getTimetable(requests);
                    JOptionPane.showMessageDialog(frame, reply.getBusTimetable());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnBusNumber.setBounds(24, 307, 113, 23);
        frame.getContentPane().add(btnBusNumber);
        
        JButton btnBusAmount = new JButton("BusAmount");
        btnBusAmount.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(BusAmountTF.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusNumberTF.getText()).build();
                    busAmount reply =  smartcitydsstub.getBusAmount(requests);
                    JOptionPane.showMessageDialog(frame, reply.getBusAmount());

                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnBusAmount.setBounds(147, 307, 106, 23);
        frame.getContentPane().add(btnBusAmount);
        
        JButton btnBusSeats = new JButton("Seats");
        btnBusSeats.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(BusSeatsTF.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusNumberTF.getText()).build();
                    busNumberofSeats reply =  smartcitydsstub.getNumberofSeats(requests);
                    JOptionPane.showMessageDialog(frame, reply.getBusNumberofSeats());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnBusSeats.setBounds(263, 307, 100, 23);
        frame.getContentPane().add(btnBusSeats);
        
        JButton btnBusUsb = new JButton("USB");
        btnBusUsb.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(BusUsbTF.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusUsbTF.getText()).build();
                    busNumberofUsb reply =  smartcitydsstub.getNumberofUsb(requests);
                    JOptionPane.showMessageDialog(frame, reply.getBusNumberofUsb());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnBusUsb.setBounds(373, 307, 100, 23);
        frame.getContentPane().add(btnBusUsb);
        
        JButton btnBusDelete = new JButton("Delete Bus");
        btnBusDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                //reading from the TF
                try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(BusDeleteTF.getText());
                    busNumber request = busNumber.newBuilder().setBusNumber(BusDeleteTF.getText()).build();
                    busDelete hellos = smartcitydsstub.deleteBus(request);
                    JOptionPane.showMessageDialog(frame, hellos.getBusDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }

            }


        });
        btnBusDelete.setBounds(483, 307, 113, 23);
        frame.getContentPane().add(btnBusDelete);
        
        BusNumberTF = new JTextField();
        BusNumberTF.setBounds(24, 335, 110, 45);
        frame.getContentPane().add(BusNumberTF);
        BusNumberTF.setColumns(10);
        
        BusAmountTF = new JTextField();
        BusAmountTF.setBounds(147, 335, 106, 45);
        frame.getContentPane().add(BusAmountTF);
        BusAmountTF.setColumns(10);
        
        BusSeatsTF = new JTextField();
        BusSeatsTF.setBounds(261, 335, 102, 44);
        frame.getContentPane().add(BusSeatsTF);
        BusSeatsTF.setColumns(10);
        
        BusUsbTF = new JTextField();
        BusUsbTF.setBounds(373, 335, 100, 45);
        frame.getContentPane().add(BusUsbTF);
        BusUsbTF.setColumns(10);
        
        BusDeleteTF = new JTextField();
        BusDeleteTF.setBounds(483, 335, 113, 45);
        frame.getContentPane().add(BusDeleteTF);
        BusDeleteTF.setColumns(10);
        
        JButton btnCarLocation = new JButton("PluginLocation");
        btnCarLocation.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(LocationTf.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(BusNumberTF.getText()).build();
                    preciseLocation reply =  smartcitydsstub.getpluginAmount(requests);
                    JOptionPane.showMessageDialog(frame, reply.getpluginAmount());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Invalid!");
                }
            }
        });
        btnCarLocation.setBounds(24, 415, 158, 23);
        frame.getContentPane().add(btnCarLocation);
        
        LocationTf = new JTextField();
        LocationTf.setColumns(10);
        LocationTf.setBounds(24, 443, 158, 45);
        frame.getContentPane().add(LocationTf);
        
        JButton btnPluginAmounts = new JButton("PluginAmounts");
        btnPluginAmounts.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(PluginAmountsTf.getText());
                    pluginAmount requests = pluginAmount.newBuilder().setPluginAmount(PluginAmountsTf.getText()).build();
                    pluginAmount reply =  smartcitydsstub.getPluginAmount(requests);
                    JOptionPane.showMessageDialog(frame, reply.getPluginAmount());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnPluginAmounts.setBounds(192, 415, 137, 23);
        frame.getContentPane().add(btnPluginAmounts);
        
        PluginAmountsTf = new JTextField();
        PluginAmountsTf.setColumns(10);
        PluginAmountsTf.setBounds(192, 443, 142, 45);
        frame.getContentPane().add(PluginAmountsTf);
        
        JButton btnAvailability = new JButton("Availability");
        btnAvailability.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(AvailabilityTF.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(AvailabilityTF.getText()).build();
                    pluginAvailability reply =  smartcitydsstub.getpluginAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getPluginAvailability());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnAvailability.setBounds(346, 415, 100, 23);
        frame.getContentPane().add(btnAvailability);
        
        AvailabilityTF = new JTextField();
        AvailabilityTF.setColumns(10);
        AvailabilityTF.setBounds(344, 443, 102, 38);
        frame.getContentPane().add(AvailabilityTF);
        
        JButton btnDeleteCar = new JButton("Delete Plugin");
        btnDeleteCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                //reading from the TF
                try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(DeleteCarTf.getText());
                    pluginSpecific request = pluginSpecific.newBuilder().setPluginSpecific(DeleteCarTf.getText()).build();
                    carDelete hellos = smartcitydsstub.deleteCar(request);
                    JOptionPane.showMessageDialog(frame, hellos.getcarDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Invalid!");
                }

            }


        });
        btnDeleteCar.setBounds(456, 415, 113, 23);
        frame.getContentPane().add(btnDeleteCar);
        
        DeleteCarTf = new JTextField();
        DeleteCarTf.setColumns(10);
        DeleteCarTf.setBounds(456, 443, 113, 38);
        frame.getContentPane().add(DeleteCarTf);
        
        JButton btnScooterLocation = new JButton("ScooterLocation");
        btnScooterLocation.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(LocationTf.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(LocationTf.getText()).build();
                    scooterAvailability reply =  smartcitydsstub.getScooterAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getScooterAvailability());

                }
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Invalid!");
                }
            }
        });
        btnScooterLocation.setBounds(24, 517, 158, 23);
        frame.getContentPane().add(btnScooterLocation);
        
        ScooterLocationTF = new JTextField();
        ScooterLocationTF.setColumns(10);
        ScooterLocationTF.setBounds(24, 545, 158, 58);
        frame.getContentPane().add(ScooterLocationTF);
        
        JButton btnScooterAvailability = new JButton("Availability");
        btnScooterAvailability.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(LocationTf.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(LocationTf.getText()).build();
                    scooterAvailability reply =  smartcitydsstub.getScooterAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getScooterAvailability());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });       
        btnScooterAvailability.setBounds(192, 517, 100, 23);
        frame.getContentPane().add(btnScooterAvailability);
        
        ScooterAvailabilityTF = new JTextField();
        ScooterAvailabilityTF.setColumns(10);
        ScooterAvailabilityTF.setBounds(192, 545, 102, 58);
        frame.getContentPane().add(ScooterAvailabilityTF);
        
        JButton btnDeleteScooter = new JButton("Delete Scooter");
        btnDeleteScooter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                //reading from the TF
                try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(DeleteScooterTF.getText());
                    pluginSpecific request = pluginSpecific.newBuilder().setPluginSpecific(DeleteScooterTF.getText()).build();
                    scooterDelete hellos = smartcitydsstub.deleteScooter(request);
                    JOptionPane.showMessageDialog(frame, hellos.getScooterDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }

            }


        });
        btnDeleteScooter.setBounds(396, 517, 126, 23);
        frame.getContentPane().add(btnDeleteScooter);
        
        DeleteScooterTF = new JTextField();
        DeleteScooterTF.setColumns(10);
        DeleteScooterTF.setBounds(396, 545, 126, 58);
        frame.getContentPane().add(DeleteScooterTF);
        
        JButton btnCost = new JButton("Cost");
        btnCost.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try{
                    int request = Integer.parseInt(RentalCostTF.getText());
                    ManagedChannel requests = rentalDuration.newBuilder().setRentalCost(RentalCostTF.getText()).build();
                    rentalCost reply =  smartcitydsstub.getRentalCost(requests);
                    JOptionPane.showMessageDialog(frame, reply.getRentalCost());

                }
              //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });       
        btnCost.setBounds(302, 517, 81, 23);
        frame.getContentPane().add(btnCost);
        
        RentalCostTF = new JTextField();
        RentalCostTF.setBounds(302, 545, 81, 58);
        frame.getContentPane().add(RentalCostTF);
        RentalCostTF.setColumns(10);
    }
        private void ui(JFrame frame2) {
    		
        JLabel lblHeadline = new JLabel("Smart City Application");
        lblHeadline.setBounds(251, 0, 158, 17);
        lblHeadline.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblHeadline);
        
        JLabel lblIcon = new JLabel("");
        lblIcon.setIcon(new ImageIcon("C:\\Users\\genaz\\OneDrive\\Documents\\HANNAH OROURKE-NCI\\DS-TABA\\main image.png"));
        lblIcon.setBounds(115, 28, 423, 246);
        frame.getContentPane().add(lblIcon);
}
}