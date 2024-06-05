package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.controladorInicioSesion;

public class verDetallesHabitacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnHabitacion1;
	public JButton btnHabitacion2;
	public JButton btnHabitacion3;
	public JButton btnHabitacion4;
	public JButton btnHabitacion5;
	public JButton btnHabitacion6;
	public JButton btnHabitacion7;
	public JButton btnHabitacion8;
	public JButton btnHabitacion9;
	public JButton btnHabitacion10;
	public JButton btnHabitacion11;
	public JButton btnHabitacion12;
	public JButton btnHabitacion13;
	public JButton btnHabitacion14;
	public JButton btnHabitacion15;
	public JButton btnHabitacion16;
	public JButton btnSalir;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verDetallesHabitacion frame = new verDetallesHabitacion();
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
	public verDetallesHabitacion() {
		setTitle("Habitaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);	
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HABITACIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 24, 291, 32);
		contentPane.add(lblNewLabel);

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
		btnSalir.setBounds(233, 407, 96, 31);
		contentPane.add(btnSalir);
		
		btnHabitacion1 = new JButton("1");
		btnHabitacion1.setBounds(24, 92, 96, 46);
		contentPane.add(btnHabitacion1);
		
		btnHabitacion2 = new JButton("2");
		btnHabitacion2.setBounds(163, 92, 96, 46);
		contentPane.add(btnHabitacion2);
		
		btnHabitacion3 = new JButton("3");
		btnHabitacion3.setBounds(304, 92, 96, 46);
		contentPane.add(btnHabitacion3);
		
		btnHabitacion4 = new JButton("4");
		btnHabitacion4.setBounds(433, 92, 96, 46);
		contentPane.add(btnHabitacion4);
		
		btnHabitacion5 = new JButton("5");
		btnHabitacion5.setBounds(24, 177, 96, 46);
		contentPane.add(btnHabitacion5);
		
		btnHabitacion6 = new JButton("6");
		btnHabitacion6.setBounds(163, 177, 96, 46);
		contentPane.add(btnHabitacion6);
		
		btnHabitacion7 = new JButton("7");
		btnHabitacion7.setBounds(304, 177, 96, 46);
		contentPane.add(btnHabitacion7);
		
		btnHabitacion8 = new JButton("8");
		btnHabitacion8.setBounds(433, 177, 96, 46);
		contentPane.add(btnHabitacion8);
		
		btnHabitacion9 = new JButton("9");
		btnHabitacion9.setBounds(24, 260, 96, 46);
		contentPane.add(btnHabitacion9);
		
		btnHabitacion10 = new JButton("10");
		btnHabitacion10.setBounds(163, 260, 96, 46);
		contentPane.add(btnHabitacion10);
		
		btnHabitacion11 = new JButton("11");
		btnHabitacion11.setBounds(304, 260, 96, 46);
		contentPane.add(btnHabitacion11);
		
		btnHabitacion12 = new JButton("12");
		btnHabitacion12.setBounds(433, 260, 96, 46);
		contentPane.add(btnHabitacion12);
		
		btnHabitacion13 = new JButton("13");
		btnHabitacion13.setBounds(24, 345, 96, 46);
		contentPane.add(btnHabitacion13);
		
		btnHabitacion14 = new JButton("14");
		btnHabitacion14.setBounds(163, 345, 96, 46);
		contentPane.add(btnHabitacion14);
		
		btnHabitacion15 = new JButton("15");
		btnHabitacion15.setBounds(304, 345, 96, 46);
		contentPane.add(btnHabitacion15);
		
		btnHabitacion16 = new JButton("16");
		btnHabitacion16.setBounds(433, 345, 96, 46);
		contentPane.add(btnHabitacion16);

		lblNewLabel_1 = new JLabel("Sencillas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 69, 87, 13);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Múltiples");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 233, 87, 24);
		contentPane.add(lblNewLabel_2);
	}

}
