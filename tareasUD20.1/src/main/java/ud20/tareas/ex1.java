package ud20.tareas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.SystemColor;

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
