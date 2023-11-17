package Exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.SelectStatementImpl;

public class JDBC {
	
	void conecxion() {
		
		// Ponemos la URL de la BBDD a la que queremos conectarnos mediante a JDBC
		final String url = "jdbc:mysql://localhost:3306/db_test";
		// Accesos a la BBDD
		final String user = "root";
		final String pass = "admin";
		Connection connection;
		try {
			
			connection = DriverManager.getConnection(url, user, pass);
			Statement statement = connection.createStatement();
			Menu(statement);
			statement.close(); // Cerrando statement
			connection.close(); // Cerrando connection
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	void crear(String nombreInsert, int edadInsert, String nacionalidadInsert, Statement statement) {
		try {
			statement.executeUpdate("INSERT INTO db_test.usuarios(Nombre, Edad, Nacionalidad) VALUES ('"+nombreInsert+"',"+edadInsert+", '"+nacionalidadInsert+"')");
			mostrar(statement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void updata(Statement statement, String nameTabla, int id, String newName) {
		if(!nameTabla.equals("edad")) {
			newName="'"+newName+"'";
		}
		try {
			statement.executeUpdate("UPDATE db_test.usuarios SET "+nameTabla+"="+newName+" WHERE id_usuarios="+id);
			mostrar(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	void seleccionColumna(Statement statement, String nombreColumna) {
		ResultSet result;
		try {
			result = statement.executeQuery("SELECT "+nombreColumna+" FROM db_test.usuarios");
			System.out.print(nombreColumna+": \n");
			if(nombreColumna.equals("edad")) {
				while(result.next()){
	            //Display values
	            System.out.print(result.getInt(nombreColumna)+"\n");
				}
			}else {
				while(result.next()){
		            //Display values
		            System.out.print(result.getString(nombreColumna)+"\n");
					}
			}
			
			result.close(); // Cerrando resultset
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void borrar(Statement statement, int id) {
		try {
			String sql = "DELETE FROM db_test.usuarios WHERE id_usuarios="+id;
			statement.executeUpdate(sql);
			final String QUERY = "SELECT id_usuarios, nombre, edad, nacionalidad FROM db_test.usuarios";
	         ResultSet result = statement.executeQuery(QUERY);
	         while(result.next()){
	            //Display values
	            System.out.print("ID: " + result.getInt("id_usuarios"));
	            System.out.print(", Nombre: " + result.getString("nombre"));
	            System.out.print(", Edad: " + result.getInt("edad"));
	            System.out.println(", Nacionalidad: " + result.getString("nacionalidad"));
	         }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void mostrar(Statement statement) {
		try {
		ResultSet result = statement.executeQuery("SELECT * FROM db_test.usuarios");
		ResultSetMetaData rsmd = result.getMetaData();
		int columnCount = rsmd.getColumnCount();
		// Recorriendo los nombres de los encabezados de la tabla
		for (int i = 1; i < columnCount; i++) {
			System.out.printf("%10s", rsmd.getColumnName(i).toString());
		}
		int spacing = ((columnCount * 10) - 5);
		String textoFormateado = String.format("%n%" + spacing + "s", " ", " ").replace(' ', '-');
		System.out.println(textoFormateado);
		// Mostrando el resultado
		while (result.next()) {
			int id_usuarios = result.getInt("id_usuarios");
			String nombre = result.getString("Nombre");
			int edad = result.getInt("Edad");
			System.out.printf("%10d%10s%10d%n", id_usuarios, nombre, edad);
			
		}
		result.close(); // Cerrando resultset
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	int maxId(Statement statement) {
		int maxId = 0;
		try {
		String query = "SELECT MAX(id_usuarios) FROM db_test.usuarios";
		ResultSet rs=statement.executeQuery(query);			
		//Extact result from ResultSet rs
		while(rs.next()){
		    maxId=rs.getInt("MAX(id_usuarios)");		
		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxId;
	}
	
	public void Menu(Statement statement) {
		String mensaje= "\u001B[36m"+"Escoja que quiere hacer:\n"
				+ "1-Insert\n"
				+ "2-Update\n"
				+ "3-Select All\n"
				+ "4-Select column\n"
				+ "5-Delete\n"
				+ "6-Salir\n"
				+"\u001B[0m";
		int opcion= 0;
		do {
			opcion= imputUserIntBetween(mensaje, 1, 6);
			
				switch (opcion) {
				case 1: 
					String nombre=inputUser("Inserta el nombre:");
					int edad=imputUserIntBetween("Inserta la edad:", 0, 150);
					String nacionalidad=inputUser("Inserta la nacionalidad:");
					crear(nombre, edad, nacionalidad, statement);
					break;
				case 2:
					int id = imputUserIntBetween("Inserta el id:", 1, maxId(statement));
					String nameTable=inputUser("Inserta el nombre de la columna:");
					String newName=inputUser("Inserta el nuevo cambio:");
					updata(statement, nameTable, id, newName);
					break;
				case 3:
					mostrar(statement);
					break;
				case 4:
					String nombreColumn=inputUser("Inserta el nombre de la columna:");
					seleccionColumna(statement, nombreColumn);
					break;
				case 5:
					int idDelete = imputUserIntBetween("Inserta el id a borrar:", 1, maxId(statement));
					borrar(statement, idDelete);
					break;
				case 6:
					System.out.println("\033[31m Saliendo del menú...\033[0m");
                    System.exit(0);
					break;
				default:
					throw new IllegalArgumentException("\033[31m Unexpected value: " + opcion+"\033[0m");
				}
	
	        } while (opcion != 6);
	}
	
	public int imputUserIntBetween(String message, int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		boolean firstRun = true;
		int num;
	    do {
	    	if (!firstRun) {
	            System.out.println("\u001B[31m That number is invalid. \u001B[0m");
	         }
	    	System.out.print("\u001B[34m"+message+"\u001B[32m ");
	    	num = sc.nextInt();
	    	firstRun = false;
		}while(num<num1 || num>num2);
		
	    return num; 
	}
	
	public String inputUser(String message) {
		Scanner sc = new Scanner(System.in);
		String input = null;
    	 try {
 	    	System.out.print(message+" ");
 	    	input = sc.next();
 		}catch(Exception e) {
 			System.out.println("\u001B[31m Error de Scanner"+e+" \u001B[0m");
 		};

	    return input; 
	}

	
	
}
