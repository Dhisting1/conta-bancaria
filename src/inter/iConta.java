package inter;

import tipo_conta.Conta;

public interface iConta {
    void sacar(double valor);

    void depositar(double valor );

    void transferir(double valor, Conta destino);

    void imprimirExtrato();
}
