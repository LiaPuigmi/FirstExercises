package Exercises;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class EjerciciosSwing{
	public void panelOption() {
		
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

		String [] animals= {"Gato","Perro","Lobo","Dinosaurio"};
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Object result= JOptionPane.showInputDialog(null, "Que animal te gusta?", "Animal Quiz", 3, null, animals, "Lobo");
		ImageIcon icon1 = new ImageIcon(new ImageIcon("src/imagenes/gato.png").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
		ImageIcon icon2 = new ImageIcon(new ImageIcon("src/imagenes/perro.png").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
		ImageIcon icon3 = new ImageIcon(new ImageIcon("src/imagenes/lobo.png").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));
		ImageIcon icon4 = new ImageIcon(new ImageIcon("src/imagenes/dino.png").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));

        // Mostrar un JOptionPane con la imagen
		switch(result.toString()) {
		case "Gato":
	        JOptionPane.showMessageDialog(null, "Un gato bonito",  "", JOptionPane.INFORMATION_MESSAGE, icon1);
			break;
		case "Perro":
	        JOptionPane.showMessageDialog(null, "Un perro bonito",  "", JOptionPane.INFORMATION_MESSAGE, icon2);
			break;
		case "Lobo":
	        JOptionPane.showMessageDialog(null, "Un lobo bonito",  "", JOptionPane.INFORMATION_MESSAGE, icon3);
			break;
		case "Dinosaurio":
	        JOptionPane.showMessageDialog(null,"Un dino bonito",  "", JOptionPane.INFORMATION_MESSAGE, icon4);
			break;
		default:
			break;
	}
		System.out.println(result);
		
		Object resultado= JOptionPane.showConfirmDialog(null, "Te gusta la picsa con piña?");
		
		switch (resultado.toString()) {
		case "0":
			System.out.println("Yes");
			break;
		case "1":
			System.out.println("Nooup");
			break;
		case "2":
			System.out.println("Cancel");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + resultado.toString());
		}
		
	}

	
	public void preguntas() {
		ImageIcon icon1 = new ImageIcon(new ImageIcon("src/imagenes/gato.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon icon2 = new ImageIcon(new ImageIcon("src/imagenes/perro.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon icon3 = new ImageIcon(new ImageIcon("src/imagenes/lobo.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon icon4 = new ImageIcon(new ImageIcon("src/imagenes/dino.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		ImageIcon iconPicsa = new ImageIcon(new ImageIcon("src/imagenes/picsa.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

		 // Crear una lista de preguntas
        List<String> preguntas = new ArrayList<>(Arrays.asList("Te gustan los gatos?", "Te gustan los perros?", "Te gustan los lobos?", "Te gustan los dinosaurios?", "Te gusta la picsa?"));

        // Crear una lista de iconos
        List<Icon> iconos = new ArrayList<>(Arrays.asList(icon1, icon2, icon3, icon4, iconPicsa));

        // Crear una lista de textos de botones
        List<String> botones = new ArrayList<>(Arrays.asList("Si me flipan", "No me molan nada", "Siguiente"));

        for (int i = 0; i < preguntas.size(); i++) {
            // Seleccionar una pregunta, un icono y un texto de botón aleatorios
            String preguntaAleatoria = preguntas.get(i);
            Icon iconoAleatorio = iconos.get(i);

            // Crear un array de botones para el JOptionPane
            Object[] opciones = botones.toArray();

            // Mostrar el JOptionPane con la pregunta, el icono y los botones
            int seleccion = JOptionPane.showOptionDialog(null, preguntaAleatoria, "Un Diálogo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, iconoAleatorio, opciones, opciones[0]);

            // Si el usuario selecciona "Siguiente", continuar con la siguiente pregunta
            if (seleccion == 2) {
                continue;
            }
        }
    }
}
	

