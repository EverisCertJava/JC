package mx.com.certjava.padre;

public class Persona {
	
	public Persona(){
		System.err.println("Constructor Persona");
	}
	
	public Persona(String nombre){
		System.err.println("Constructor Persona Sobrecargado" +  nombre);
	}
	
	public static String nombre;
}
