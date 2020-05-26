package entities;

public class Product { // essa classe Product tambem � um object
	// Enter product data:
    // Name: TV
    // Price: 900.00
    // Quantity in stock: 10

    // Product data: TV, $ 900.00, 10 units, Total: $ 9000.00 
    // Enter the number of products to be added in stock: 5
    // Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00 
    // Enter the number of products to be removed from stock: 3 
    // Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00

	// projeto da classe (UML)
	// !---------------------------------------!
	// !              Product                  !  -----> Nome da classe
	// !---------------------------------------!  
	// ! - name : String                       !
	// ! - price : double                      !  -----> Atributos da classe
	// ! - quantity : int                      ! 
	// !---------------------------------------!
	// ! + TotalValueinStock(): double         !  -----> Metodos da classe	
	// ! + AddProducts(quantity: int) : void   !  -----> Void n�o retorna nada
	// ! + RemoveProducts(quantity:int) : void !	
	// !---------------------------------------!
	
	// atributos do objeto
	public String name;
	public double price;
	public int    quantity;
	
	// Aula 74 - incluir no codigo construtor apos os atributos antes dos metodos 
	// �	� uma opera��o especial da classe, que executa no momento da instancia��o do objeto
	
	//-------------------------- CONSTRUTOR -------------------------------------
	//public Product(String name, double price, int quantity) { // o construtor obriga a informar os atributos(name, price e quantity)
	//	this.name     = name; // this(aula 75) - � uma referencia ao atributo do objeto, acessa os atributos do objeto (public String name) 
	//	this.price    = price;
	//	this.quantity = quantity;
	//}
	
	// op��o de gerar o construtur automatico - aula 78
	// �	Bot�o direito -> Source -> Generate Constructor using Fields
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//-------------------------- CONSTRUTOR FIM -------------------------------------

	// Aula 76 - SobreCarga: disponibilizar mais de uma vers�o da mesma opera��o a diferen�a vai ser a lista de parametros
	public Product(String name, double price) { 
		this.name     = name;  
		this.price    = price;
	}	
	
	// Aula 77 - encapsulamento  -  "set" permite alterar um atributo private
	// Aula 78 - op��o de gerar o getters e setters automatico 
	// �	Bot�o direito -> Source -> Generate Getters and Setters
	public void setName(String name) {  // void n�o tem retorno
		this.name = name;
	}
	// Aula 77 - encapsulamento - "get utilizado para mostrar o atributo alterado
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) { // void n�o tem retorno
		this.price = price;
	}
	
	public int getQuantity() { // n�o tem o metodo "set" para n�o permitir altera��o do atributo
		return quantity;
	}
		
	public double totalValueinStock() {
		return price * quantity;		
	}
  
	public void AddProducts(int quantity) {
		this.quantity += quantity ; // o this indica o acesso ao atributo da classe e n�o o parametro da fun��o
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueinStock()); // Product data: TV, $ 900.00, 10 units, Total: $ 9000.00 (esse formato que ir� aparecer para o usuario)
		
	}
}
