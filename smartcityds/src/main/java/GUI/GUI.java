package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import GUI.GUI.MyServiceListener;
import smartcityds.ebus.SmartCityDSStub;
import smartcityds.ebus.busDelete;
import smartcityds.ebus.busNumber;
import smartcityds.ebus.busTimetable;
//import smartcityds.ebus.busDelete;
//import smartcityds.ecar.SmartCityDSStub;
import smartcityds.ecar.pluginAvailability;
import smartcityds.ecar.preciseLocation;
//import smartcityds.ecar.carDelete;
//import smartcityds.escooter.SmartCityDSStub;
import smartcityds.escooter.scooterAvailability;
import smartcityds.escooter.scooterDelete;
import smartcityds.escooter.smartcityDSGrpc.smartcityDSStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GUI {
	public JFrame frame;
    public static ServiceInfo serviceinfo;
    private JTextField BusTf;
    private JTextField CarTf;
    private JTextField ScooterTf;
    private JTextField deleteBusTf;
    private JTextField deleteCarTf;
    private JTextField deleteScooterTf;
    private JTextField deleteScootTf;
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
    public GUI() throws Exception {
    	String smartcityds_service_type = "_smartcityds._tcp.local.";
		discoveryService(smartcityds_service_type);
		
		String host = serviceinfo.getHostAddresses()[0];
		int port = serviceinfo.getPort();
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
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

    public static class MyServiceListener implements ServiceListener {
        @Override
		public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
		public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
		public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            serviceinfo = event.getInfo();
        }
    }
	public void intializer(){
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\genaz\\OneDrive\\Documents\\HANNAH OROURKE-NCI\\DS-TABA\\main image.png"));
        frame.setTitle("Client - Service Controller");
        frame.setBounds(100, 100, 555, 542);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ui(frame);
        frame.getContentPane().setLayout(null);

        JButton btnDeleteScoot = new JButton("Delete Scooter");
        btnDeleteScoot.addActionListener(new ActionListener() {
         	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(deleteScooterTf.getText());
                    pluginAvailability request = pluginAvailability.newBuilder().setPluginAvailability(deleteScooterTf.getText()).build();
                    scooterDelete hellos = smartcityDSStub.deleteScooter(request);
                    JOptionPane.showMessageDialog(frame, hellos.getScooterDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
         	  }
       });
        btnDeleteScoot.setBounds(271, 373, 135, 23);
        frame.getContentPane().add(btnDeleteScoot);

        deleteScootTf = new JTextField();
        deleteScootTf.setColumns(10);
        deleteScootTf.setBounds(271, 407, 150, 31);
        frame.getContentPane().add(deleteScootTf);
    }
        private void ui(JFrame frame2) {

        JLabel lblHeadline = new JLabel("Smart City Application");
        lblHeadline.setBounds(165, 5, 158, 17);
        lblHeadline.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblHeadline);

        JButton btnBus = new JButton("EBus");
        btnBus.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    int request = Integer.parseInt(BusTf.getText());
                    busNumber requests = busNumber.newBuilder().setBusNumber(BusTf.getText()).build();
                    busTimetable reply =  smartcityDSStub.getTimetable(requests);
                    JOptionPane.showMessageDialog(frame, reply.getBusTimetable());

                }//error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnBus.setBounds(24, 287, 115, 23);
        frame.getContentPane().add(btnBus);

        JButton btnCar = new JButton("ECar");
        btnCar.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    int request = Integer.parseInt(CarTf.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(CarTf.getText()).build();
                    pluginAvailability reply =  smartcityDSStub.getpluginAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getPluginAvailability());

                }//error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
            }
        });
        btnCar.setBounds(196, 287, 115, 23);
        frame.getContentPane().add(btnCar);

        JButton btnScooter = new JButton("EScooter");
        btnScooter.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    int request = Integer.parseInt(ScooterTf.getText());
                    preciseLocation requests = preciseLocation.newBuilder().setPreciseLocation(ScooterTf.getText()).build();
                    scooterAvailability reply =  smartcityDSStub.getScooterAvailability(requests);
                    JOptionPane.showMessageDialog(frame, reply.getScooterAvailability());

                }
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
        }

        });

        btnScooter.setBounds(343, 287, 150, 23);
        frame.getContentPane().add(btnScooter);

        JLabel lblIcon = new JLabel("");
        lblIcon.setIcon(new ImageIcon("C:\\Users\\genaz\\OneDrive\\Documents\\HANNAH OROURKE-NCI\\DS-TABA\\main image.png"));
        lblIcon.setBounds(44, 33, 423, 246);
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
        ScooterTf.setBounds(343, 321, 158, 31);
        frame.getContentPane().add(ScooterTf);
        ScooterTf.setColumns(10);

        JButton btndeleteBus = new JButton("Delete Bus");
        btndeleteBus.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(deleteBusTf.getText());
                    busNumber request = busNumber.newBuilder().setBusNumber(deleteBusTf.getText()).build();
                    busDelete hellos = SmartCityDSStub.deleteBus(request);
                    JOptionPane.showMessageDialog(frame, hellos.getBusDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
                }
        	}
        });

        btndeleteBus.setBounds(101, 373, 115, 23);
        frame.getContentPane().add(btndeleteBus);

        deleteBusTf = new JTextField();
        deleteBusTf.setColumns(10);
        deleteBusTf.setBounds(84, 407, 159, 31);
        frame.getContentPane().add(deleteBusTf);

        JButton btndeleteScooter = new JButton("Delete Scooter");
        btndeleteScooter.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		try{
                    //if non convertable string is entered it will fail to convert and not send message
                    int number = Integer.parseInt(deleteScooterTf.getText());
                    pluginAvailability request = pluginAvailability.newBuilder().setPluginAvailability(deleteScooterTf.getText()).build();
                    scooterDelete hellos = smartcityDSStub.deleteScooter(request);
                    JOptionPane.showMessageDialog(frame, hellos.getScooterDelete());
                }
                //error handling
                catch(Exception yes){
                    JOptionPane.showMessageDialog(frame, "Only Numbers");
        }
        btndeleteScooter.setBounds(343, 373, 122, 23);
        frame.getContentPane().add(btndeleteScooter);

        deleteScooterTf = new JTextField();
        deleteScooterTf.setColumns(10);
        deleteScooterTf.setBounds(343, 407, 135, 31);
        frame.getContentPane().add(deleteScooterTf);
    }


    class MyServiceListener implements ServiceListener {
        @Override
		public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
		public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
		public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            serviceinfo = event.getInfo();
        }
    }
        });
}
}