package Atividades_de_sala;
import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        int tamC= 2;
        int tamL= 3;
        String[][] frutas = new String[tamL][tamC];
        Scanner input = new Scanner(System.in);

        //preencha a mmatriz com os nomes de fritas utilizando
        for(tamL=0; tamL<2; tamL++){
            for(tamC=0; tamC<3; tamC++){
                System.out.print("Digite o nome da fruta: ");
                frutas[tamL][tamC] = input.nextLine();
            }
        }
        input.close();
        //exibe as frutas da matriz
        for(tamL=0; tamL<2; tamL++){
            for(tamC=0; tamC<3; tamC++){
                System.out.println(frutas[tamL][tamC]);
            }
        }
    }
}

