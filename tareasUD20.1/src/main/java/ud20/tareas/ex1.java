package ud20.tareas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ex1 extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ex1() {
		
		setTitle("Cambia el tamaño");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
				
		JLabel lblNewLabel = new JLabel("User, cambia el tamaño de la ventana");
		contentPane.add(lblNewLabel);		
		
	}
}
