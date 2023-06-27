package preparcial;
import java.util.*;
public class ejer2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ejercicio 1: ");
		System.out.println("Ingrese un numero entero: ");
		int n = scanner.nextInt();
		int factorial = 1;
		
		for (int i = 1; 1<n;i++) {
			factorial *=1;
		}
		
		System.out.println("El factorial de "+ n + " es: "+factorial);
		System.out.println();
	}

}