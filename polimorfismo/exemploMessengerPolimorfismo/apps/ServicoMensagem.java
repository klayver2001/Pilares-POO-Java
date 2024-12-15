package orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps;

public abstract class ServicoMensagem {

	public abstract void enviarMensagem();

	public abstract void receberMensagem();
	
	protected abstract void salvarHistorico();
	
	protected void validarConexãoServidor() {
		System.out.println("Validando conexão com o servidor...");
		System.out.println("Conectado com sucesso !");
	}

}
