package aula_16_04_01_poo;

public class professor extends tecnico{
    private String disciplina;

    public professor(String nome, String cpf, int idade, int salario, String disciplina) {
        super(nome, cpf, idade, salario);
        this.disciplina = disciplina;
    }

    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}