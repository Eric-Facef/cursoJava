package Projetos_Desafios.ControleFluxo;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o número um: ");
        int numero1 = terminal.nextInt();

        System.out.println("Digite o número dois: ");
        int numero2 = terminal.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }

        terminal.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numero2 - numero1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}