package Final;
import java.util.*;
public class ejer6 {


		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese un numero: ");
			int n = scanner.nextInt();
			boolean esPrimo = true;
			if(n<=1) {
				esPrimo = false;
			}else if(n==2){
				esPrimo = true;
			}else
				
			for (int i = 2; i <n; i++) {
	            if (n % i == 0) {
	                esPrimo = false;
	                break;
	            }
	            esPrimo = true;
	        }
			
			 if (esPrimo == true) {
		            System.out.println(n + " es un número primo.");
		        } else {
		            System.out.println(n + " NO es un número primo.");
		        }
		}
	}
