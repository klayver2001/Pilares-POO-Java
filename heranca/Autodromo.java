package orientacaoObjetos.heranca;

public class Autodromo {

	public static void main(String[] args) {
	
		Carro cronos = new Carro();
		cronos.ligar();
		cronos.setChassi("000000");
		
		Moto cb500 = new Moto();
		cb500.setTriperLevantado(0);
		cb500.ligar();
		
	}
}