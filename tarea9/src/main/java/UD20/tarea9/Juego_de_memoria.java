package UD20.tarea9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Juego_de_memoria extends JFrame {

	private JPanel contentPane;
	JToggleButton primerBoton = null;
	JToggleButton[] arrayBotones;

	/**
	 * Create the frame.
	 */
	public Juego_de_memoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));

		// crear acccion
		ActionListener actList = new ActionListener() {
			public void actionPerformed(ActionEvent clickBoton) {
				// objeto tipo toggleButon, se utiliza para sacar el botón que a lanzado el
				// action
				JToggleButton boton = (JToggleButton) clickBoton.getSource();// funciona bien solo si todos los botones
																				// son
				// Del mismo tipo, en caso de mas tipos de botones, se crearían mas actions

				if (primerBoton == null) {// si no hay ningún boton "clicado"
					primerBoton = boton;// el boton que clicamos, lo consideramos como primer boton

				} else {
					// comprobar colores
					if (primerBoton.getBackground() == boton.getBackground()) {

						primerBoton.setBackground(Color.black);
						boton.setBackground(Color.black);
					} else {
						primerBoton = null;
					}
				}
			}
		};

		// Crear array de togglebuttons
		arrayBotones = new JToggleButton[16];
		// rellenar el array
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i] = new JToggleButton(Integer.toString(i + 1));
			contentPane.add(arrayBotones[i]);
		}

	}
}
