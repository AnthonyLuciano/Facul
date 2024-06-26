package aula_16_04_01_poo;

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);
        
        pessoa x = new pessoa("alex", "1111111111", 20);
        professor p = new professor("pablo", "null", 30, 10000, "java");
        aluno a = new aluno("luzia", "null", 10, "987564678907543");
        tecnico t = new tecnico("kritz", "111111111121", 50, 100000);

        System.out.println();
    }
}