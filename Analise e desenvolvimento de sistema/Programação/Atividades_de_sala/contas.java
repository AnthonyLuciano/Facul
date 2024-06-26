package Atividades_de_sala;

public class contas {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static double soma(double a, double b) {
        return a + b;
    }
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int resultado1 = soma(2,3);
        double resultado2 = soma(4.2,3.3);
        int resultado3 = soma(32,28,12);
    
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
        System.out.println("Resultado3: " + resultado3);
    }
}
