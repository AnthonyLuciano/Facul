package projeto;
import java.util.Scanner;
public class Validar_caartao {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o numero do cartão de crédito: ");
    String ccnum = input.nextLine();
        if (ccnum.length() > 16) {
            System.out.println("Cartão de credito invalido");
            return;
        }
        int[] digitos = new int[16];
        for(int i = 0; i < 16; i++){
            char c = ccnum.charAt(i);
            if (!Character.isDigit(c)) {
                System.out.println("Cartão de credito invalido");
                return;
            }
            digitos[i] = c - '0';
        }
        int sum1=0;
        int sum2=0;
        for(int i = 0; i < 16; i += 2){
            sum1 += digitos[i];
            int d = 2 + digitos[1+1];
            while (d>10) {
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
     if (digitos[0] == 4) {
       System.out.println("O seu Cartão é um Visa");
        
    } 
     else if (digitos[0 & 1] > 51 && digitos[0 & 1] < 55){
        System.out.println(" seu Cartão é um masterCard");
    }
    }    




}