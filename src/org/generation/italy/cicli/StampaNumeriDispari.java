package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		Random randomGenerator = new Random ();
		
		System.out.print("Dammi un numero: ");
		
		n = scanner.nextInt();
		int[] numbers = new int [n];
		
		int conteggioNumeriPari = 0;
		int conteggioNumeriDispari = 0;
		int somma = 0;
		

		for(int i = 0; i < n; i++) {
			
			numbers[i] = randomGenerator.nextInt(100);
			
			if(numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
				conteggioNumeriDispari++;
			} else {
				conteggioNumeriPari++;
			}
			
			if(numbers[i]> 10 && numbers[i] < 50) {
				
				somma += numbers[i];
			}
			
		}
		
		System.out.println("Il conteggio dei numeri dispari è di: " + conteggioNumeriDispari);
		System.out.println("Il conteggio dei numeri pari è di: " + conteggioNumeriPari);
		System.out.println("La somma è: " + somma);
		 
		scanner.close();
	}

}
