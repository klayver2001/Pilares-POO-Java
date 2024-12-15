package orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps;

public class Telegram extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		validarConexãoServidor();
		System.out.println("Mensagem enviada. by: Telegram");
		salvarHistorico();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: Telegram");
	}

	@Override
	protected void salvarHistorico() {
		System.out.println("Histórico salvo no servidor...");
	}
}
