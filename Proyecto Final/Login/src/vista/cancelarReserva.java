package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.controladorMenuCliente;
import modelo.Reserva;

public class cancelarReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Titulo2;
	public JLabel Titulo;
	public JLabel Texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancelarReserva frame = new cancelarReserva();
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
	public cancelarReserva() {
		setTitle("Cancelar Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Titulo2 = new JLabel("Reservas a Nombre de ");
		Titulo2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo2.setBounds(99, 22, 229, 45);
		contentPane.add(Titulo2);

		Texto = new JLabel();
		Texto.setHorizontalAlignment(SwingConstants.CENTER);
		Texto.setVerticalAlignment(SwingConstants.TOP);
		Texto.setBounds(39, 101, 535, 143);
		contentPane.add(Texto);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(250, 327, 85, 21);
		contentPane.add(btnNewButton);

		Titulo = new JLabel("");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo.setBounds(313, 22, 293, 45);
		contentPane.add(Titulo);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroHabitacion = JOptionPane.showInputDialog(null, "Ingrese el número de la habitación a la que desea cancelar la reserva:");
				while (!Texto.getText().contains(numeroHabitacion)) {
					JOptionPane.showMessageDialog(null, "El número de habitación no coincide con sus reservas");
					numeroHabitacion = JOptionPane.showInputDialog(null, "Ingrese el número de la habitación a la que desea cancelar la reserva:");
				}
				int num = Integer.parseInt(numeroHabitacion);
				for(int i = 0; i < Reserva.reservas.size();i++) {
					Reserva reserva = Reserva.reservas.get(i);
					if(reserva.nombre.equals(Titulo.getText()) && (reserva.numeroHabitacion == num)) {
						Reserva.cancelarReserva(reserva);
						dispose();
				        vista.menuCliente s = new vista.menuCliente();
				        new controladorMenuCliente(s);
				        s.setVisible(true);
					}
					else {
					}
				}
			}
		});
	}
}
