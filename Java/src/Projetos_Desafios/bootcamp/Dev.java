package Projetos_Desafios.bootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o Dev (aluno) que se inscreve em Bootcamps e vai
 * progredindo, movendo conteúdos de "inscritos" para "concluídos".
 *
 * ENCAPSULAMENTO: as listas são privadas; o acesso externo é feito
 * apenas através dos métodos inscreverBootcamp() e progredir().
 */
public class Dev {

    private String nome;
    private List<ConteudoEducacional> conteudosInscritos = new ArrayList<>();
    private List<ConteudoEducacional> conteudosConcluidos = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<ConteudoEducacional> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public List<ConteudoEducacional> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        if (conteudosInscritos.isEmpty()) {
            System.out.println(nome + " não possui conteúdos pendentes.");
            return;
        }
        ConteudoEducacional conteudo = conteudosInscritos.remove(0);
        conteudosConcluidos.add(conteudo);
    }

    /**
     * POLIMORFISMO: percorre a lista de ConteudoEducacional (curso ou
     * mentoria, não importa) somando a carga horária de cada um,
     * cada um calculando a própria conta.
     */
    public double calcularTotalHoras() {
        double total = 0;
        for (ConteudoEducacional conteudo : conteudosConcluidos) {
            total += conteudo.calcularCargaHoraria();
        }
        return total;
    }

    @Override
    public String toString() {
        return nome
                + " -> Inscrito em: " + conteudosInscritos.size()
                + " conteúdo(s), Concluiu: " + conteudosConcluidos.size()
                + " conteúdo(s), Total de horas: " + calcularTotalHoras();
    }
}