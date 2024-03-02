public class PrimeiraClasse {

    public static void main(String[] args) {
        // Cria uma instância da classe Celular
        Celular motoG = new Celular();
        motoG.marca = "Motorola";
        motoG.modelo = "Moto G Power";
        motoG.lancamento = "2021";

        // Chama os métodos da instância motoG
        motoG.conectadoAoCarregador();
        motoG.carregando();
        motoG.carregado();

        // Imprime uma mensagem usando os dados do celular
        System.out.println("Seu celular " + motoG.marca + " está carregado, desconecte-o do carregador");
    }
}
