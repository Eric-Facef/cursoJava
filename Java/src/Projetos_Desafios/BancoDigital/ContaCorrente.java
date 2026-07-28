package Projetos_Desafios.BancoDigital;

/**
 * HERANÇA: ContaCorrente é um tipo específico de Conta,
 * com a particularidade de ter um limite de cheque especial.
 */
public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente titular, double limiteChequeEspecial) {
        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // POLIMORFISMO: o saque na conta corrente considera o cheque especial
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor <= this.saldo + this.limiteChequeEspecial) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta corrente " + numero + ".");
            return true;
        }
        return false;
    }
}
