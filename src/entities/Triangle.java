package entities; //..............................................................pacote da classe

// •	Classe: é a definição do tipo
// Seção 8 Aula 63 - RESOLVENDO O MESMO PROBLEMA COM ORIENTAÇÃO A OBJETOS
// Criando uma classe com três atributos para representar melhor o triângulo

// Classe : •	Classe: é a definição do tipo
// •	É um tipo estruturado que pode conter (membros):
// 		•	Atributos (dados / campos)
// 		•	Métodos (funções / operações)

// •	A classe também pode prover muitos outros recursos, tais como:
// 		•	Construtores
// 		•	Sobrecarga
// 		•	Encapsulamento
// 		•	Herança
// 		•	Polimorfismo

// •	Exemplos:
// 		•	Entidades: Produto, Cliente, Triangulo
// 		•	Serviços: ProdutoService, ClienteService, EmailService, StorageService
// 		•	Controladores: ProdutoController, ClienteController
// 		•	Utilitários: Calculadora, Compactador
// 		•	Outros (views, repositórios, gerenciadores, etc.)

public class Triangle { //............................................................ Nome da Classe
	// variaveis do tipo classe (Triangle) //......................................... Atributos da Classe
	public double a; //............................................................... public - indica que o atributo ou metodo
	public double b;                                                               //           pode ser usado em outros arquivos
	public double c;  
                                                                                   
	// metodo(função) criada para calcular a area do triangulo
	public double area() { //......................................................... double - tipo de dado que o metodo retorna
		double p = ( a + b + c) / 2.0;                                              //          (se o metodo não retorna nada o tipo é void)
		return Math.sqrt(p * (p - a ) * (p - b) * (p - c));                         // area   - nome do metodo
	}                                                                               // ()     - lista de parametros do metodo
}
// •	Objetos: são instâncias da classe

// Projeto da Classe (UML)

//    !-----------------!
//    !    Triangule    !  -----> Nome da classe
//    !-----------------!  
//    ! - A : double    !
//    ! - B : double    !  -----> Atributos da classe
//    ! - C : double    ! 
//    !-----------------!
//    ! + Area() double !  -----> Metodos da classe
//    !-----------------!