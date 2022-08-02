package UD20.tarea9;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JToggleButton;

public class Juego_de_memoria extends JFrame {

	private JPanel contentPane;
	JToggleButton primerBoton;
	JToggleButton[] arrayBotones;
	private ArrayList<Color> coloresIniciales;
	private ArrayList<Image> fotosIniciales;

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
		crearArrayFotos();

		// Crear array de togglebuttons
		arrayBotones = new JToggleButton[16];
		// rellenar el array
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i] = new JToggleButton();
			//colorearBoton(arrayBotones[i]);
			ponerFoto(arrayBotones[i]);
			arrayBotones[i].setSelected(true);
			contentPane.add(arrayBotones[i]);
			arrayBotones[i].addActionListener(actList);
		}

	}
	
	//crear acccion
	ActionListener actList = new ActionListener() {
		public void actionPerformed(ActionEvent clickBoton) {
			//comparar colores --> si son iguales, desactivar botones
							//--> si son diferentes, volver a situacion inicial			
			
			// objeto tipo toggleButon, se utiliza para sacar el botón que ha lanzado el action
			JToggleButton boton = (JToggleButton) clickBoton.getSource();// funciona bien solo si todos los botones son
															// del mismo tipo, en caso de mas tipos de botones, se crearían mas actions
			
			
			if (primerBoton == null) {// si no hay ningún boton "clicado"
				primerBoton = boton;// el boton que clicamos, lo consideramos como primer boton				
			} else {				
				//comprobar primero que no sea el mismo boton para que no se anule a si mismo
				if(boton!=primerBoton) {
					// comprobar colores
					if (primerBoton.getBackground().equals(boton.getBackground())) {
						primerBoton.setEnabled(false);
						boton.setEnabled(false);
					} else {
						primerBoton.setSelected(true);
						boton.setSelected(true);						
					}
					primerBoton = null;					
				}				
			}
		}
	};
	
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
	
	private void ponerFoto(JToggleButton boton) {
		int num;
		
		num = (int)(Math.random()*(fotosIniciales.size()));
		boton.setIcon(new ImageIcon(fotosIniciales.get(num)));
		fotosIniciales.remove(num);
	}
	
	private void crearArrayFotos() {
		fotosIniciales = new ArrayList<Image>();
		try {
			fotosIniciales.add( ImageIO.read( new FileInputStream("res/alpaca-64.png") ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/alpaca-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/cat-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/cat-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/crab-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/crab-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/dog-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/dog-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/duck-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/duck-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/panda-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/panda-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/pig-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/pig-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/walrus-64.png" ) ) );
			fotosIniciales.add( ImageIO.read( new FileInputStream( "res/walrus-64.png" ) ) );
		  } catch (IOException ex) {
		    System.out.println(ex);
		  }
	}
}
