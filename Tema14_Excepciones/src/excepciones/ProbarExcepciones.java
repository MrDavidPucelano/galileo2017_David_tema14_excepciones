package excepciones;

import java.util.Scanner;

public class ProbarExcepciones {

	public static void main(String[] args) {

		// BLOQUE 1
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un n�mero: ");
		int iNumero = 0;
		int doble = 0;
		int[] numeros = new int [10];
		boolean error;
		do {
			error=false;
			try {
				// BLOQUE 2
				String sNumero = teclado.nextLine();
				numeros[10] = Integer.parseInt(sNumero);
				iNumero = numeros[10]; 
				doble = 2 * iNumero;
			} catch (NumberFormatException e) {
				// BLOQUE 3
				System.out.println("Error, no ha tecleado un n�mero");
				//e.printStackTrace();
				error = true;
				System.out.println("Vuelva a teclear el n�mero: ");
			}catch (IndexOutOfBoundsException e){
				error = true;
				System.out.println("Error, el array se fue de madre malpario hijueputa gonorrea plata o plomo!!");
				System.out.println("Vuelva a teclear el n�mero: ");
			}
			catch(Exception e){
				error = true;
				System.out.println("awy awo");
				System.out.println("Vuelva a teclear el n�mero: ");
			}
			
		} while (error == true);
		// BLOQUE 4
		System.out.println("El doble de " + iNumero + " es " + doble);

	}

}
