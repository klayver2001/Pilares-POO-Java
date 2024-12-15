package orientacaoObjetos.abstracao;

public class ComputadorCliente {

	public static void main(String[] args) {
		// Iniciar o MSN MEsseger
		MSNMessenger msn = new MSNMessenger();
		
		// msn.validarConexaoInternet(); após mudar a visibilidade do método para private, a classe filha não terá mais acesso. 
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem();
		msn.receberMensagem();
		
		// Iniciar o Whatsapp
		Whatsapp whats = new Whatsapp();
		
		whats.enviarMensagem();
		whats.receberMensagem();
		
		// Iniciar o Telegram
		Telegram tlg = new Telegram();
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
