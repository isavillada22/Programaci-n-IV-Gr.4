package vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class menuCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnBuscar;
	public JButton btnVerDetalles;
	public JButton btnRealizarReserva;
	public JButton btnModificar;
	public JButton btnCancelar;
	public JButton btnHistorial;
	public JButton btnSalir;

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
		
		btnBuscar = new JButton("Buscar Habitaciones Disponibles");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnBuscar.setBounds(108, 85, 216, 40);
		contentPane.add(btnBuscar);
		
		btnVerDetalles = new JButton("Ver Detalles de Habitación");
		btnVerDetalles.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnVerDetalles.setBackground(new Color(255, 255, 255));
		btnVerDetalles.setBounds(108, 146, 216, 40);
		contentPane.add(btnVerDetalles);
		
		btnRealizarReserva = new JButton("Realizar una Reserva");
		btnRealizarReserva.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnRealizarReserva.setBackground(new Color(255, 255, 255));
		btnRealizarReserva.setBounds(130, 208, 171, 40);
		contentPane.add(btnRealizarReserva);
		
		btnModificar = new JButton("Modificar Reserva");
		btnModificar.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnModificar.setBackground(new Color(255, 255, 255));
		btnModificar.setBounds(130, 268, 171, 40);
		contentPane.add(btnModificar);
		
		btnCancelar = new JButton("Cancelar Reserva");
		btnCancelar.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnCancelar.setBackground(new Color(255, 255, 255));
		btnCancelar.setBounds(130, 327, 171, 40);
		contentPane.add(btnCancelar);
		
		btnHistorial = new JButton("Ver Historial de Reservas");
		btnHistorial.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnHistorial.setBackground(new Color(255, 255, 255));
		btnHistorial.setBounds(130, 389, 171, 40);
		contentPane.add(btnHistorial);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(130, 449, 171, 33);
		contentPane.add(btnSalir);
	}
}