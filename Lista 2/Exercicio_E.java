package Lista2;

import java.util.Scanner;

public class Exercicio_E {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, n, resp;
		
		System.out.printf("Informe o numero que deseja saber a tabuada:");
		n = leia.nextInt();
		System.out.println();
		
		for(x=1; x<=10;x++) {
			resp = x*n;
			System.out.println(n+" X "+x+" = "+resp);
		}
		
		

	}

}
