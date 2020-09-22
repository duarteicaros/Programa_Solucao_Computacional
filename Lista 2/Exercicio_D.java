package Lista2;


import java.util.Scanner;

public class Exercicio_D {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float x =50, c;
		
		for(x=50;x<=150;x++) {
			c=(x-32)*5/9;
			System.out.printf("\nA temperatura em Fahrenheit ("+x+") é igual a: "+Math.round(c * 100.0)/100.0+"ºC");
	
		}

	}

}
