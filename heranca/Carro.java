package orientacaoObjetos.heranca;

public class Carro extends Veiculo{
	public void ligar() {
		conferirCombustivel();
		conferirEmbreagemAcionada();
		System.out.println("Carro ligado !");
	}
	// Herança 
	private String chassi;
	public String getChassi() { return chassi; }
	public void setChassi(String chassi) { this.chassi = chassi; }
	
	// 	Métodos encapsulados conforme as regras da POO 
	private void conferirCombustivel() {System.out.println("Conferindo combustivel, tudo  ok ");}
	private void conferirEmbreagemAcionada() {System.out.println("Embreagem acionada, pronto para à partida...");}
}
