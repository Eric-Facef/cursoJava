package sintaxe.metodos;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando..." + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo..." + canal);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando..." + volume);
    }
    public void abaixarVolume(){
        volume--;
        System.out.println("Diminuindo... " + volume);

    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
} 
