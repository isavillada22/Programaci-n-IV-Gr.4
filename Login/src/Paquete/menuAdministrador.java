package Paquete;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JButton btnVD = new JButton("Verificar Disponibilidad");
		btnVD.setBackground(new Color(255, 255, 255));
		btnVD.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		btnVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				verificarDisponibilidad s = new verificarDisponibilidad();
            	s.setVisible(true);		
			}
		});
		btnVD.setBounds(130, 110, 171, 40);
		contentPane.add(btnVD);
		
		JButton btnAH = new JButton("Agregar Habitación");
		btnAH.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnAH.setBackground(new Color(255, 255, 255));
		btnAH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				agregarHabitación s = new agregarHabitación();
            	s.setVisible(true);		
			}
		});
		btnAH.setBounds(130, 184, 171, 40);
		contentPane.add(btnAH);
		
		JButton btnEdH = new JButton("Editar Habitación");
		btnEdH.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnEdH.setBackground(new Color(255, 255, 255));
		btnEdH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				editarHabitación s = new editarHabitación();
            	s.setVisible(true);		
			}
		});
		btnEdH.setBounds(130, 261, 171, 40);
		contentPane.add(btnEdH);
		
		JButton btnElH = new JButton("Eliminar Habitación");
		btnElH.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnElH.setBackground(new Color(255, 255, 255));
		btnElH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				eliminarHabitacion s = new eliminarHabitacion();
            	s.setVisible(true);		
			}
		});
		btnElH.setBounds(130, 341, 171, 40);
		contentPane.add(btnElH);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
		btnSalir.setBounds(130, 409, 171, 40);
		contentPane.add(btnSalir);
	}
}
