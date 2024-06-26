package vscode_projects;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        //ler a entrada dos valores
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do premio: ");
        double premio = ler.nextDouble();
        ler.close();
        // calculo das porcentagens
        double primeiro = premio * 0.46;
        double segundo = premio * 0.32;
        double terceiro = premio - (primeiro + segundo);
        //impressão da quantidade dos es
        System.out.println("Primeiro ganhador: R$ " + primeiro);
        System.out.println("Segundo ganhador: R$ " + segundo);
        System.out.println("Terceiro ganhador: R$ " + terceiro);
    }
}