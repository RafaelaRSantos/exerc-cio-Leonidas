package exercicio;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		int peso;
        double altura;
        
        System.out.println("digite peso seguindo de altura:");
        Scanner teclado = new Scanner(System. in);
         peso  = teclado.nextInt();
         altura = teclado.nextDouble();
         
         double imc = peso / (altura * altura);
         
         System.out.printf("IMC: %.2f", imc);
	}

}
