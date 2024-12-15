package orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps;

public class Whatsapp extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validarConexãoServidor();
		System.out.println("Mensagem enviada. by: Whatsapp");
		salvarHistorico();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida. by: Whatsapp");
	}
	@Override
	protected void salvarHistorico() {
		System.out.println("Histórico salvo no servidor...");
	}
}
