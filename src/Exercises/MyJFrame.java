package Exercises;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{

	
	private static final long serialVersionUID= 1L;
	public MyJFrame() {
		// TODO Auto-generated constructor stub
	}
	MyJFrame(int width, int height, boolean visible, boolean resizable, Color color, Image icon){
		setBounds(250,250,width,height);
		setVisible(visible);
		setResizable(resizable);
		getContentPane().setBackground(color);
		//Image icon=Toolkit.getDefaultToolkit().getImage(getClass().getResource("../imagenes/favicon.png"));
		
	    setIconImage(icon);
		setTitle("Fundacio Esplai");

	}
	
	public void lalala() {
		System.out.println(getClass().getResource("../imagenes/favicon.png"));
	}
}
