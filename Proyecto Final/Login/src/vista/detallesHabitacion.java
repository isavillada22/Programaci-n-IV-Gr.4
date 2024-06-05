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

public class detallesHabitacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Titulo;
	public JLabel Tipo;
	public JLabel Capacidad;
	public JLabel Precio;
	public JLabel Comodidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detallesHabitacion frame = new detallesHabitacion();
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
	public detallesHabitacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Titulo = new JLabel("");
		Titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setBounds(143, 10, 600, 37);
		contentPane.add(Titulo);
		
		Tipo = new JLabel("");
		Tipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Tipo.setBounds(48, 76, 212, 37);
		contentPane.add(Tipo);
		
		Capacidad = new JLabel("");
		Capacidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Capacidad.setBounds(48, 123, 212, 37);
		contentPane.add(Capacidad);
		
		Precio = new JLabel("");
		Precio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Precio.setBounds(48, 170, 212, 37);
		contentPane.add(Precio);
		
		Comodidades = new JLabel("");
		Comodidades.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Comodidades.setBounds(48, 227, 784, 54);
		contentPane.add(Comodidades);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(48, 204, 414, 54);
		contentPane.add(lblNewLabel_1_3_2);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(377, 291, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    dispose();
		    }
		});
	}
}
