package pacote;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Scanner objscanner = new Scanner(System.in); 
		
		String codigo; 
		double quantidade; 
		double valor; 
		double resultado; 
		double valor1 = 7.50; 
		double valor2 = 9.90;
		double valor3 = 14.00;
		double valor4 = 19.99; 
		
		
		
		
		System.out.println("DIGITE SEU CÓDIGO ");
		
		codigo = objscanner.next(); 
		
		System.out.println("DIGITE A QUANTIDADE");
		quantidade = objscanner.nextDouble();
		
		if (codigo.equalsIgnoreCase("A001")) {
			resultado = (quantidade * valor1); 
			System.out.println("RESULTADO: " + resultado); 
		}
		
		else if (codigo.equalsIgnoreCase("A002")) {
			resultado = (quantidade * valor2); 
			System.out.println("RESULTADO: " + resultado); 
		}
		
		else if (codigo.equalsIgnoreCase("A003")) {
			resultado = (quantidade * valor3); 
			System.out.println("RESULTADO: "); 
		}
		
		else if (codigo.equalsIgnoreCase("A004")) {
			resultado = (quantidade * valor4); 
			System.out.println("RESULTADO: "); 
		}
		
		else {
			System.out.println("DADO INVÁLIDO"); 
		}
		
	}

}
