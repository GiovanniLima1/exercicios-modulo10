package aula03;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		int cont, numSoma = 0, num = 1;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num > 0) {
				numSoma = numSoma + num;
			}
		}while (!(num == 0));
		System.out.println("A soma dos números positivos é "+numSoma);

	}

}
