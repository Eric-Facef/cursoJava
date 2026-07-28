package Projetos_Desafios.BancoDigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital DIO");

        // Criando clientes
        Cliente joao = new Cliente("Joao", "111.111.111-11");
        Cliente maria = new Cliente("Maria", "222.222.222-22");
        banco.adicionarCliente(joao);
        banco.adicionarCliente(maria);

        // Criando contas - HERANÇA: ambas são Conta, cada uma com sua regra própria
        ContaCorrente contaJoao = new ContaCorrente(joao, 500.0); // limite de cheque especial
        ContaPoupanca contaMaria = new ContaPoupanca(maria, 0.5); // taxa de rendimento

        joao.adicionarConta(contaJoao);
        maria.adicionarConta(contaMaria);
        banco.adicionarConta(contaJoao);
        banco.adicionarConta(contaMaria);

        System.out.println("--- Depósitos ---");
        contaJoao.depositar(1000.0);
        contaMaria.depositar(2000.0);

        System.out.println("\n--- Saque ---");
        contaJoao.sacar(1200.0); // usa o cheque especial

        System.out.println("\n--- Transferência ---");
        // POLIMORFISMO: transferir() está definido só uma vez, na classe Conta,
        // e funciona tanto para ContaCorrente quanto ContaPoupanca.
        contaMaria.transferir(500.0, contaJoao);

        System.out.println("\n--- Rendimento da poupança ---");
        contaMaria.renderJuros();

        System.out.println("\n--- Extratos finais ---");
        for (Conta conta : banco.getContas()) {
            conta.exibirExtrato();
        }
    }
}