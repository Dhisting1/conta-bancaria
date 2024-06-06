package tipo_conta;

import cliente.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta corrente: ");
        super.imprimirInformacoesComuns();
    }


}
