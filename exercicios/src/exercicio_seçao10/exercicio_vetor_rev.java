package exercicio_seçao10;


import java.util.Locale;
import java.util.Scanner;






public class exercicio_vetor_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double [] vect =  new double [n];
        for (int i = 0; i<n; i++) {
        	sc.nextLine();
        	vect [i]= sc.nextDouble();
        	
        }
       
        for ( int i = 0;i<n;i++) {
        	if (vect [i]<0) {
        		System.out.printf("%.2f\n", vect[i]);   
        	}
        }
        sc.close();
	}

}
