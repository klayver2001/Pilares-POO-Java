package orientacaoObjetos.encapsulamento;

public class Carro {
	public void ligar() {
		conferirCombustivel();
		conferirEmbreagemAcionada();
		System.out.println("Carro ligado !");
	}
	
	
	// 	Métodos encapsulados conforme as regras da POO 
	private void conferirCombustivel() {System.out.println("Conferindo combustivel, tudo  ok ");}
	
	private void conferirEmbreagemAcionada() {System.out.println("Embreagem acionada, pronto para à partida...");}
	
	
	
}
