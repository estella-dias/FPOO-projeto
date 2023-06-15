package pacote;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		Scanner objScanner = new Scanner(System.in); 
		String planos; 
		
		System.out.println("DIGITE SEU PLANO ");
		
		planos = objScanner.next(); 
		
		if (planos.equalsIgnoreCase("BÁSICO")) {
			System.out.println("R$150,00");
		}
		else if (planos.equalsIgnoreCase("BRONZE")) {
			System.out.println("R$220,00");
		}
		
		else if (planos.equalsIgnoreCase("PRATA")) {
			System.out.println("R$ 310,00");
		}	
		
		else if (planos.equalsIgnoreCase("OURO")) {
			System.out.println("R$ 450,00");
		}	
		
		else {
			System.out.println("DADO INVÁLIDO");
		}
	
	}

}
