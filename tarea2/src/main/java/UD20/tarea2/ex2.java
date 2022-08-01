package UD20.tarea2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex2 extends JFrame {

	private JPanel contentPane;
	String botonPulsado = "";
	JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public ex2() {
		
		setTitle("Ventana con interaccion simple");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JButton Boton1 = new JButton("Boton 1");		
		Boton1.setBounds(110, 41, 89, 23);
		contentPane.add(Boton1);
		
		Boton1.addActionListener(accionClic);
		
		JButton Boton2 = new JButton("Boton 2");
		Boton2.setBounds(275, 41, 89, 23);
		contentPane.add(Boton2);
		
		Boton2.addActionListener(accionClic);
		
		lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setBounds(25, 118, 129, 56);
		contentPane.add(lblNewLabel);
	}
	
	ActionListener accionClic = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			lblNewLabel.setText("Has pulsado: "+e.getActionCommand());			
		}
	};
}
