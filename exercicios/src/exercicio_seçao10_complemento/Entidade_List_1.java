package exercicio_seçao10_complemento;

public class Entidade_List_1 {
     private String name;
     private Integer id;
     private Double salary;
	public Entidade_List_1(String name, Integer id, Double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Entidade_List_1(Integer id, Double salary) {
		
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
     
}
