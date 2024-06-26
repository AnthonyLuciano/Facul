import java.util.Scanner;

public class Q8 {
   public static void main(String[] args){
    double a,b,c,d,e,f,x,y;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite 6 numeros de A - F:");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();
    d = input.nextInt();
    e = input.nextInt();
    f = input.nextInt();
    input.close();
    x = ((c*e)-(b*f)/(a*e)-(b*d));
    y = ((a*f)-(c*d)/(a*e)-(b*d));
    System.out.print("o resultado de X é: ["+x+"] e o Resultado de Y é: ["+y+"]");
   }
}
