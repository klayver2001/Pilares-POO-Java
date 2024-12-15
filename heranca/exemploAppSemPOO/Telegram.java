package orientacaoObjetos.heranca.exemploAppSemPOO;

public class Telegram {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviou à mensagem, by: Telegram ");
		salvarHistoricoMensagem();
		System.out.println(" ");
	}
	public void receberMensagem() {
		System.out.println("Recebeu à mensagem, by: Telegram ");
		salvarHistoricoMensagem();
		System.out.println(" ");
	}

	
	private void validarConexaoInternet() {
		System.out.println("Verificando conexão com a internet ...");
		System.out.println("Conectado !");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Histórico de mensagens salvas !");
	}
}
