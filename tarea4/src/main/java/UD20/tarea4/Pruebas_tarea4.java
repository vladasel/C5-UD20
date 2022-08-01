package UD20.tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pruebas_tarea4 extends JFrame {

	private JPanel contentPane;
	String text = "";
	JTextPane textPane;

	public Pruebas_tarea4() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text = "\nhas hecho click";
				textPane.setText(text);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				text = "se a abierto la ventana";
				textPane.setText(text);
			}

			public void windowClosing(WindowEvent e) {
				text += "\nse esta cerrando";
				textPane.setText(text);
			}

			public void windowClosed(WindowEvent e) {
				text += "\nse a cerrado";
				textPane.setText(text);
			}

			public void windowIconified(WindowEvent e) {
				text += "\nse a iconificado ";
				textPane.setText(text);
			}

			public void windowDeiconified(WindowEvent e) {
				text += "\nse a deiconificado ";
				textPane.setText(text);
			}

			public void windowActivated(WindowEvent e) {
				text += "\nventana activada ";
				textPane.setText(text);
			}

			public void windowDeactivated(WindowEvent e) {
				text += "\nvenana desactivada ";
				textPane.setText(text);

			}

			public void windowStateChanged(WindowEvent e) {
				text += "\nestado modificado ";
				textPane.setText(text);

			}

			public void windowGainedFocus(WindowEvent e) {
				text += "\nse a seleccionado ";
				textPane.setText(text);

			}

			public void windowLostFocus(WindowEvent e) {
				text += "\nno esta seleccionada,está en segundo plano ";
				textPane.setText(text);

			}
		});
		// frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Definir
		setBounds(100, 100, 450, 300);
		// content
		contentPane = new JPanel();
		// definir content
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// text area
		textPane = new JTextPane();// crear
		// Definir
		textPane.setBounds(154, 12, 250, 201);
		contentPane.add(textPane);

		// laber
		JLabel lblNewLabel = new JLabel("EVENTOS");// crear
		// Definir
		lblNewLabel.setBounds(39, 98, 70, 15);
		contentPane.add(lblNewLabel);
	}
}
