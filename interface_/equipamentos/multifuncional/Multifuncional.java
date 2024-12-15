package orientacaoObjetos.interface_.equipamentos.multifuncional;

import orientacaoObjetos.interface_.equipamentos.Impressora.Impressora;
import orientacaoObjetos.interface_.equipamentos.copiadora.Copiadora;
import orientacaoObjetos.interface_.equipamentos.digitalizadora.Digitalizadora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void imprimir() {
		System.out.println("Imprimindo ... Multifuncional");
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando ...Multifuncional");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando ...Multifuncional");
	}

}
