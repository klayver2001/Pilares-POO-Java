package orientacaoObjetos.abstracao;

public class MSNMessenger extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem enviada. by: MSNMessenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: MSNMessenger");
	}

}
