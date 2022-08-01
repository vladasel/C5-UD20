package ud20.tarea3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cuenta_click extends JFrame {

	private JPanel contentPane;
	private JTextField txtClickBoton;
	private JTextField txtClickBoton_1;
	int contador1 = 0;
	int contador2 = 0;

	/**
	 * Create the frame.
	 */
	public Cuenta_click() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// crear boton 1
		JButton btnNewButton = new JButton("Boton 1");
		// añadir action al boton 1
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contador1++;// incrementamos contador por cada click
				txtClickBoton.setText("Clicks boton1: " + contador1);// mostramos

			}
		});
		// situar boton
		btnNewButton.setBounds(50, 96, 117, 25);
		// añadirlo al contenedor
		contentPane.add(btnNewButton);

		// crear boton2
		JButton btnNewButton_1 = new JButton("Boton 2");
		// Añadir action
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				txtClickBoton_1.setText("Clicks boton1: " + contador2);
			}
		});
		btnNewButton_1.setBounds(236, 96, 117, 25); // situar el boton
		contentPane.add(btnNewButton_1);// añadirlo al contenedor

		// crear textfield
		txtClickBoton = new JTextField();
		// propiedades del textfiels
		txtClickBoton.setText("Click boton 1: ");
		txtClickBoton.setEditable(false);
		txtClickBoton.setBounds(35, 27, 114, 19);
		contentPane.add(txtClickBoton);
		txtClickBoton.setColumns(10);

		// crear textfield
		txtClickBoton_1 = new JTextField();
		// propiedades del textfields
		txtClickBoton_1.setText("Click boton 2: ");
		txtClickBoton_1.setEditable(false);
		txtClickBoton_1.setBounds(236, 27, 114, 19);
		contentPane.add(txtClickBoton_1);
		txtClickBoton_1.setColumns(10);
	}
}
