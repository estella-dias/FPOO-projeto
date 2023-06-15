package pacote;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int nota1 = 5;
		int nota2 = 7; 
		int nota3 = 2;
		int nota4 = 7;
		int media; 
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("MÉDIA: " + media);
		
		if (media > 7) {
			System.out.println("VOCÊ ESTÁ APROVADO!");
		}
		else if (media > 5 && media <= 7) {
			System.out.println("VOCÊ VAI FAZER RECUPERAÇÃO!");
		}
		else {
			System.out.println("VOCÊ ESTÁ REPROVADO!");
		}
 
	}

}
