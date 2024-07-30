package exercicios;

import java.util.Locale;
import java.util.Scanner;
import complemeto_1.Fixa_1;

public class exercicio_fixa_exe {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, vamos abrir uma conta? <3");
		System.out.print("Digite o número da conta: ");
		int numer_conta = sc.nextInt();

		System.out.print("Digite seu nome: ");
		sc.nextLine(); 
		String name = sc.nextLine();

		Fixa_1 fixa_1 = new complemeto_1.Fixa_1(numer_conta, name);

		System.out.print("Terá valor inicial? Digite 1 para sim ou 2 para não: ");
		int x = sc.nextInt();

		switch (x) {
		case 1:
			System.out.print("Quanto é seu depósito inicial? ");
			double depositoInicial = sc.nextDouble();
			fixa_1.deposito(depositoInicial);
			System.out.println("");
			System.out.println(fixa_1);
			break;
		case 2:
			System.out.println("Ok, seu saldo será de 0.");
			System.out.println("");
			System.out.println(fixa_1); 
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

		System.out.print("Gostaria de depositar quanto? ");
		double deposito = sc.nextDouble();
		fixa_1.deposito(deposito);
		System.out.println("");
		System.out.println(fixa_1);

		System.out.print("Gostaria de sacar quanto? ");
		double saque = sc.nextDouble();
		fixa_1.saque(saque);

		System.out.println(fixa_1);

		sc.close();
	}
}
