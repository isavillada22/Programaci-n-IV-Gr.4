package Paquete;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class menuCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuCliente frame = new menuCliente();
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
	public menuCliente() {
		setTitle("Menu Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 220, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Cliente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(66, 33, 304, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnBHD = new JButton("Buscar Habitaciones Disponibles");
		btnBHD.setBackground(new Color(255, 255, 255));
		btnBHD.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnBHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				buscarHabitacionesDisponibles s = new buscarHabitacionesDisponibles();
            	s.setVisible(true);					
			}
		});
		btnBHD.setBounds(108, 85, 216, 40);
		contentPane.add(btnBHD);
		
		JButton btnVDH = new JButton("Ver Detalles de Habitación");
		btnVDH.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnVDH.setBackground(new Color(255, 255, 255));
		btnVDH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				verDetallesHabitacion s = new verDetallesHabitacion();
            	s.setVisible(true);					
			}
		});
		btnVDH.setBounds(108, 146, 216, 40);
		contentPane.add(btnVDH);
		
		JButton btnRR = new JButton("Realizar una Reserva");
		btnRR.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnRR.setBackground(new Color(255, 255, 255));
		btnRR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				realizarReserva s = new realizarReserva();
            	s.setVisible(true);					
			}
		});
		btnRR.setBounds(130, 208, 171, 40);
		contentPane.add(btnRR);
		
		JButton btnMR = new JButton("Modificar Reserva");
		btnMR.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnMR.setBackground(new Color(255, 255, 255));
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				modificarReserva s = new modificarReserva();
            	s.setVisible(true);					
			}
		});
		btnMR.setBounds(130, 268, 171, 40);
		contentPane.add(btnMR);
		
		JButton btnCR = new JButton("Cancelar Reserva");
		btnCR.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnCR.setBackground(new Color(255, 255, 255));
		btnCR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				cancelarReserva s = new cancelarReserva();
            	s.setVisible(true);					
			}
		});
		btnCR.setBounds(130, 327, 171, 40);
		contentPane.add(btnCR);
		
		JButton btnVHR = new JButton("Ver Historial de Reservas");
		btnVHR.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnVHR.setBackground(new Color(255, 255, 255));
		btnVHR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				verHistorialReservas s = new verHistorialReservas();
            	s.setVisible(true);					
			}
		});
		btnVHR.setBounds(130, 389, 171, 40);
		contentPane.add(btnVHR);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		btnSalir.setBounds(130, 449, 171, 33);
		contentPane.add(btnSalir);
	}
}