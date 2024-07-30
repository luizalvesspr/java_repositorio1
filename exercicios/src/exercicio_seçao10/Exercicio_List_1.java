package exercicio_seçao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       List<String> list = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
       List<Double> list3= new ArrayList<>();
       System.out.println("quantos empregados?");
       int n= sc.nextInt();
       int ct=0;
       for (int i= 0; i<n;i++) {
    	   sc.nextLine();
    	   ct++;
    	   System.out.println(ct+"°"+"employee");
    	   System.out.println("digite o nome");
    	   String s = sc.nextLine();
    	   System.out.println("digite o id: ");
    	   int id = sc.nextInt();
    	   System.out.println("digite o salario:");
    	   double sala = sc.nextDouble();
    	   list.add(s);
    	   list2.add(id);
    	   list3.add(sala);
    	   
       }
       
       for (String x : list) {
    	   
    	  System.out.println(x);
    	   
       }
       for (Integer x : list2) {
    	   
     	  System.out.println(x);
     	   
        }
       for (Double x : list3) {
     	   
      	  System.out.println(x);
      	   
         }
       
       sc.close();
	}

}
