package Atividades_de_sala;
import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
    //coletar os numeros. numero 1.      
        System.out.print("digite um numero: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(); 
    //numero 2       
        System.out.print("digite outro numero: "); 
        int y = input.nextInt();
    //resultado
        int resultado = somar(x,y);      
        System.out.print("o resultado é: " + resultado);  
        input.close();
    }
    //soma dos numeros    
    public static int somar(int x, int y) { 
        int soma = x + y;
        return soma;}
    }