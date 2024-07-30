package exercicio_seçao10;

import java.util.Locale;
import java.util.Scanner;

import exercicio_seçao10_complemento.Entidade_vetor3;

public class Secao_exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		Entidade_vetor3[] vect = new Entidade_vetor3[10];
		
		if (n < 10) {
			for (int i = 0; i < n; i++) {
				sc.nextLine();
				System.out.print("what´s your name? ");
				String name = sc.nextLine();
				
				System.out.print("What´s your room number ? ");
				 int number = sc.nextInt();
				 sc.nextLine();
				 System.out.print("qual seu email?");
					String email = sc.nextLine();
				
				if (number < 10) {
					vect[number] = new Entidade_vetor3(name, email, number);
					
					 
				}
				
				else {
					System.out.println("we dont have this room");
				}
		    	
			}
			for (int i=0;i<10;i++) {
				if(vect[i]!=null) {
					
			      System.out.println(vect[i].getNumber()+" , "+vect[i].getName()+","+vect[i].getEmail());
				}
			}	
			
		
			
			
			
		} else {
			System.out.println("We dont have this room");
		}
		sc.close();
	}

}
