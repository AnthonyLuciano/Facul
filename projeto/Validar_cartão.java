import java.util.Scanner;
public class cartao {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o número do cartão de crédito: ");
            String cartao = input.nextLine();
            input.close();
    
            if (cartao.length() > 16) {
                System.out.println("Cartão de crédito inválido");
                return;
            }
    
            for (char c : cartao.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Cartão de crédito inválido");
                    return;
                }
            }
    
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < cartao.length(); i += 2) {
                sum1 += cartao.charAt(i) - '0';
                int d = 2 * (cartao.charAt(i + 1) - '0');
                while (d > 10) {
                    int a = d / 10;
                    int b = d % 10;
                    sum2 += a + b;
                    d = a + b;
                }
                sum2 += d;
            }
    
            int total = sum1 + sum2;
            int verificador = 10 - (total % 10);
            if (verificador == 10) {
                verificador = 0;
            }
    
            if (cartao.startsWith("4")) {
                System.out.println("Visa");
            } else if (cartao.startsWith("51") || cartao.startsWith("52") || cartao.startsWith("53") || cartao.startsWith("54") || cartao.startsWith("55")) {
                System.out.println("MasterCard");
            } else if (cartao.startsWith("34") || cartao.startsWith("37")) {
                System.out.println("American Express");
            } else if (cartao.startsWith("50") || (cartao.startsWith("56") || cartao.startsWith("57") || cartao.startsWith("58") || cartao.startsWith("59"))) {
                System.out.println("Maestro");
            }
        }
    } 

