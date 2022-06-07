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
		System.out.println("Digite 10 n�meros inteiros:");
		System.out.print("Primeiro n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Segundo n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Terceiro n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Quarto n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Quinto n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Sexto n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("S�timo n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Oitavo n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("Nono n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		System.out.print("D�cimo n�mero: ");
		conjuntoNumeros.add(sc.nextInt());
		
		System.out.println(conjuntoNumeros);
		
		System.out.println("O maior n�mero �: " + Collections.max(conjuntoNumeros));
		System.out.println("O menor n�mero �: " + Collections.min(conjuntoNumeros));
		
		Iterator<Integer> iterator = conjuntoNumeros.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }
		System.out.println("A m�dia aritim�tica �: " + soma/10 );
		
		Iterator<Integer> iterator1 = conjuntoNumeros.iterator();
        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            if (next > 10) 
            	System.out.print("H�" + +" n�meros acima de 10. S�o eles: " + );
            
            //System.out.println(iterator1);
        }
       
		
		//System.out.println("H� " +   + " n�meros acima de 50. S�o eles: " +);
		
		
		sc.close();
	}

}
