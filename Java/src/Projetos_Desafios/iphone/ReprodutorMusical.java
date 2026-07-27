package Projetos_Desafios.iphone;
/**
 * Representa o papel de "iPod" (reprodutor musical) do iPhone,
 * conforme apresentado por Steve Jobs no lançamento de 2007.
 */
public interface ReprodutorMusical {

    void tocar();

    void pausar();

    void selecionarMusica(String nomeMusica);
}