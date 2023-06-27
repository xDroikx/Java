package preparcial;
import java.util.*;
public class ejer5 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4: ");
		MiObjeto[] miArray = new MiObjeto[3];
		
		miArray[0] = new MiObjeto("Objeto 1");
		miArray[1] = new MiObjeto("Objeto 2");
		miArray[2] = new MiObjeto("Objeto 3");
		
		for (MiObjeto objeto : miArray) {
			System.out.println(objeto.getNombre());
		}
		
	}

}

class MiObjeto{
	private String nombre;
	
	public MiObjeto(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
}
