package exercicios;

import java.util.Locale;
import java.util.Scanner;

import complemeto_1.Entidade_4;

public class exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double dollar;
		double real;
		System.out.println("what is the doller price? ");
		dollar = sc.nextDouble(); 
		System.out.println("how many you will be bought? ");
		real = sc.nextDouble();
		double valor= real*dollar;
		double valor_final = Entidade_4.IOf(valor);
		System.out.println("you will be paid:"+valor_final+"reais");
		
		
		
		
		
		sc.close();

	}

}
