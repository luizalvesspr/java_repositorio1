package exercicio_seçao10_complemento;

public class Entidade_vetor2 {
      private String name;
      private int old;
      private double height;
      
	public Entidade_vetor2(String name, int old, double height) {
		
		this.name = name;
		this.old = old;
		this.height = height;
	}
	
	public Entidade_vetor2(int old, double height) {
		this.old = old;
		this.height = height;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
      
}
