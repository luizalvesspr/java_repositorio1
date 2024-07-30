package exercicios;

import java.util.Locale;
import java.util.Scanner;

import complemeto_1.Entidade_3;

public class exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Entidade_3 entidade_3 =  new Entidade_3();
		Scanner sc = new Scanner (System.in);
		System.out.print("digite o nome do aluno: ");
		entidade_3.name= sc.nextLine();
		System.out.println("coloque as três notas:");
		entidade_3.nota1 = sc.nextInt();
		entidade_3.nota2 = sc.nextInt();
		entidade_3.nota3 = sc.nextInt();
		if ( entidade_3.nota1<=30 &&  entidade_3.nota2<=35 && entidade_3.nota3<=35 ) {
    		entidade_3.x= entidade_3.nota1+entidade_3.nota2+entidade_3.nota3;
    		 if (entidade_3.x>60) {
    			System.out.println( entidade_3.tostring()+" passou");
    		 }
    		 else {
    			 double s = 100-entidade_3.x;
    			 System.out.println(entidade_3.tostring()+"reprovou");
    			 System.out.println("faltam"+s+"para passar");    		 
    			 }     	
    	}
		else {
			System.out.println("numero inválido");
		}
		
		
		sc.close();
                   
	}

}
