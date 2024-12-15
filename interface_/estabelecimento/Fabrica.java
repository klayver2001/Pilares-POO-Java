package orientacaoObjetos.interface_.estabelecimento;

import orientacaoObjetos.interface_.equipamentos.Impressora.Impressora;
import orientacaoObjetos.interface_.equipamentos.digitalizadora.Digitalizadora;
import orientacaoObjetos.interface_.equipamentos.multifuncional.Multifuncional;
import orientacaoObjetos.interface_.equipamentos.copiadora.Copiadora;

public class Fabrica {
	public static void main(String[] args) {
	
		Multifuncional multifuncional  = new Multifuncional();
		
		Impressora impressora = multifuncional;
		Copiadora copiadora = multifuncional;
		Digitalizadora digitalizadora = multifuncional;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
