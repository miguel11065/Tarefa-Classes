public class Celular {
    //Informações de um celular
    public String marca;
    public String modelo;
    public String lancamento;

    //Ações do carregamento de um celular
    public void conectadoAoCarregador() {
        System.out.println("Celular foi conectado ao carregador.");
    }
    public void carregando() {
        System.out.println("Celular está com 50% de bateria.");
    }
    public void carregado() {
        System.out.println("Celular está 100% carregado!");
    }
}
