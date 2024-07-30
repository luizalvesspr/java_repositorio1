package complemeto_1;

public class Entidade_2 {
   public String name;
   public double glosSalary;
   public double tax;
   
   public double netsalary() {
	   return glosSalary - tax;
   }
   public void aumento(double glosSalary) {
	   
	   this.glosSalary +=(( this.glosSalary/100) *glosSalary);
   };
   public String toString(){
	   return "funcionario "+name+" seu salário é de " + netsalary();
   }
 
}
