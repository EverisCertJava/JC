package mx.everis.reto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double fn = 0,fc = 0,fp = 0;
			System.out. println ("Escriba el numero de numeros a ingresar XD: ");
			
			Integer rango = Integer.valueOf(br.readLine());
			System.out.println("Ingresa los "+rango+ " numero(s) sepaardos por espacio");
			
			
			String arreglo;
			arreglo = br.readLine();
			String[] splited = arreglo.split("\\ ");
			
			if (splited.length != rango) {
				System.err.println("***El numero de numeros XD ingresados no es correcto");
				throw new IllegalAccessException();
			}
			
			for (int i = 0; i < rango; i++) {
				Integer num;
				
				num = Integer.valueOf(splited[i]); 
				if (num<0) {
					fn++;
				} else if(num==0){
					fc++;
				}else{
					fp++;
				}
			}
			
			DecimalFormat f = new DecimalFormat("0.000000");
			
			System.err.println("***Fraccion de negativos "+f.format((fn/rango)));
			System.err.println("***Fraccion de ceros "+f.format((fc/rango)));
			System.err.println("***Fraccion de positivos "+f.format((fp/rango)));
		} catch (IOException e) {
			System.err.println("***Algo hiciste mal ¬¬ ");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.err.println("By JC");
		System.err.println("   /\\_/\\   ");
	    System.err.println("  / o o \\  ");
	    System.err.println(" (   \"   ) ");
	    System.err.println("  \\~(*)~/  ");
	    System.err.println("   // \\\\   ");

	}

}
