package UD20.tarea9;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Fotos extends Image {

	String name;
	private ArrayList<Image> fotosIniciales;

	public String getName() {
		return name;
	}

	public void setName(String ruta) {

		this.name = ruta;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeight(ImageObserver arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getProperty(String arg0, ImageObserver arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageProducer getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth(ImageObserver arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void ponerFoto(JToggleButton boton) {
		int num;

		num = (int) (Math.random() * (fotosIniciales.size()));
		boton.setIcon(new ImageIcon(fotosIniciales.get(num)));
		boton.setName(fotosIniciales.get(num).toString());
		fotosIniciales.remove(num);
	}

	public void crearArrayFotos() {
		fotosIniciales = new ArrayList<Image>();
		try {
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/alpaca-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/alpaca-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/cat-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/cat-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/crab-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/crab-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/dog-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/dog-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/duck-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/duck-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/panda-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/panda-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/pig-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/pig-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/walrus-64.png")));
			fotosIniciales.add(ImageIO.read(new FileInputStream("res/walrus-64.png")));
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
