package exercicio_seçao10_complemento;

public class Entidade_vetor3 {
       private String name;
       private String email;
       private int number;
	public Entidade_vetor3(String name, String email, int number) {
		
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	public Entidade_vetor3(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
     
}
