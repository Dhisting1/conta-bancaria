package tipo_conta;

import cliente.Cliente;
import inter.iConta;

public abstract class Conta implements iConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;


    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        }else {
            saldo -= valor;
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente, para transferência!");
        }else {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    protected void imprimirInformacoesComuns() {

        System.out.printf(String.format("Titular: %s", this.cliente.getNome() ));
        System.out.printf(String.format("\nAgencia: %d", this.agencia));
        System.out.printf(String.format("\nNumero: %d", this.numero));
        System.out.printf(String.format("\nSaldo: R$ %.2f\n", this.saldo));
    }
}