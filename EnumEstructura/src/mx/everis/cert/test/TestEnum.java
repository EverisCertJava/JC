package mx.everis.cert.test;

import mx.everis.cert.enums.TamanioCafe;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************");
		calculaTamanio(500);
		
		
		/*
		 * 
		 * swith o if decidir que tamaño es el cafe 
		 * 
		 */
		
		
	}
	
	public static void calculaTamanio(int ml){
		if (ml>0 && ml <=250) {
			System.out.print("The size of the cup is: ");
			System.err.println(TamanioCafe.CHICO.getValue());
		} else if(ml>250 && ml <=500){
			System.out.print("The size of the cup is: ");
			System.err.println(TamanioCafe.MEDIANO.getValue());
		}
		else if(ml>500){
			System.out.print("The size of the cup is: ");
			System.err.println(TamanioCafe.GRANDE.getValue());
		}
		
		
		
	}

}
