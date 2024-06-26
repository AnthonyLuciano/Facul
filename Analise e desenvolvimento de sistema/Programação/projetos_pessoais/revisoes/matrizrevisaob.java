package revisoes;

import java.util.Scanner;
public class matrizrevisaob {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float matriz[][] = new float[3][6];
    int l,a;
    float colimpar=0;
    float med=0,med2=0;
    for(l=0; l<=2; l++){
        for(a=0; a<=5; a++){
            System.out.print("\nEntra valor ["+(l+1)+"] ["+(a+1)+"] :: \n");
            matriz[l][a] = input.nextFloat();
        }
    }
    for(l=0; l<=2; l++){
        for(a=0; a<=5; a++){
        if (a%2!=0) {
            colimpar=colimpar+matriz[l][a];
        }
        if (a==1) {
            med=med+matriz[l][a];
        }
        if (a==3) {
           med2=med2+matriz[l][a];
        }
        }
    }
    System.out.print("soma das colunas impares: "+colimpar);
    Void();
    System.out.print("media colunas 2 e 4::" +"["+(med+med2)/6+"]");
    Void();
//soma da sexta coluna
    for(l=0;l<=2;l++){
        matriz[l][5]=matriz[l][0] +  matriz[l][1];
    }
//print matiz completa
    System.out.print("\n:: Valores da matriz ::\n\n");
    for(l=0; l<=2; l++){
        for(a=0; a<=5; a++){
        System.out.print("["+matriz[l][a]+"]");
        if (a == 5) {
            Void();
            }
        }
    }    
}
public static void Void(){System.out.println("\n");}    
}