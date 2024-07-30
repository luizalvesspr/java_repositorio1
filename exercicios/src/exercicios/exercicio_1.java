package exercicios;

import java.util.Locale;
import java.util.Scanner;

import complemeto_1.Entidade;

public class exercicio_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Entidade entidade = new Entidade ();
		System.out.println("digite a altura e a largura do retângulo: ");
		entidade.width = sc.nextDouble();
		entidade.height = sc. nextDouble();
		System.out.println(entidade.toString());
		sc.close();
	}

}
