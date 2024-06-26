package vscode_projects;
import java.util.Scanner;
public class Calculadora {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("::Calculadora::");
        nada();
        System.out.println("Digite o Valor do primeiro numero: ");
        num1 = input.nextDouble();
        nada();
        System.out.println("O que gostaria de fazer?");
        System.out.println("1 - Adicionar    2 - Subtrair");
        System.out.println("3 - Multiplicar  4 - Dividir");
        nada();
        System.out.print("Escolha: ");
        int opção = input.nextInt();
        nada();
        switch (opção) {
            case 1:
                System.out.println("Digite o Valor do segundo numero: ");
                num2 = input.nextDouble();
                result = num1 + num2;
                System.out.print("o resultado è: "+result);
                break;
            case 2:
                System.out.print("Digite o Valor do segundo numero: ");
                num2 = input.nextDouble();
                result = num1 - num2;
                System.out.println("o resultado è: "+result);
                break;
            case 3:
                System.out.print("Digite o Valor do segundo numero: ");
                num2 = input.nextDouble();
                result = num1 * num2;
                System.out.println("o resultado è: "+result);              
                break;
            case 4:
                System.out.print("Digite o Valor do segundo numero: ");
                num2 = input.nextDouble();
                result = num1 / num2;
                System.out.println("o resultado è: "+result);
                break;    
            default: 
                System.out.println("Nenhuma opção valida, reinicie o .java");
                return;
        }
        input.close();
    }
    public static void nada() {System.out.print("\n");}
}