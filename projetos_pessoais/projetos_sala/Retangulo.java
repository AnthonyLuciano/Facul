package projetos_sala;
public class Retangulo {
    public static void main(String[] args) {
        int Resularea = Area(4, 7);
        System.out.println("a area do retangulo é: "+ Resularea);
        int Resulperimetro = Perimetro(3, 4);
        System.out.println("o perimetro do retangulo é: "+Resulperimetro);
    }
  
        //L= Largura. A = Altura.
    public static int Area(int L, int A) {
            int multi = L * A;
            return multi;
        }
    public static int Perimetro(int L, int A) {
            int equat = (2*(L + A));
            return equat;
        }
    }
