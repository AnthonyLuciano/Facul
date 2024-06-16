import java.util.Scanner;
public class Q3 {

  public static void main(String[] args) {
    int dias,meses;
   Scanner input = new Scanner(System.in);
   System.out.print("digite sua idade: ");
    int idade = input.nextInt();
    meses = idade * 12;
    dias = meses * 30;
    System.out.println("sua idade em dias é: "+dias+ " dias");
    if(idade >= 18){
      System.out.println("voce ja é um adulto");
    }
    else{
      System.out.println("ihh, é uma criança ainda");
    }
    input.close();
  }

}