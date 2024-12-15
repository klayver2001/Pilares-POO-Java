package orientacaoObjetos.heranca;

public class Moto extends Veiculo {
	private int triperLevantado;
	
	public void ligar() {
		if (validarTriper()) {
			System.out.println("Triper suspenso, pronto para ligar ...");
			System.out.println("Moto ligado com sucesso !");
		} else {
			System.out.println("Não foi possível ligar a moto. Verifique o triper !");
		}
		
		
	}
	// Validação boolean do triper
	private  boolean validarTriper (){
		 if (triperLevantado == 0) {
	            System.out.println("Triper suspenso, validado.");
	            return true;
	        } else {
	            System.out.println("Triper baixo, recolha para ligar a moto!");
	            return false;
	        }
	}
	
	 public void setTriperLevantado(int estado) {
	        this.triperLevantado = estado;
	    }
	 
	 public int getTriperLevantado() {
	        return triperLevantado;
	    }
}
