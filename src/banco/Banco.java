package banco;
import tipo_conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    protected String nome;
    private final List<Conta> contas = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void listarClientes(Conta cliente){
        
    }
}
