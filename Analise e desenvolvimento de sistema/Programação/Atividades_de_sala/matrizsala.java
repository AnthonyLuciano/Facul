package Atividades_de_sala;
import java.util.Scanner;
public class matrizsala {
    public static void main(String[] args) {
        int x=3,y=3;
        int vetor[][] = new int[x][y];
         Scanner input = new Scanner(System.in);
            //coletar os numeros
         for(x=0; x<3; x++){
            for(y=0; y<3; y++){
                System.out.print("Digite numeros: ");
                vetor[x][y] = input.nextInt();
            }
        }
            input.close();
            //mostrar os numeros
            for(x=0; x<3; x++){
                for(y=0; y<3; y++){
                    if (vetor[x][y] % 2 == 0) {
                        System.out.println("Aqui estao os numeros pares:"+ vetor[x][y]);
                    }
                }
            }
    }
}

