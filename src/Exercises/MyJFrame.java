package Exercises;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{

	private static final long serialVersionUID= 1L;
	MyJFrame(int width, int height, boolean visible, boolean resizable, Color color){
		setBounds(250,250,width,height);
		setVisible(visible);
		setResizable(resizable);
		getContentPane().setBackground(color);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagenes/favicon.ico"));
		setTitle("Fundacio Esplai");
		
	}
}
