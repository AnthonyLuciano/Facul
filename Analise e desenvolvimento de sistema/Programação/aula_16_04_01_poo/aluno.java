package aula_16_04_01_poo;

public class aluno extends pessoa{
    private String matricula;
    private double nota;
    
    public aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    
}