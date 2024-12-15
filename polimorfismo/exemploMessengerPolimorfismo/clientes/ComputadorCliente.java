package orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.clientes;

import orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps.MSNMessenger;
import orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps.ServicoMensagem;
import orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps.Telegram;
import orientacaoObjetos.polimorfismo.exemploMessengerPolimorfismo.apps.Whatsapp;

public class ComputadorCliente {

	public static void main(String[] args) {
		/* Com polimorfismo não sabemos qual app o cliente vai escolher, 
		 * mas todos os apps devem fornecer o serviço de enviar e receber mensagens instantâneas. */
		ServicoMensagem sm = null; 
		String appSelecionado = "wts";
		
		if (appSelecionado.equals("msn")) {
			sm = new MSNMessenger();
		} else if (appSelecionado.equals("tlg")) {
			sm = new Telegram();
		}else if(appSelecionado.equals("wts")) {
			sm = new Whatsapp();
		}
			
		sm.enviarMensagem();
		sm.receberMensagem();
	}
}
