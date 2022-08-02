package UD20.tarea9;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Juego_de_memoria extends JFrame {

	private JPanel contentPane;	
	JToggleButton[] arrayBotones;
	private ArrayList<Color> coloresIniciales;
	
	Action data = new Action();

	/**
	 * Create the frame.
	 */
	public Juego_de_memoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1, 1, 492, 57);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Intentos: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(59, 11, 345, 35);
		panel_1.add(lblNewLabel);
		
		JPanel cartas = new JPanel();
		cartas.setBounds(1, 57, 492, 333);
		contentPane.add(cartas);
		cartas.setLayout(new GridLayout(4, 4, 0, 0));
		
		crearArrayColores();		

		// Crear array de togglebuttons
		arrayBotones = new JToggleButton[16];
		// rellenar el array
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i] = new JToggleButton(Integer.toString(i + 1));
			colorearBoton(arrayBotones[i]);
			arrayBotones[i].setSelected(true);
			cartas.add(arrayBotones[i]);
			arrayBotones[i].addActionListener(data);
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
