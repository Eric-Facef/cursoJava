package controleFluxo.estruturasRepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoces = valorAleatorio();
            if(valorDoces > mesada)
                valorDoces = mesada;

            System.out.println("Doce do valor:" + valorDoces + " Adicionado no carrinho");
            mesada = mesada - valorDoces;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a sua mesada em doces");
    }
    
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
