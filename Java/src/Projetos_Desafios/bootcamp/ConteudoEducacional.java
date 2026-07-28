package Projetos_Desafios.bootcamp;

/**
 * ABSTRAÇÃO: representa o que há em comum entre os diferentes
 * conteúdos educacionais oferecidos por um Bootcamp (Curso, Mentoria).
 *
 * É abstrata porque não faz sentido existir um "ConteudoEducacional"
 * genérico solto no sistema — ele sempre é um Curso ou uma Mentoria.
 */
public abstract class ConteudoEducacional {

    protected String titulo;
    protected String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * POLIMORFISMO: cada subclasse (Curso, Mentoria) calcula
     * a própria carga horária de um jeito diferente.
     */
    public abstract double calcularCargaHoraria();
}