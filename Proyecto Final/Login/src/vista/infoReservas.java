package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import controlador.controladorRealizarReserva2;
import modelo.Reserva;

import javax.swing.JButton;

public class infoReservas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Titulo2;
	public JLabel Titulo;
	public JLabel Texto;
	public JButton btnSalir;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infoReservas frame = new infoReservas();
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
	public infoReservas() {
		setTitle("Modificar Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Titulo2 = new JLabel("Reservas a Nombre de ");
		Titulo2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo2.setBounds(10, 22, 229, 45);
		contentPane.add(Titulo2);

		Texto = new JLabel();
		Texto.setHorizontalAlignment(SwingConstants.CENTER);
		Texto.setVerticalAlignment(SwingConstants.TOP);
		Texto.setBounds(39, 101, 662, 143);
		contentPane.add(Texto);

		btnSalir = new JButton("OK");
		btnSalir.setBounds(250, 327, 85, 21);
		contentPane.add(btnSalir);
		
		Titulo = new JLabel("");
		Titulo.setHorizontalAlignment(SwingConstants.LEFT);
		Titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo.setBounds(225, 22, 293, 45);
		contentPane.add(Titulo);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroHabitacion = JOptionPane.showInputDialog(null, "Ingrese el número de la habitación que desea modificar:");
				while (!Texto.getText().contains(numeroHabitacion)) {
					JOptionPane.showMessageDialog(null, "El número de habitación no coincide con sus reservas");
					numeroHabitacion = JOptionPane.showInputDialog(null, "Ingrese el número de la habitación que desea modificar:");
				}
				int num = Integer.parseInt(numeroHabitacion);
				Reserva.eliminarReserva(Reserva.reservas, Titulo.getText(), num);
				vista.realizarReserva s = new vista.realizarReserva();
				new controladorRealizarReserva2(s, num);
				s.Titulo.setText("Modificar Reserva Habitacion " + num);
				s.setTitle("Modificar Reserva");
				s.btnReservar.setText("Modificar");
				dispose();
				s.setVisible(true);
			}
		});
	}
}
