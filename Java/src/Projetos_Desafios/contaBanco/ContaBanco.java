package Projetos_Desafios.contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuario
        // Obter pelo scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: \nAperte ENTER para continuar! ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número: \nAperte ENTER para continuar!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agência: \nAperte ENTER para continuar!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo: \nAperte ENTER para continuar!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
