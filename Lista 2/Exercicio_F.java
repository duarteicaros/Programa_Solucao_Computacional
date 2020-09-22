package Lista2;

import java.util.Scanner;

public class Exercicio_F {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double temp, media, soma=0;
		int x;
		
		for(x=0; x<365; x++) {
			System.out.printf("Qual foi a temperatura maxima do "+(x+1)+"º dia?");
			temp = leia.nextDouble();
			soma += temp;
		}
		
		media = soma / x;
		
		System.out.println("\nA media das temeraturas maximas do ano foi de: "+media);
		
		

	}

}
