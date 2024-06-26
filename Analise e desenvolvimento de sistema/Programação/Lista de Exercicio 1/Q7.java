import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        double custofabrica,dist = 0.28,imposto = 0.45;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de fabrica: ");
        custofabrica = input.nextInt();
        double custoconsumidor = custofabrica + (custofabrica * dist) + (custofabrica * imposto);
        System.out.println("o total  do consumidor é: "+ custoconsumidor);
        input.close();
    }
}
