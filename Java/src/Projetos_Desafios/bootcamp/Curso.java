package Projetos_Desafios.bootcamp;

/**
 * HERANÇA: Curso é um tipo específico de ConteudoEducacional.
 * Possui carga horária fixa, definida na criação do curso.
 */
public class Curso extends ConteudoEducacional {

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // POLIMORFISMO: curso calcula a carga horária apenas retornando o valor fixo
    @Override
    public double calcularCargaHoraria() {
        return this.cargaHoraria;
    }
}