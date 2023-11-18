package Exercises;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjerciciosSwing{
	public void panelOption() {
		/*
		JOptionPane.showMessageDialog(null, "Hola");
		JOptionPane.showMessageDialog(null, "Que tal?", "Pregunta", 3);
		JOptionPane.showMessageDialog(null, "Todo mal", "Respuesta", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "El total es:\n    120€(IVA 10 % no inc.\n    132€ (con IVA inc.)", "Ticket", 1);
		
		String nombre=JOptionPane.showInputDialog("Como te llamas?");
		System.out.println(nombre);
		do {
			JOptionPane.showMessageDialog(null, "Si no me dices tu nombre no avanzamos", "Respuesta", JOptionPane.WARNING_MESSAGE);
			nombre=JOptionPane.showInputDialog("Como te llamas?");
		}while(nombre==null || nombre.isEmpty());
		JOptionPane.showMessageDialog(null, nombre, "Tu nombre", JOptionPane.INFORMATION_MESSAGE);
		
		String option;
		boolean firstTime=true;
		do {
			if(!firstTime) {
				JOptionPane.showMessageDialog(null, "Pon un numero", "Respuesta", JOptionPane.WARNING_MESSAGE);
			}
			option=JOptionPane.showInputDialog("QueQue Operations menu:\n1.Insert\n2.Delete\n3.Display\n4.Exit\n\nEnter your option:");
			firstTime=false;
		}while(option==null || option.isEmpty());
		
		switch(option) {
			case "1":
				JOptionPane.showMessageDialog(null, "Que tal?", "Insert", 3);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Que tal?", "Delete", 2);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Que tal?", "Display", 1);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "Que tal?", "Exit", 0);
				break;
			default:
				break;
		}
		*/
		String [] animals= {"Gato","Perro","Lobo","Dinosaurio"};
		Object result= JOptionPane.showInputDialog(null, "Que animal te gusta?", "Animal Quiz", 3, null, animals, "Lobo");
		ImageIcon icon1=new ImageIcon(getClass().getResource("../media/gato.png"));
		ImageIcon icon2=new ImageIcon("../media/perro.png");
		ImageIcon icon3=new ImageIcon("../media/lobo.png");
		ImageIcon icon4=new ImageIcon("../media/dino.png");
		
		switch(result.toString()) {
		case "Gato":
			JOptionPane.showMessageDialog(null, icon1);
			break;
		case "Perro":
			JOptionPane.showMessageDialog(null, icon2);
			break;
		case "Lobo":
			JOptionPane.showMessageDialog(null, icon3);
			break;
		case "Dinosaurio":
			JOptionPane.showMessageDialog(null, icon4);
			break;
		default:
			break;
	}
		System.out.println(result);
				
	}
}
