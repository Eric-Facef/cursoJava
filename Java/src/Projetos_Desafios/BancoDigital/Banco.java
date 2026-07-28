package Projetos_Desafios.BancoDigital;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a instituição financeira: agrega clientes e contas.
 * A transferência só é permitida entre contas da própria instituição
 * (regra do enunciado), então esse controle fica aqui.
 */
public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
