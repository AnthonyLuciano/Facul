package projeto;
public abstract class Transportes {
    private String marca;
    private String modelo;
    private int ano;
    private double precoAluguel;

    public Transportes(String marca, String modelo, int ano, String Cartao, double precoAluguel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoAluguel = precoAluguel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public abstract void imprimirDetalhes();{

    }
}
