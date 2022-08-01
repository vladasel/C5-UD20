package ud20.tarea7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambioPesetas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField textField;
	private boolean cambioAPtas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambioPesetas frame = new CambioPesetas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CambioPesetas() {
		cambioAPtas = true;
		
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(37, 10, 119, 26);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(161, 15, 96, 19);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(267, 10, 62, 26);
		contentPane.add(lblResultado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(330, 15, 96, 19);
		contentPane.add(textField);
		
		final JButton btnEurPta = new JButton("Euros a ptas");
		btnEurPta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cambioAPtas) {
					cambioAPtas = false;
					btnEurPta.setText("Ptas a euros");
				} else {
					cambioAPtas = true;
					btnEurPta.setText("Euros a ptas");
				}
			}
		});
		btnEurPta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEurPta.setBounds(91, 46, 105, 26);
		contentPane.add(btnEurPta);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCambiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCambiar.setBounds(233, 46, 105, 26);
		contentPane.add(btnCambiar);
	}
}
