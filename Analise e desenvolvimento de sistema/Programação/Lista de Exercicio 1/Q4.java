import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int dias,meses,anos;
        Scanner input = new Scanner(System.in);
        System.out.print("digite sua idade em dias: ");
        dias = input.nextInt();
        meses = dias / 30;
        anos = meses / 12;
        System.out.println("Sua idade: "+dias+" dias, "+meses+" meses, "+anos+" anos, ");
        input.close();
    }
}
