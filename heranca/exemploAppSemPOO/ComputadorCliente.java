package orientacaoObjetos.heranca.exemploAppSemPOO;

public class ComputadorCliente {

	public static void main(String[] args) {
		// Iniciar o MSN MEsseger
		MSNMensseger msn = new MSNMensseger();
		
		// msn.validarConexaoInternet(); após mudar a visibilidade do método para private, a classe filha não terá mais acesso. 
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem();
		msn.receberMensagem();
		
		Whatsapp whats = new Whatsapp();
		
		whats.enviarMensagem();
		whats.receberMensagem();
		
		Telegram tlg = new Telegram();
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
