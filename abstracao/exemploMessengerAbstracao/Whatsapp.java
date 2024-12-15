package orientacaoObjetos.abstracao.exemploMessengerAbstracao;

public class Whatsapp extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("Mensagem enviada. by: Whatsapp");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: Whatsapp");
	}


}
