
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double A,B,C;
        @SuppressWarnings("unused")
        boolean reiniciar = true;
        int opcao;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        introducao();
        opcao = input.nextInt();
        switch (opcao) {
            case 1 -> {
                formula();
                System.out.print("Porfavor, Digite valor de A: ");
                A = input.nextInt();
                System.out.print("Agora, Digite valor de B: ");
                B = input.nextInt();
                System.out.print("Finalmente, Digite valor de C: ");
                C = input.nextInt();
                double R = Math.pow((A + B),2);
                double S = Math.pow((B + C),2);
                double D = (R+S) / 2;
                System.out.println("O resultado é: " + D);
                break;
            }
            case 2 ->{
                System.out.println("certo, ate mais.");
                System.exit(opcao);
                break;
            }
            default -> {
                System.out.println("parabens, voce quebrou o programa, reinicio.");
            }
        }
        System.out.println("reiniciar? (s/n)");
                char resposta = input.next().charAt(0);
                if (resposta == 'n' || resposta == 'N') {
                    reiniciar = false;
                    System.out.println("Ate mais!");
                    
    }
    
}
    private static void formula(){
        System.out.println("Certo... estamos fazendo:");
        System.out.println("D = (R + S)/2");
        System.out.println("onde R = (A+B)^2 e S = (B+C)^2");
    }
    private static void introducao() {
        System.out.println("||ola! bem vindo a um de meus programas.||");
        System.out.println("||eu imagino que voce seja novo por aqui.||");
        System.out.println("||mas mudando de assunto, voce quer testar esse programa?||");
        System.out.println("[1 - Sim]");
        System.out.println("[2 - Não]");
    }
}


