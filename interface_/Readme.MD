# Sobre o Projeto: 
## Interface com Equipamentos Multifuncionais

## Esse projeto monstra o uso de interfaces em Java, aplicando conceitos importantes da Programação Orientada a Objetos (POO). Usei uma abordagem prática para simular o funcionamento de uma fábrica que utiliza diferentes equipamentos como impressoras, digitalizadoras, copiadoras e multifuncionais. Abstração é como quando você usa um aplicativo sem se preocupar com como ele foi feito por dentro. Você só precisa saber o que ele faz, e não como ele funciona.


## O que é? 
>   Uma interface em Java é como um contrato. Ela define o que um objeto deve fazer, mas não diz como fazer.

## No exemplo:

* Temos interfaces para diferentes funções:
	* Impressora para imprimir.
	* Digitalizadora para digitalizar.
	* Copiadora para copiar.
* A classe Multifuncional implementa todas essas interfaces, ou seja, ela sabe como realizar todas essas funções.
## Organização em Pacotes
* Para manter o projeto organizado, dividimos as classes e interfaces em pacotes:
    * equipamentos: Contém as interfaces e a implementação de Multifuncional.
	* Subpacotes: Impressora, Digitalizadora, Copiadora.	
	*	estabelecimento: Simula a fábrica que utiliza os equipamentos.
	
## Polimorfismo com Interfaces
*	Polimorfismo permite usar um objeto de formas diferentes, dependendo do tipo de interface que ele implementa.
    * No código, criamos um objeto Multifuncional, mas o utilizamos como:
		* Uma impressora, para imprimir.
		* Uma digitalizadora, para digitalizar.
		* Uma copiadora, para copiar.
	* Isso é possível porque a classe Multifuncional implementa todas essas interfaces.
	
## Como o código funciona?
No arquivo Fabrica, o método main faz o seguinte:

* Cria um objeto do tipo Multifuncional.
    * Esse objeto sabe imprimir, digitalizar e copiar.
* Usa polimorfismo para trabalhar com esse objeto como se fosse diferentes tipos de equipamentos:
	* Como uma impressora para chamar o método imprimir().
	* Como uma digitalizadora para chamar o método digitalizar().
	* Como uma copiadora para chamar o método copiar().
* Invoca os métodos das interfaces, simulando uma fábrica onde cada funcionalidade é utilizada.