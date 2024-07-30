package exercicio_seçao10;

import java.util.Locale;
import java.util.Scanner;

import exercicio_seçao10_complemento.Entidade_vetor2;

public class Exercicio_veotr_rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many people are there? ");
			int n = sc.nextInt();
			int ct =0;
			Entidade_vetor2 [] vect = new Entidade_vetor2[n];
			for (int i=0; i<n;i++) {
				ct++;
				sc.nextLine();
				System.out.println(ct+"°"+"people data:");
				
				System.out.print("type name:");
				String name =  sc.nextLine();
				System.out.print("type age:");
			    int old = sc.nextInt();
				System.out.print("type height:");
				double height =  sc.nextDouble(); 
				vect[i]= new Entidade_vetor2( name, old,height);
			}
			double som = 0;
			
			for(int i=0;i<n;i++) {
				som += vect[i].getHeight();
			}
			double med = som/n;
			double percent = 0;
			 ct  = 0;
			for (int i=0;i<n;i++) {
				if (vect[i].getOld()<16) {
					ct++;
				}
			}
			percent = (100*ct)/n;
			System.out.println(percent +"%"+ " peoples is a minior ");
			System.out.printf("the average height is %.2f%n",med);
			for (int i=0;i<n;i++) {
				if (vect[i].getOld()<16) {
					System.out.println(vect[i].getName()+" is under 16 years old ");
				}
			}
		}		
	}

}
