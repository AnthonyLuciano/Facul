import java.util.Scanner;


public class treino_2 {
    public static void main(String[] args) {
        int x = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero de 14: ");
        x = input.nextInt();
        input.close();
        while (x > 0) {
            System.out.print("an");
            break;
        }
        if (x < 1) {
            System.out.print(" ");
            System.out.print("noise");
        }
        if (x == 1) {
            System.out.print(" Oyster");
        }
        //abaixo de 4(2,3) ou acima de 3(4)
        if ((x < 4) || (x > 3)) {
            System.out.print("noys");
        }   
        System.out.print("");
        
            }
            
}

