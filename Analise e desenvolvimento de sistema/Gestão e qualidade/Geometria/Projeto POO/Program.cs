namespace ConsoleApp3
{
    using static System.Console;
    internal class Program
    {
        static void Main(string[] args)
        {
            WriteLine(" 1.  entrada e saida de dados \n 2.  operação aditiva \n 3.  conversão de tipos \n 4.  concatenação de strings \n 5.  calculo de área\n 6.  uso if \n 7.  uso switch \n 8.  uso for \n 9.  uso while \n 10. uso do-while");
            WriteLine("O que voce quer fazer: ");
            int opção = Convert.ToInt32(Console.ReadLine());
            switch (opção)
            {
                case 1:
                    Metodos.atividade1();
                    break;
                case 2:
                    Metodos.atividade2();
                    break;
                case 3:
                    Metodos.atividade3();
                    break;
                case 4:
                    Metodos.atividade4();
                    break;
                case 5:
                    Metodos.atividade5();
                    break;
                default:
                    WriteLine("Opção invalida");
                    break;
            }
              
            
            
        }
    }
}
