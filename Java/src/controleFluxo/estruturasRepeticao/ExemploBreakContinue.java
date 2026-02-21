package controleFluxo.estruturasRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        // BREAK
        /*for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                break;
            System.out.println(numero);
        }*/
        // CONTINUE
        /*for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;
            System.out.println(numero);
        }*/
        for(int numero = 0; numero <= 100; numero++){
            if(numero % 2 != 0)
                continue;
            System.out.println(numero);
        }
    }
}
