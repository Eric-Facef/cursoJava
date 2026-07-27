package Projetos_Desafios.iphone;
import java.util.ArrayList;
import java.util.List;

/**
 * iPhone (2007): "um iPod, um telefone e um comunicador de internet.
 * Não são três aparelhos separados. É um único aparelho."
 *
 * A classe unifica os três papéis do dispositivo através das interfaces
 * ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private boolean tocando;
    private String chamadaAtiva;
    private final List<String> abasAbertas = new ArrayList<>();

    // ===== ReprodutorMusical =====

    @Override
    public void tocar() {
        if (musicaAtual == null) {
            System.out.println("Nenhuma música selecionada.");
            return;
        }
        tocando = true;
        System.out.println("Tocando: " + musicaAtual);
    }

    @Override
    public void pausar() {
        tocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        this.musicaAtual = nomeMusica;
        System.out.println("Música selecionada: " + nomeMusica);
    }

    // ===== AparelhoTelefonico =====

    @Override
    public void ligar(String numero) {
        if (tocando) {
            pausar(); // o iPhone pausa a música ao receber/fazer uma ligação
        }
        this.chamadaAtiva = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida" + (chamadaAtiva != null ? ": " + chamadaAtiva : "."));
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz visual...");
    }

    // ===== NavegadorInternet =====

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        String aba = "Nova aba " + (abasAbertas.size() + 1);
        abasAbertas.add(aba);
        System.out.println(aba + " aberta. Total de abas: " + abasAbertas.size());
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual...");
    }

    // ===== Demonstração =====

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("--- Reprodutor Musical ---");
        meuIphone.selecionarMusica("Here Comes the Sun");
        meuIphone.tocar();

        System.out.println("\n--- Aparelho Telefônico ---");
        meuIphone.ligar("(11) 91234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}