package entities;

public class Account {
	private int    number;   // numero conta
	private String holder;   // nome titular da conta
	private double balance;  // saldo

	// construtor recebe 2 atributos(sobrecarga)  - •Botão direito -> Source -> Generate Constructor using Fields 
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
    // construtor recebe 3 atributos - •Botão direito -> Source -> Generate Constructor using Fields
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // utilizando o metodo encapsulado
	}

	// os atributos são privados, tem que criar os metodos de acesso(get, set) •Botão direito -> Source -> Generate Getters and Setters
	// o numero não pode ser alterado , não será criado o metodo "set"
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
    // saldo só é permitido alterar com deposito ou saque não será criado o metodo "set"
	public double getBalance() {
		return balance;
	}
    // deposito 
	// encapsulando a regra de negocio relativo a deposito nesse metodo
	public void deposit(double amount) {
		balance += amount;
	}
	// saque
	public void withdraw(double amount) {
		balance -= amount + 5.0; // Para cada saque realizado, o banco cobra uma taxa de $ 5.00. 
	}
	
	public String toString() {   // formato para listar na tela
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);  // Account 8532, Holder: Alex Green, Balance: $ 500.00
		                                           // Account 8532, Holder: Alex Green, Balance: $ 700.00
		                                           // Account 8532, Holder: Alex Green, Balance: $ 395.00
	}	
}

