package Projetos_Desafios.BancoDigital;

/**
 * ABSTRAÇÃO: Conta representa o que há em comum entre Conta Corrente
 * e Conta Poupança: número, saldo, titular e as operações de
 * depósito, saque e transferência.
 *
 * É abstrata porque, no domínio, não existe "uma conta" solta —
 * ela sempre é corrente ou poupança.
 */
public abstract class Conta {

    private static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo;
    protected Cliente titular;

    public Conta(Cliente titular) {
        this.numero = SEQUENCIAL++;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    // ENCAPSULAMENTO: quem usa a conta não precisa saber como o saldo
    // é alterado internamente, só chama depositar/sacar/transferir.
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado na conta " + numero + ".");
    }

    /**
     * POLIMORFISMO: cada tipo de conta (corrente, poupança) pode
     * ter uma regra diferente para autorizar o saque
     * (ex: conta corrente com cheque especial).
     */
    public abstract boolean sacar(double valor);

    /**
     * A transferência é comum a qualquer tipo de conta: sempre
     * "saca daqui, deposita lá". Como sacar() é polimórfico,
     * este método funciona igual para ContaCorrente ou ContaPoupanca,
     * sem precisar saber qual é o tipo concreto.
     */
    public boolean transferir(double valor, Conta contaDestino) {
        boolean sacou = this.sacar(valor);
        if (sacou) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor
                    + " da conta " + this.numero + " para a conta " + contaDestino.numero + " realizada.");
            return true;
        }
        System.out.println("Transferência não realizada: saldo insuficiente na conta " + this.numero + ".");
        return false;
    }

    public void exibirExtrato() {
        System.out.println("Conta " + numero + " (" + this.getClass().getSimpleName() + ")"
                + " - Titular: " + titular.getNome()
                + " - Saldo: R$ " + saldo);
    }
}
