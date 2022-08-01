package ud20.tareas;

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
					ex1 frame = new ex1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
