package entities;

public class Product { // essa classe Product tambem é um object
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
	// ! + AddProducts(quantity: int) : void   !  -----> Void não retorna nada
	// ! + RemoveProducts(quantity:int) : void !	
	// !---------------------------------------!
	
	// atributos do objeto
	public String name;
	public double price;
	public int    quantity;
	
	// Aula 74 - incluir no codigo construtor apos os atributos antes dos metodos 
	// •	É uma operação especial da classe, que executa no momento da instanciação do objeto
	
	//-------------------------- CONSTRUTOR -------------------------------------
	//public Product(String name, double price, int quantity) { // o construtor obriga a informar os atributos(name, price e quantity)
	//	this.name     = name; // this(aula 75) - é uma referencia ao atributo do objeto, acessa os atributos do objeto (public String name) 
	//	this.price    = price;
	//	this.quantity = quantity;
	//}
	
	// opção de gerar o construtur automatico - aula 78
	// •	Botão direito -> Source -> Generate Constructor using Fields
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//-------------------------- CONSTRUTOR FIM -------------------------------------

	// Aula 76 - SobreCarga: disponibilizar mais de uma versão da mesma operação a diferença vai ser a lista de parametros
	public Product(String name, double price) { 
		this.name     = name;  
		this.price    = price;
	}	
	
	// Aula 77 - encapsulamento  -  "set" permite alterar um atributo private
	// Aula 78 - opção de gerar o getters e setters automatico 
	// •	Botão direito -> Source -> Generate Getters and Setters
	public void setName(String name) {  // void não tem retorno
		this.name = name;
	}
	// Aula 77 - encapsulamento - "get utilizado para mostrar o atributo alterado
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) { // void não tem retorno
		this.price = price;
	}
	
	public int getQuantity() { // não tem o metodo "set" para não permitir alteração do atributo
		return quantity;
	}
		
	public double totalValueinStock() {
		return price * quantity;		
	}
  
	public void AddProducts(int quantity) {
		this.quantity += quantity ; // o this indica o acesso ao atributo da classe e não o parametro da função
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
				+ String.format("%.2f", totalValueinStock()); // Product data: TV, $ 900.00, 10 units, Total: $ 9000.00 (esse formato que irá aparecer para o usuario)
		
	}
}
