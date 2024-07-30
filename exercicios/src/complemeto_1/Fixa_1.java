package complemeto_1;

public class Fixa_1 {
    private int numero_conta;
    private String name;
    private double saldo;

    public Fixa_1(int numero_conta, String name, double depositoinicial) {
        this.numero_conta = numero_conta;
        this.name = name;
        deposito (depositoinicial); 
    }
    public Fixa_1(int numero_conta, String name) {
        this.numero_conta = numero_conta;
        this.name = name;
         
    }

    public int getNumeroConta() {
        return numero_conta;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

   



    public void deposito(double saldo) {
        this.saldo += saldo;
    }

    public void saque(double saldo) {
        this.saldo -= (saldo +5);
    }
    public String toString() {
    	return "sua conta foi criada sr."+getName()+
    			", o numero é "+getNumeroConta() +", com o saldo de "+getSaldo()+".";
    }
}