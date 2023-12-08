package aula03;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		int v1 = 0, v2 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("***  DIGITE DOIS NÚMEROS  ***");
		System.out.print("Digite o 1° numero do intervalo: ");
		int v1 = leia.nextInt();
		
		System.out.print("Digite o 1° numero do intervalo: ");
		int v2 = leia.nextInt();

		if (v1 < v2) {

			for (int i = v1; i <= v2; i++) {

				if(i == 0) {
					continue;
				}

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " são multiplo de 3 e 5");
				}
			}

		} else {
			System.out.println("Intervalo Inválido!");
		}

	}

}
