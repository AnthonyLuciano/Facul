package vscode_projects;
public class rectangle {
    public static void main(String[] args) {
        retangulo R= new retangulo(12,23); 
        R.Area();
        R.perimetro();
       }

}
    class retangulo {
        int L;
        int A;

            public retangulo(int L, int A){
                this.L=L;
                this.A=A;
            }
        public void Area(){
            System.out.println(L*A);
        }
        public void perimetro(){
            System.out.println(2*(L+A));
        }
        public int getL(){
            return L;
        }
        public int getA(){
            return A;
        }
    }