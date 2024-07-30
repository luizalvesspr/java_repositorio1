package exercicios;

import java.util.Locale;
import java.util.Scanner;

import complemeto_1.Entidade_2;

public class exerciocio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Entidade_2 entidade_2= new Entidade_2();
		System.out.println("Qual seu nome? ");
		entidade_2.name = sc.nextLine();
		
		System.out.println("Qual seu salário bruto? ");
		entidade_2.glosSalary = sc.nextDouble();
		System.out.println("paga quanto de imposto");
		entidade_2.tax = sc.nextDouble();
		System.out.println("funcionario " + entidade_2.toString());
		System.out.println("");
		System.out.println("qual a porcentagem de salário é para aumentar? ");
        int glosSalary = sc.nextInt();
        entidade_2.aumento(glosSalary);
        
    	System.out.println("funcionario seu salario agora é de " + entidade_2.toString());
		
		sc.close();
	}
}
