package UD20.tarea2;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App{
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex2 frame = new ex2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
