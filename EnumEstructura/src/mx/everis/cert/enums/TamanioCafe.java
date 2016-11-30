package mx.everis.cert.enums;

public enum TamanioCafe {
	CHICO("Small"),
	MEDIANO("Medium"),
	GRANDE("Big");
	
	private String mensaje;
	
	
	TamanioCafe(String s){
		this.mensaje = s;
	}
	
	public String getValue(){
		return this.mensaje;
	}
}
