import java.util.Scanner;

public class Q8 {
   public static void main(String[] args){
    double a,b,c,d,e,f,x,y;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite 6 numeros");
    System.out.print("A:");
    a = input.nextInt();
    System.out.print("B:");
    b = input.nextInt();
    System.out.print("C:");
    c = input.nextInt();
    System.out.print("D:");
    d = input.nextInt();
    System.out.print("E:");
    e = input.nextInt();
    System.out.print("F:");
    f = input.nextInt();
    input.close();
    x = ((c*e)-(b*f)/(a*e)-(b*d));
    y = ((a*f)-(c*d)/(a*e)-(b*d));
    System.out.print("os resultados são: "+x+" e "+y);
   }
}
