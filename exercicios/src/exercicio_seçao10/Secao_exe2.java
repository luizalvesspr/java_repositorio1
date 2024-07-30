package exercicio_seçao10;

import java.util.Locale;
import java.util.Scanner;

import exercicio_seçao10_complemento.Entidade_vetor10;

public class Secao_exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("D");
			int n = sc.nextInt();
			Entidade_vetor10 [] vect = new Entidade_vetor10 [n];
			for (int i= 0; i<n;i++) {
				
				double numero = sc.nextDouble();
				vect [i]= new Entidade_vetor10 (numero);
			}
			double soma = 0;
			for(int i =0;i<n;i++  ) {
				soma += vect[i].getNumero();
			}
			System.out.println(soma);
		}
	}

}
