package entities; //..............................................................pacote da classe

// �	Classe: � a defini��o do tipo
// Se��o 8 Aula 63 - RESOLVENDO O MESMO PROBLEMA COM ORIENTA��O A OBJETOS
// Criando uma classe com tr�s atributos para representar melhor o tri�ngulo

// Classe : �	Classe: � a defini��o do tipo
// �	� um tipo estruturado que pode conter (membros):
// 		�	Atributos (dados / campos)
// 		�	M�todos (fun��es / opera��es)

// �	A classe tamb�m pode prover muitos outros recursos, tais como:
// 		�	Construtores
// 		�	Sobrecarga
// 		�	Encapsulamento
// 		�	Heran�a
// 		�	Polimorfismo

// �	Exemplos:
// 		�	Entidades: Produto, Cliente, Triangulo
// 		�	Servi�os: ProdutoService, ClienteService, EmailService, StorageService
// 		�	Controladores: ProdutoController, ClienteController
// 		�	Utilit�rios: Calculadora, Compactador
// 		�	Outros (views, reposit�rios, gerenciadores, etc.)

public class Triangle { //............................................................ Nome da Classe
	// variaveis do tipo classe (Triangle) //......................................... Atributos da Classe
	public double a; //............................................................... public - indica que o atributo ou metodo
	public double b;                                                               //           pode ser usado em outros arquivos
	public double c;  
                                                                                   
	// metodo(fun��o) criada para calcular a area do triangulo
	public double area() { //......................................................... double - tipo de dado que o metodo retorna
		double p = ( a + b + c) / 2.0;                                              //          (se o metodo n�o retorna nada o tipo � void)
		return Math.sqrt(p * (p - a ) * (p - b) * (p - c));                         // area   - nome do metodo
	}                                                                               // ()     - lista de parametros do metodo
}
// �	Objetos: s�o inst�ncias da classe

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