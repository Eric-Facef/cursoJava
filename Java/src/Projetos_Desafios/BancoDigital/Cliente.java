package Projetos_Desafios.BancoDigital;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o cliente do banco, que pode possuir uma ou mais contas
 * (corrente e/ou poupança).
 */
public class Cliente {

    private String nome;
    private String cpf;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}
