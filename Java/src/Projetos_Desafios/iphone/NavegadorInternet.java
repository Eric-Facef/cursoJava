package Projetos_Desafios.iphone;
/**
 * Representa o papel de "comunicador de internet" do iPhone,
 * conforme apresentado por Steve Jobs no lançamento de 2007.
 */
public interface NavegadorInternet {

    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}