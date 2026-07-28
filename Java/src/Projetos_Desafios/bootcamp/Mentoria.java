package Projetos_Desafios.bootcamp;

import java.time.LocalDate;

/**
 * HERANÇA: Mentoria também é um ConteudoEducacional,
 * mas tem uma carga horária fixa por convenção (ex: 1 hora por sessão),
 * além de uma data em que ocorre.
 */
public class Mentoria extends ConteudoEducacional {

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // POLIMORFISMO: mentoria sempre tem carga horária fixa de 1 hora
    @Override
    public double calcularCargaHoraria() {
        return 1;
    }
}