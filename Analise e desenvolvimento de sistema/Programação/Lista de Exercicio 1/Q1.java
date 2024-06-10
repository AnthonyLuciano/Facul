
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numx1 = 0, numx2 = 0, numy1 = 0, numy2 = 0;

        System.out.println("RaizQuadrada((A - B)^2 + (X - Y)^2)");
        System.out.print("Digite numero da 'A': ");
        numx1 = input.nextDouble();
        espaço();

        System.out.println("RaizQuadrada((" +numx1+ " - B)^2 + (X - Y)^2)");
        System.out.print("Digite numero da 'B': ");
        numx2 = input.nextDouble();
        espaço();

        System.out.println("RaizQuadrada((" +numx1+" - "+numx2+")^2 + (X - Y)^2)");
        System.out.print("Digite numero da 'X': ");
        numy1 = input.nextDouble();
        espaço();

        System.out.println("RaizQuadrada(("+numx1+" - "+ numx2 +")^2 + ("+numy1+" - Y)^2)");
        System.out.print("Digite numero da 'Y': ");
        numy2 = input.nextDouble();
        espaço();

        System.out.println("RaizQuadrada(("+numx1+" - "+ numx2 +")^2 + ("+numy1+" - "+numy2+")^2)");
        espaço();
        double resultado = Math.sqrt(Math.pow(numx1-numx2, 2) + Math.pow(numy1-numy2, 2));

        System.out.println("a distancia entre os dois pontos é: "+resultado);
        espaço();
        input.close();

    }
    public static void espaço(){System.out.println("\n");{}
    }
}


