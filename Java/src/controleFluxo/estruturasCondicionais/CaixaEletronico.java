package controleFluxo.estruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = Double.valueOf(args [0]);
        double valorSolicitado = Double.valueOf(args [1]);

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        }else
            System.out.println("O valor solicitado é menor que o seu saldo atual!" + "valor solicitado: " + valorSolicitado + "saldo atual: " + saldo);
        
    }
}
