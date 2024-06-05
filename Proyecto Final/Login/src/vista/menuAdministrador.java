package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class menuAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnverificar;
	public JButton btnagregar;
	public JButton btneditar;
	public JButton btneliminar;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuAdministrador frame = new menuAdministrador();
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
	public menuAdministrador() {
		setTitle("Menu Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 528);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 220, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu Administrador");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(68, 33, 304, 40);
		contentPane.add(lblNewLabel);
		
		btnverificar = new JButton("Verificar Disponibilidad");
		btnverificar.setBackground(new Color(255, 255, 255));
		btnverificar.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnverificar.setBounds(130, 110, 171, 40);
		contentPane.add(btnverificar);
		
		btnagregar = new JButton("Agregar Habitación");
		btnagregar.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnagregar.setBackground(new Color(255, 255, 255));
		btnagregar.setBounds(130, 184, 171, 40);
		contentPane.add(btnagregar);
		
		btneditar = new JButton("Editar Habitación");
		btneditar.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btneditar.setBackground(new Color(255, 255, 255));
		btneditar.setBounds(130, 261, 171, 40);
		contentPane.add(btneditar);
		
		btneliminar = new JButton("Eliminar Habitación");
		btneliminar.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btneliminar.setBackground(new Color(255, 255, 255));
		btneliminar.setBounds(130, 341, 171, 40);
		contentPane.add(btneliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setBounds(130, 409, 171, 40);
		contentPane.add(btnSalir);
	}
}
