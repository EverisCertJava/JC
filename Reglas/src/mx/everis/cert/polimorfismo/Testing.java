package mx.everis.cert.polimorfismo;

public class Testing {

	public static void main(String[] args) {
		Taza t = new Taza();
		Liquido leche = new Leche();
		Liquido cafe = new Cafe();
		
		
		
		t.arregloLiquido(leche,0);
		t.arregloLiquido(cafe,1);
		
		

	}

}
