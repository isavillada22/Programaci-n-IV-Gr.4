package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class editarHabitación extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Titulo;
	public JButton btnEditar;
	public JTextField textPrecio;
	public JTextField textDispo;
	public JTextField textComodidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editarHabitación frame = new editarHabitación();
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
	public editarHabitación() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Titulo = new JLabel("Habitación # 16");
		Titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo.setBounds(140, 10, 182, 29);
		contentPane.add(Titulo);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 82, 125, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Disponibilidad(SI/NO):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(36, 159, 142, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Comodidades:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(36, 233, 125, 26);
		contentPane.add(lblNewLabel_1_2);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(206, 81, 153, 34);
		contentPane.add(textPrecio);
		
		textDispo = new JTextField();
		textDispo.setColumns(10);
		textDispo.setBounds(206, 158, 153, 34);
		contentPane.add(textDispo);
		
		textComodidades = new JTextField();
		textComodidades.setColumns(10);
		textComodidades.setBounds(206, 232, 653, 34);
		contentPane.add(textComodidades);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(377, 302, 85, 29);
		contentPane.add(btnEditar);
	}

}
