package orientacaoObjetos.heranca.exemploAppSemPOO;

public class MSNMensseger {
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviou à mensagem, by: MSN Messenger");
		salvarHistoricoMensagem();
		System.out.println(" ");
	}
	public void receberMensagem() {
		System.out.println("Recebeu à mensagem, by: MSN Messenger");
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
