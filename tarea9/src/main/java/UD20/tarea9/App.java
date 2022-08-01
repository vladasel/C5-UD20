package UD20.tarea9;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego_de_memoria frame = new Juego_de_memoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
