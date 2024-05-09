package vscode_projects.revisoes;
import java.util.Scanner;
public class matrizrevisão {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int matriz[][] = new int[3][3];
    int l,a;
    int x = 0;
    //coletar valores para a matriz
    for(l=0; l<=2; l++){
        for(a=0; a<=2; a++){
            System.out.print("\nEntra valor ["+(l+1)+"] ["+(a+1)+"] :: ");
            matriz[l][a] = input.nextInt();
        }
    }
    //print matiz completa
    System.out.print("\n:: Valores da matriz ::\n\n");
    for(l=0; l<=2; l++){
        for(a=0; a<=2; a++){
        System.out.print("["+matriz[l][a]+"]");
        if (a == 2) {
            System.out.print("\n");
        }
        }
    }
    //diagonal
    for(l=0; l<=2; l++){
        for(a=0; a<=2; a++){
            if (l==a) {
                 x=x+matriz[l][a];
            }
        }
    }
    System.out.print("\n::a soma da diagonal principal:: \n\n");
    System.out.print("["+(x)+"]");
    System.out.print("\n");
}
} 
