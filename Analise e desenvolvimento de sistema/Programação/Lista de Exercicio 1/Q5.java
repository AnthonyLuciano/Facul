import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double peso=2,peso2=3,peso3=5;
        double pesototal= peso+peso2+peso3;
        double nota,nota2,nota3;
        double notatotal;
        System.out.print("primeria nota:");
        nota = input.nextInt();
        System.out.print("segunda nota:");
        nota2 = input.nextInt();
        System.out.print("terceira nota:");
        nota3 = input.nextInt();
        notatotal= (((nota*peso)+(nota2*peso2)+(nota3*peso3))/pesototal);
        System.out.println("a nota total do estudante é: " + notatotal);
        nada();
        input.close();

    }
    public static void nada(){
        System.out.print("");
    }
}