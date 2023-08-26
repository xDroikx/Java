package Prog2;
import java.util.*;

import javax.swing.JOptionPane;
public class clase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		/*Instalar eclipse (https://www.eclipse.org/downloads/)

Crear un proyecto (File, new, Java Project) con un nombre a elección, destilando la opción Module, Create module-info.java y finalizar.

Crear un paquete ( click con el derecho en el proyecto, New, Package )

Crear un clase con nombre a elección, tildando la opción “public static void main”

Dentro de la función main, pegar: 		System.out.println("Sistema");

Declarar una variable int opcion = 0;

Copiar y luego ejecutar el siguiente código: 		

Scanner scanner = new Scanner(System.in);

System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");

opcion = scanner.nextInt();

System.out.println("Su opción es: " + opcion );		

Desafío 1: dependiendo la opción ingresada, mostrar el mensaje correspondiente

Desafío 2: pedir la opción, hasta que el usuario ingrese 4  (salir)*/
		
		
		System.out.println("Sistema");
		int opcion = 0;
		Scanner scanner = new Scanner(System.in);

		

	
		
		do{
			
			System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");
			opcion = scanner.nextInt();
			
		if(opcion == 1) {
			System.out.println("Su opción es: " + opcion );
			System.out.println("Usted a ingresado a compras");
			
		}else if(opcion == 2) {
			System.out.println("Su opción es: " + opcion );
			System.out.println("Usted a ingresado a ventas");
			
		}else if(opcion == 3) {
			System.out.println("Su opción es: " + opcion );
			System.out.println("Usted a ingresado a Reclamos");	
			
		}else { 
			System.out.println("Su opción es: " + opcion );
			System.out.println("Saliendo");
			break;
		}
		}while(opcion != 4);
		
		}
		
	}
