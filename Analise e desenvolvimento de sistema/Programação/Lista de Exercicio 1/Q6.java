import java.util.Scanner;


public class Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o tempo de duração do evento em segundos: ");
        int segundos = input.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        System.out.printf("O tempo de duração do evento é: %d horas, %d minutos e %d segundos.%n", horas, minutos, segundosRestantes);
        input.close();

    }

}
