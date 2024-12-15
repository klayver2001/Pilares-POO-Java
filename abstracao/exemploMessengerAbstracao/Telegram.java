package orientacaoObjetos.abstracao.exemploMessengerAbstracao;

public class Telegram extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem enviada. by: Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: Telegram");
	}

}
