package Projetos_Desafios.candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"F", "M", "J", "P", "A"};
        for(String candidato : candidatos) {
            entrandoContato(candidato);
        }
    }
    static void entrandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " , NÚMERO MAXIMO DE TENTATIVAS" + tentativasRealizadas + " REALIZADA");
    }
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados() {
        String [] candidatos = {"F", "M", "J", "P", "A"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"F", "M", "J", "P", "A", "D", "E", "V", "W", "E"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido)
                System.out.println("O candidato " + candidato + " foi selecionado a vaga");      
                candidatosSelecionados++;
            candidatoAtual++;
        }
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
