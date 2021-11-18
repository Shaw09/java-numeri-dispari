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
		
		for(int i = 0; i < n; i++) {
			
			numbers[i] = randomGenerator.nextInt(100);
			
			if(numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}
		
		for(int i = 0; i < n; i++) {
			
			numbers[i] = randomGenerator.nextInt(100);
			
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		
		for((numbers[i] > 10) && (numbers[i] < 50)) {
			System.out.println(numbers[i]);
			sum += i
		 }
		 System.out.println("La somma è: " + sum);
		 
		scanner.close();
	}

}
