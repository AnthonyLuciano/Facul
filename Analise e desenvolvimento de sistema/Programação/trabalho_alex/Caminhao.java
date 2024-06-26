package trabalho_alex;

public class Caminhao extends Transportes {
    private int capacidadeCarga;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, String numeroCartaoCredito, double precoAluguel, int capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, numeroCartaoCredito, precoAluguel);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public void imprimirDetalhes() {
        System.out.println("Caminhão:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço de aluguel: " + getPrecoAluguel());
        System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " kg");
        System.out.println("Número de eixos: " + getNumeroEixos());
    }

}
