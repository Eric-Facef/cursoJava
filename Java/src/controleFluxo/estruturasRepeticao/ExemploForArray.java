package controleFluxo.estruturasRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        // FOR
        /*for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }*/

        // FOR EACH
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
