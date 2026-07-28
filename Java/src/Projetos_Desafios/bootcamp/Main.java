package Projetos_Desafios.bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando conteúdos educacionais (Curso e Mentoria) - HERANÇA
        Curso curso = new Curso("Java OO", "Aprendendo POO na prática", 80);
        Mentoria mentoria = new Mentoria("Mentoria de carreira", "Dicas de carreira dev", LocalDate.now());

        // Criando o Bootcamp e adicionando os conteúdos
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Bootcamp de formação Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        // Criando devs e inscrevendo no bootcamp
        Dev devJoao = new Dev("Joao");
        Dev devMaria = new Dev("Maria");

        devJoao.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("--- Antes de progredir ---");
        System.out.println(devJoao);
        System.out.println(devMaria);

        // Devs progredindo nos conteúdos (concluindo curso e mentoria)
        devJoao.progredir();
        devJoao.progredir();

        devMaria.progredir();

        System.out.println("\n--- Depois de progredir ---");
        System.out.println(devJoao);
        System.out.println(devMaria);

        System.out.println("\n--- Informações do Bootcamp ---");
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Devs inscritos: " + bootcamp.getDevsInscritos().size());
        System.out.println("Conteudos oferecidos: " + bootcamp.getConteudos().size());
    }
}