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
		System.out.println("M�DIA: " + media);
		
		if (media > 7) {
			System.out.println("VOC� EST� APROVADO!");
		}
		else if (media > 5 && media <= 7) {
			System.out.println("VOC� VAI FAZER RECUPERA��O!");
		}
		else {
			System.out.println("VOC� EST� REPROVADO!");
		}
 
	}

}
