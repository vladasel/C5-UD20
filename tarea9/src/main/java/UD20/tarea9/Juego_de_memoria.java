package UD20.tarea9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import java.awt.Color;

public class Juego_de_memoria extends JFrame {

	private JPanel contentPane;
	JToggleButton primerBoton = null;
	JToggleButton[] arrayBotones;
	private ArrayList<Color> coloresIniciales;

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
		
		crearArrayColores();

		// crear acccion
		ActionListener actList = new ActionListener() {
			public void actionPerformed(ActionEvent clickBoton) {
				// objeto tipo toggleButon, se utiliza para sacar el botón que a lanzado el
				// action
				JToggleButton boton = (JToggleButton) clickBoton.getSource();// funciona bien solo si todos los botones
																				// son
				// Del mismo tipo, en caso de mas tipos de botones, se crearían mas actions

				if (primerBoton == null) {
					primerBoton = boton;
				} else {
					// comprobar colores
				}
			}
		};

		// Crear array de togglebuttons
		arrayBotones = new JToggleButton[16];
		// rellenar el array
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i] = new JToggleButton(Integer.toString(i + 1));
			colorearBoton(arrayBotones[i]);
			arrayBotones[i].setSelected(true);
			contentPane.add(arrayBotones[i]);
		}

	}
	
	private void colorearBoton(JToggleButton boton) {
		int num;
		
		num = (int)(Math.random()*(coloresIniciales.size()));
		boton.setBackground(coloresIniciales.get(num));
		coloresIniciales.remove(num);
	}
	
	private void crearArrayColores() {
		coloresIniciales = new ArrayList<Color>();
		coloresIniciales.add(Color.CYAN);
		coloresIniciales.add(Color.CYAN);
		coloresIniciales.add(Color.BLUE);
		coloresIniciales.add(Color.BLUE);
		coloresIniciales.add(Color.GREEN);
		coloresIniciales.add(Color.GREEN);
		coloresIniciales.add(Color.MAGENTA);
		coloresIniciales.add(Color.MAGENTA);
		coloresIniciales.add(Color.ORANGE);
		coloresIniciales.add(Color.ORANGE);
		coloresIniciales.add(Color.RED);
		coloresIniciales.add(Color.RED);
		coloresIniciales.add(Color.YELLOW);
		coloresIniciales.add(Color.YELLOW);
		coloresIniciales.add(Color.PINK);
		coloresIniciales.add(Color.PINK);
	}
	
}
