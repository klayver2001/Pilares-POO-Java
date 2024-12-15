package orientacaoObjetos.heranca.exemploAppComPOO;

public class ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviou à mensagem.");
		salvarHistoricoMensagem();
		System.out.println(" ");
	}

	public void receberMensagem() {
		System.out.println("Recebeu à mensagem.");
		System.out.println(" ");
	}

	// Métodos privados, visível somente pela Classe
	private void validarConexaoInternet() {
		System.out.println("Verificando conexão com a internet ...");
		System.out.println("Conectado !");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Histórico de mensagens salvas !");
	}

}
