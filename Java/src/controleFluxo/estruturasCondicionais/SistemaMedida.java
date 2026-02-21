package controleFluxo.estruturasCondicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";

        // IF ELSE
        /*if(sigla == "P")
            System.out.println("Pequeno");
        else if(sigla == "M")
            System.out.println("Medio");
        else if(sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");*/

        // TERNARIOS
        /*String tamanho = sigla == "P" ? "pequeno" : sigla == "M" ? "Medio" : sigla =="G" ? "Grande" : "Indefinido";

        System.out.println(tamanho);*/

        // SWITCH CASE

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
        }
    }
}
