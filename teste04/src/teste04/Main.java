package teste04;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random();
		
		System.out.print("Digite um número de 0 a 10: ");
		int numero = gerador.nextInt(11);
		int escolha = sc.nextInt();
		
		
		if (numero == escolha) {
			System.out.println("Você acertou");
		} else 
			sc.next();
			System.out.println("Escolha outro número de 0 a 10");
			escolha = sc.nextInt();
			
			
			
				
					
					
				
		 
		sc.close();

	}

}
