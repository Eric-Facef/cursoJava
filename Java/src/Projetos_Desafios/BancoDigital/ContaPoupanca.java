package Projetos_Desafios.BancoDigital;

/**
 * HERANÇA: ContaPoupanca também é uma Conta, mas não tem
 * cheque especial (só pode sacar o que tiver de saldo) e
 * possui rendimento mensal.
 */
public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(Cliente titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    // POLIMORFISMO: o saque na poupança não permite ficar negativo
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta poupança " + numero + ".");
            return true;
        }
        return false;
    }

    public void renderJuros() {
        double rendimento = this.saldo * (this.taxaRendimento / 100);
        this.saldo += rendimento;
        System.out.println("Conta poupança " + numero + " rendeu R$ " + rendimento + ".");
    }
}
