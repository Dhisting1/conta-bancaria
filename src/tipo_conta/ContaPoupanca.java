package tipo_conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato conta poupança: ");
        super.imprimirInformacoesComuns();
    }
}
