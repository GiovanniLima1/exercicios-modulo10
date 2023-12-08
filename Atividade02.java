package aula03;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		int i, valor1;
		int par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite o "+i+"º número: ");
			valor1 = leia.nextInt();
			
			if (valor1 % 2 == 0) {
				par = par + 1;
			}else
				impar = impar + 1;	
		}
		System.out.println("Total de números pares: "+par);
		System.out.println("Total de números ímpares: "+impar);
	}

}
