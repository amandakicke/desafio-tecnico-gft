package teste02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> conjuntoNumeros = new HashSet<>();
		System.out.println("Digite 10 números inteiros:");
		System.out.print("Primeiro número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Segundo número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Terceiro número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Quarto número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Quinto número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Sexto número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Sétimo número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Oitavo número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Nono número: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Décimo número: ");
		conjuntoNumeros.add(sc.nextInt());
		
		System.out.println(conjuntoNumeros);
		
		System.out.println("O maior número é: " + Collections.max(conjuntoNumeros));
		System.out.println("O menor número é: " + Collections.min(conjuntoNumeros));
		
		Iterator<Integer> iterator = conjuntoNumeros.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }
		System.out.println("A média aritimética é: " + soma/10 );
		
		Iterator<Integer> iterator1 = conjuntoNumeros.iterator();
        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            if (next > 10) 
            	System.out.print("Há" + +" números acima de 10. São eles: " + );
            
            //System.out.println(iterator1);
        }
       
		
		//System.out.println("Há " +   + " números acima de 50. São eles: " +);
		
		
		sc.close();
	}

}
