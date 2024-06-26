package trabalho_alex;
public class Trator extends Transportes {
    private int potenciaMotor;
    private int numeroRodas;

    public Trator(String marca, String modelo, int ano, String numeroCartaoCredito, double precoAluguel, int potenciaMotor, int numeroRodas) {
        super(marca, modelo, ano, numeroCartaoCredito, precoAluguel);
        this.potenciaMotor = potenciaMotor;
        this.numeroRodas = numeroRodas;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Trator:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço de aluguel: " + getPrecoAluguel());
        System.out.println("Potência do motor: " + getPotenciaMotor() + " cv");
        System.out.println("Número de rodas: " + getNumeroRodas());
    }
}