package orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps;

public class MSNMessenger extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		validarConexãoServidor();
		System.out.println("Mensagem enviada. by: MSNMessenger");
		salvarHistorico();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: MSNMessenger");
	}
	
	@Override
	protected void salvarHistorico() {
		System.out.println("Histórico salvo no servidor...");
	}
	

}
