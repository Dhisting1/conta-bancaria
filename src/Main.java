
import cliente.Cliente;
import tipo_conta.Conta;
import tipo_conta.ContaCorrente;
import tipo_conta.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta cp = new ContaPoupanca(cliente);
        Conta cc = new ContaCorrente(cliente);
    }
}
