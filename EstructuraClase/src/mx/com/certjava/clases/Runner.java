package mx.com.certjava.clases;

import mx.com.certjava.interfaces.Ahtlete;
import mx.com.certjava.interfaces.AhtleteDos;
import mx.com.certjava.padre.Persona;

public class Runner extends Persona implements Ahtlete, AhtleteDos{

    public Runner(){
		super("Carlos");
    	System.err.println("Constructor Runner Clase");
	}
    
    public Runner(String nombre){
    	System.err.println("Constructor Runner Clase Sobrecargado");
    }
	
    public Runner(String... nombre){
    	System.err.println("Constructor Runner Clase Sobrecargado con Arreglo "+nombre[0]+nombre[1]+nombre[2]);
    }
    
	public String getNombre() {
		
		return null;
	}

	@Override
	public String getApellido() {
		
		return null;
	}

	@Override
	public int getEdad() {
		
		return 0;
	}

	@Override
	public String toString() {
		
		return "Carlos " + "25";
	}
	
	
	
}
