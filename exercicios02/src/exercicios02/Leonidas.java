package exercicios02;

import java.util.Scanner;

public class Leonidas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int palpite;
		int valorCorreto=10000;
		
	    System.out.println("Digite seu palppite:");
		palpite = teclado.nextInt();
		
		while(palpite != valorCorreto) {
			if(palpite>valorCorreto) {
				System.out.println("um pouco menos...");
			}
			else {
				System.out.println("um pouco mais....");
				
			}
			System.out.println("Digite outro palppite:");
			palpite = teclado.nextInt();
		}
		System.out.println("Parabens acertou:");

	}

}
