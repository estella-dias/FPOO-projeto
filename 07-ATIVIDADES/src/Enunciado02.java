import java.util.Scanner;

public class Enunciado02 {
	
	int[] valores1 = new int[10]; 
	int[] valores2 = new int[10]; 
	Scanner objScanner = new Scanner(System.in);
	
	public void listarValores() {
		
		for(int indice = 0; indice < valores1.length; indice++){
			System.out.println("DIGITE O N�MERO " + (indice + 1));
			valores1[indice] = objScanner.nextInt(); 
			System.out.println("RESULTADO � " + (valores2 [indice] = valores1 [indice] * 3)); 
	
		} 
		
		int cont = 0; 
		while(cont < 10) {
			
			
			System.out.println((cont + 1) + "� NUMERO: " + valores1[cont]);
			System.out.println((cont + 1) + " RESULTADO :" + valores2[cont]);
			cont++;	
		}
		
	}

}
