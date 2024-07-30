package exercicios;

import java.util.Locale;

import java.util.Scanner;

import complemeto_1.Fixa_1_falho;

public class exercicio_fixação_falho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite o numero da conta: ");
		int numero_conta = sc.nextInt();
		Fixa_1_falho fixa_1 = new Fixa_1_falho(numero_conta);
		System.out.println("digite seu nome: ");
		fixa_1.name = sc.nextLine();
		System.out.println("digite o valor inicial: ");
		fixa_1.inicial_deposito =  sc.nextDouble();
		 
		System.out.println("Se gostaria de depositar (digite 1)");
		System.out.println("Se gostaria de sacar (digite 2 )");
		int dpsc = sc.nextInt();
		
		
		
		if(dpsc == 1) {
			System.out.println("Qual seria o valor? ");
			fixa_1.inicial_deposito= sc.nextDouble();
			fixa_1.add_valor();
			System.out.println(fixa_1.inicial_deposito);
		}
		else {
			
		}
		System.out.println("digite o valor de deposito inicial ");
		sc.close();
	}

}
