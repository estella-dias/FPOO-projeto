import java.util.Scanner;

public class Enunciado01 {

	String[] nomes = new String [10]; 		
	Scanner objScanner = new Scanner(System.in);
	
	public void listarNomes() {
	
		for(int indice = 0; indice < nomes.length; indice++){
			System.out.println("DIGITE O NOME: " + (indice + 1));
			nomes[indice] = objScanner.next(); 
		}
		
		int cont = 0; 
		while(cont < nomes.length) {
			
			System.out.println("LISTAGEM DE NOMES");
			System.out.println((cont + 1) + "� NOME: " + nomes[cont]);
			cont++;	
		}
	
	} 
	
}