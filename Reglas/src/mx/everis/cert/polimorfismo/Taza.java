package mx.everis.cert.polimorfismo;

public class Taza {
	Liquido [] arregloLiquido = new Liquido[3];
	
	public void arregloLiquido(Liquido liquido, int i) {
		
		if (liquido instanceof Leche) {
			System.err.println("Es leche");
		}
		else if (liquido instanceof Cafe) {
			System.err.println("Es cafe");
		}
		else{
			System.err.println("Es liquido general");
		}
		
		
		arregloLiquido[i] = liquido;
		
	}
}
