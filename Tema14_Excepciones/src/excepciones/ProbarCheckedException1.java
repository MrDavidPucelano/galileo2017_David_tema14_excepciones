package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException1 {

	public static FileWriter abrirFichero(String ruta) throws java.io.IOException {

		try {
			return new FileWriter(ruta);
		} catch (IOException ioex) {
			// Aqu� capturamos cualquier excepci�n IOException que se lance
			ioex.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ruta del fichero donde va a escribir: ");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;
		boolean errorRuta = false;
		try {

			fichero = abrirFichero(ruta);
			
			System.out.println("Texto que desea escribir en el fichero: ");
			String texto = teclado.nextLine();
			
			fichero.write(texto);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			
			fichero.close();
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} catch (NullPointerException e) {
			
			System.out.println("El fichero no ha sido abierto");
			errorRuta = true;
			
		}

	}

}
