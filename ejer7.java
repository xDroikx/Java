package Final;

public class ejer7 {

	public static void main(String[] args) {

		 Estudiante[] estu = new  Estudiante[3];
		 estu[0] = new  Estudiante("Ricardo", 20, 9);
		 estu[1] = new  Estudiante("Roberto", 18, 7);
		 estu[2] = new  Estudiante("Ramon", 17, 6);
	      
		 int calificacionMasAlta = -1; // Inicializamos con un valor negativo para asegurar que cualquier calificación será mayor.

	        for (Estudiante estudiante : estu) {
	            if (estudiante.getCali() > calificacionMasAlta) {
	                calificacionMasAlta = estudiante.getCali();
	            }
	        }

	        System.out.println("La calificación más alta es: " + calificacionMasAlta);
	    }
	
	    
	}

	class Estudiante {
	    private
	    String nombre;
	    int edad;
	    int calificaciones;
	    public
	    Estudiante(String n, int e,int c){
	        nombre = n;
	        edad = e;
	        calificaciones = c;
	    }
	    String getNombre (){
	        return nombre;
	    }
	    int getEdad() {
	        return edad;
	    }
	    int getCali() {
	        return calificaciones;
	    }
	}
