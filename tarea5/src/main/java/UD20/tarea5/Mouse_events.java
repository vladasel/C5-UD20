package UD20.tarea5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Mouse_events extends JFrame {

	private JPanel contentPane;
	String text = "";
	JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public Mouse_events() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(136, 12, 117, 25);
		contentPane.add(btnNewButton);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				text += "\n arastrar";
				textArea.setText(text);
			}
			/*
			 * @Override public void mouseMoved(MouseEvent e) { text += "\n moviendo ratón";
			 * textArea.setText(text); }
			 */
		});
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				text += "\nse a hecho click";
				textArea.setText(text);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				text += "\n el ratón a entrado en el área ";
				textArea.setText(text);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				text += "\n el ratón a salido del área ";
				textArea.setText(text);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				text += "\n se a presionado el ratón";
				textArea.setText(text);
			}
		});
		textArea.setBounds(22, 45, 391, 144);
		contentPane.add(textArea);
	}

}
