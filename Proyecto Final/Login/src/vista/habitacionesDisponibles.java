package vista;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class habitacionesDisponibles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHabitacion1;
	private JTextField txtHabitacion2;
	private JTextField txtHabitacion3;
	private JTextField txtHabitacion4;
	private JTextField txtHabitacion5;
	private JTextField txtHabitacion6;
	private JTextField txtHabitacion7;
	private JTextField txtHabitacion8;
	private JTextField txtHabitacion9;
	private JTextField txtHabitacion10;
	private JTextField txtHabitacion11;
	private JTextField txtHabitacion12;
	private JTextField txtHabitacion13;
	private JTextField txtHabitacion14;
	private JTextField txtHabitacion15;
	private JTextField txtHabitacion16;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					habitacionesDisponibles frame = new habitacionesDisponibles();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public habitacionesDisponibles() {
		setTitle("Habitaciones Disponibles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HABITACIONES DISPONIBLES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 24, 291, 32);
		contentPane.add(lblNewLabel);
		
		txtHabitacion1 = new JTextField();
		txtHabitacion1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion1.setText("1");
		txtHabitacion1.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion1.setBounds(24, 92, 96, 46);
		contentPane.add(txtHabitacion1);
		txtHabitacion1.setColumns(10);
		
		txtHabitacion2 = new JTextField();
		txtHabitacion2.setText("2");
		txtHabitacion2.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion2.setColumns(10);
		txtHabitacion2.setBounds(163, 92, 96, 46);
		contentPane.add(txtHabitacion2);
		
		txtHabitacion3 = new JTextField();
		txtHabitacion3.setText("3");
		txtHabitacion3.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion3.setColumns(10);
		txtHabitacion3.setBounds(304, 92, 96, 46);
		contentPane.add(txtHabitacion3);
		
		txtHabitacion4 = new JTextField();
		txtHabitacion4.setText("4");
		txtHabitacion4.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion4.setColumns(10);
		txtHabitacion4.setBounds(433, 92, 96, 46);
		contentPane.add(txtHabitacion4);
		
		txtHabitacion5 = new JTextField();
		txtHabitacion5.setText("5");
		txtHabitacion5.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion5.setColumns(10);
		txtHabitacion5.setBounds(24, 177, 96, 46);
		contentPane.add(txtHabitacion5);
		
		txtHabitacion6 = new JTextField();
		txtHabitacion6.setText("6");
		txtHabitacion6.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion6.setColumns(10);
		txtHabitacion6.setBounds(163, 177, 96, 46);
		contentPane.add(txtHabitacion6);
		
		txtHabitacion7 = new JTextField();
		txtHabitacion7.setText("7");
		txtHabitacion7.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion7.setColumns(10);
		txtHabitacion7.setBounds(304, 177, 96, 46);
		contentPane.add(txtHabitacion7);
		
		txtHabitacion8 = new JTextField();
		txtHabitacion8.setText("8");
		txtHabitacion8.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion8.setColumns(10);
		txtHabitacion8.setBounds(433, 177, 96, 46);
		contentPane.add(txtHabitacion8);
		
		txtHabitacion9 = new JTextField();
		txtHabitacion9.setText("9");
		txtHabitacion9.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion9.setColumns(10);
		txtHabitacion9.setBounds(24, 260, 96, 46);
		contentPane.add(txtHabitacion9);
		
		txtHabitacion10 = new JTextField();
		txtHabitacion10.setText("10");
		txtHabitacion10.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion10.setColumns(10);
		txtHabitacion10.setBounds(163, 260, 96, 46);
		contentPane.add(txtHabitacion10);
		
		txtHabitacion11 = new JTextField();
		txtHabitacion11.setText("11");
		txtHabitacion11.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion11.setColumns(10);
		txtHabitacion11.setBounds(304, 260, 96, 46);
		contentPane.add(txtHabitacion11);
		
		txtHabitacion12 = new JTextField();
		txtHabitacion12.setText("12");
		txtHabitacion12.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion12.setColumns(10);
		txtHabitacion12.setBounds(433, 260, 96, 46);
		contentPane.add(txtHabitacion12);
		
		txtHabitacion13 = new JTextField();
		txtHabitacion13.setText("13");
		txtHabitacion13.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion13.setColumns(10);
		txtHabitacion13.setBounds(24, 345, 96, 46);
		contentPane.add(txtHabitacion13);
		
		txtHabitacion14 = new JTextField();
		txtHabitacion14.setText("14");
		txtHabitacion14.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion14.setColumns(10);
		txtHabitacion14.setBounds(163, 345, 96, 46);
		contentPane.add(txtHabitacion14);
		
		txtHabitacion15 = new JTextField();
		txtHabitacion15.setText("15");
		txtHabitacion15.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion15.setColumns(10);
		txtHabitacion15.setBounds(304, 345, 96, 46);
		contentPane.add(txtHabitacion15);
		
		txtHabitacion16 = new JTextField();
		txtHabitacion16.setText("16");
		txtHabitacion16.setHorizontalAlignment(SwingConstants.CENTER);
		txtHabitacion16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHabitacion16.setColumns(10);
		txtHabitacion16.setBounds(433, 345, 96, 46);
		contentPane.add(txtHabitacion16);
		
		lblNewLabel_1 = new JLabel("Sencillas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 69, 87, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Múltiples");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 233, 87, 24);
		contentPane.add(lblNewLabel_2);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(233, 407, 96, 31);
		contentPane.add(btnSalir);
		
		List<String> disponibles = new ArrayList<>();
		try {
			 FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\HabitacionesDisponibles.txt");
			 BufferedReader lector = new BufferedReader(archivo);
			 String linea;
			 
			 while((linea = lector.readLine()) != null) {
                   String numeroHabitacion = linea;
                   disponibles.add(numeroHabitacion);
               } 
			 
			 lector.close();
		 }catch(Exception e){
			 System.out.print("Error: " + e.getMessage());
		 }
		String habitacion;
		boolean disponible;
		
		habitacion = txtHabitacion1.getText();
		disponible = disponibles.contains(habitacion);
		
		if(disponible) {
			txtHabitacion1.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion1.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion2.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion2.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion2.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion3.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion3.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion3.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion4.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion4.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion4.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion5.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion5.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion5.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion6.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion6.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion6.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion7.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion7.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion7.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion8.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion8.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion8.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion9.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion9.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion9.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion10.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion10.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion10.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion11.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion11.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion11.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion12.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion12.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion12.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion13.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion13.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion13.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion14.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion14.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion14.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion15.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion15.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion15.setBackground(new Color(255, 0, 0));
		}
		
		habitacion = txtHabitacion16.getText();
		disponible = disponibles.contains(habitacion);
		if(disponible) {
			txtHabitacion16.setBackground(new Color(0, 255, 64));
		}
		else {
			txtHabitacion16.setBackground(new Color(255, 0, 0));
		}
	}
}
