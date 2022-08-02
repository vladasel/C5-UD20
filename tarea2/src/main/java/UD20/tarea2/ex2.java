package UD20.tarea2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex2 extends JFrame {

	private JPanel contentPane;
	JLabel infoPulsadoLbl;
	JButton Boton1;
	JButton Boton2;

	/**
	 * Create the frame.
	 */
	public ex2() {
		//config ventana
		setTitle("Ventana con interaccion simple");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		//creacion boton1
		Boton1 = new JButton("Boton 1");		
		Boton1.setBounds(110, 41, 89, 23);
		contentPane.add(Boton1);				
		
		//creacion boton2
		Boton2 = new JButton("Boton 2");
		Boton2.setBounds(275, 41, 89, 23);
		contentPane.add(Boton2);		
		
		//añadimos actionListener
		Boton1.addActionListener(accionClic);
		Boton2.addActionListener(accionClic);
		
		//creacion etiqueta
		infoPulsadoLbl = new JLabel("Has pulsado: ");
		infoPulsadoLbl.setBounds(25, 118, 129, 56);
		contentPane.add(infoPulsadoLbl);
	}
	
	ActionListener accionClic = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//sobreescribimos texto etiqueta
			infoPulsadoLbl.setText("Has pulsado: "+e.getActionCommand());			
		}
	};
}
