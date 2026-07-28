package Projetos_Desafios.bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa o Bootcamp em si: agrega uma lista de conteúdos
 * (Cursos e/ou Mentorias) e a lista de Devs inscritos.
 */
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private List<Dev> devsInscritos = new ArrayList<>();

    // POLIMORFISMO: a lista guarda ConteudoEducacional, mas cada elemento
    // pode ser um Curso ou uma Mentoria concreto.
    private List<ConteudoEducacional> conteudos = new ArrayList<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public List<ConteudoEducacional> getConteudos() {
        return conteudos;
    }
}