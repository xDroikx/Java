package preparcial;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ejercicio 3: ");
		int suma = 0;
		int valor;
		System.out.println("Ingrese numeros enteros positivos ( ingrese 0 para terminar): ");
		
		do {
			valor = scanner.nextInt();
			if(valor>0) {
				suma += valor;
			}
		}while(valor != 0);
		System.out.println("La suma de los numeros ingresados es : "+suma);
		System.out.println();
	}
	

}
