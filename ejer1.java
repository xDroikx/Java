package preparcial;
import java.util.*;
public class ejer1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ejercicio 1: ");
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
		
		if(numero>0){
			System.out.println("El numero es positivo ");	
		}else if (numero < 0){
			System.out.println("El numero es negativo ");	
		}else {
			System.out.println("El numero es cero ");	
		}
		
		System.out.println();	
	}

}
