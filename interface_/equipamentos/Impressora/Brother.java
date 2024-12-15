package orientacaoObjetos.interface_.equipamentos.Impressora;

public class Brother implements Impressora {
	@Override
	public void imprimir() {
		System.out.println("Imprimindo ... Brother");
	}
}
