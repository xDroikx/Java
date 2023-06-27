package preparcial;
import java.util.Scanner;
public class ejer4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ejercicio 4: ");
		System.out.println("Ingrese dia de la semana(1-7): ");
		int dia = scanner.nextInt();

		String nombreDia;
		switch(dia){
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miercoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Dia no valido";
		}
		System.out.println("El dia seleccionado es : " +nombreDia);
		System.out.println();
	}
}
