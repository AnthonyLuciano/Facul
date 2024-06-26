package aula_16_04_01_poo;

public class tecnico extends pessoa {
    private double salario;

    public tecnico(String nome, String cpf, int idade, int salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }




}
