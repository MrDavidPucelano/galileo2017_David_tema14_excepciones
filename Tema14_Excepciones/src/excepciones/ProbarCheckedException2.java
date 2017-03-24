package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException2 {

	public static FileWriter abrirFichero(String ruta) throws java.io.IOException {

		try {
			return new FileWriter(ruta);
		} catch (IOException ioex) {
			// Aquí capturamos cualquier excepción IOException que se lance
			ioex.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) throws java.io.IOException{

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ruta del fichero donde va a escribir: ");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;

		fichero = abrirFichero(ruta);
			
		System.out.println("Texto que desea escribir en el fichero: ");
		String texto = teclado.nextLine();
	
		fichero.write(texto);			
		fichero.close();
		
	}

}
