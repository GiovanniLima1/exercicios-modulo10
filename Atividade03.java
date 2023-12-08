package aula03;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		int cont, idade;
		int tot21 = 0, tot50 = 0;
		Scanner leia = new Scanner(System.in);
		 
		cont = 1;
		
		while (cont <= 5) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade < 21){
				tot21 = tot21 + 1;
			}
			if (idade > 50) {
				tot50 = tot50 + 1;;
			}
			cont++;
		}
		System.out.println("Total de pessoas menores de 21 anos: "+tot21);
		System.out.println("Total de pessoas maiores de 50 anos: "+tot50);
		

	}

}
