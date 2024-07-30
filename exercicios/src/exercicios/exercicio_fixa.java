package exercicios;

import java.util.Locale;
import java.util.Scanner;
import complemeto_1.Fixa_1_falho;

public class exercicio_fixa {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite seu nome: ");
			String name = sc.nextLine();
			
			System.out.println("Digite o número da conta: ");
			int numero_conta = sc.nextInt();
			
			Fixa_1_falho fixa_1 = new Fixa_1_falho(numero_conta);
			
			sc.nextLine();  
			
			System.out.println("Terá valor inicial? (s/n) ");
			String valor_ini = sc.nextLine();
			
			if(valor_ini.equals("s")) {
			    System.out.println("Quanto seria o valor? ");
			     fixa_1.inicial_deposito = sc.nextDouble();
			    System.out.println(fixa_1.inicial_deposito);
			} else {
			    System.out.println("Iniciará com 0");
			    fixa_1.inicial_deposito = 0; 
			}
      
			while(true){
			    System.out.println("Se gostaria de depositar, digite 1");
			    System.out.println("Se gostaria de sacar, digite 2");
			    System.out.println("Se gostaria de sair, digite outro ");
			    int dpsc = sc.nextInt();
			        
      
			    if(dpsc == 1) {
			        System.out.println("Qual seria o valor? ");
			        double dep2 = sc.nextDouble();
			        fixa_1.s2 += dep2;
			        
			        
			        System.out.println("valor atual é de "+fixa_1.valor_atual());
			    } else if(dpsc == 2) {
			        System.out.println("Qual seria o valor? ");
			        fixa_1.saq_v= sc.nextDouble();
			        
			        
			        System.out.println("Valor atual: " + fixa_1.valor_atual());
			        
			    }else {
			    
			    	System.out.println("Programa terminado !!!");
			    	break;
			    }
			}
			
			
		}
       
    }
}
