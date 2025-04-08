using System;
using static System.Console;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    class Metodos
    {
        public static void atividade1()
        {
            //atividade 1
            WriteLine("==========atividade 1=========");
            WriteLine("Digite um numero inteiro: ");
            int x = Convert.ToInt32(Console.ReadLine());
            Write("o numero que voce digitou foi: " + x + "\n");
        }
        public static void atividade2() {
            //atividade 2
            WriteLine("==========atividade 2=============");
            WriteLine("Digite um numero inteiro para somar: ");
            int numero = Convert.ToInt32(Console.ReadLine());
            WriteLine("Digite outro numero inteiro para somar: ");
            int numero2 = Convert.ToInt32(Console.ReadLine());
            int numero3 = numero + numero2;
            WriteLine("Resposta: " + numero3 + "\n");
        }
        public static void atividade3() {
            WriteLine("==========atividade 3=============");
            WriteLine("digite um numero inteiro: ");
            double numero4 = Convert.ToDouble(Console.ReadLine());
            numero4 = Convert.ToInt32((int)numero4);
            WriteLine(numero4 + "\n");
        }
        public static void atividade4() {
            //atividade 4
            WriteLine("==========atividade 4=============");
            WriteLine("digame seu nome:");
            string nome = ReadLine();
            WriteLine("bem vindo: " + nome + "\n");
        }
        public static void atividade5() {
            //atividade 5
            WriteLine("==========atividade 5=============");
            WriteLine("Digite um numero para a area:");
            int area = Convert.ToInt32(Console.ReadLine());
            WriteLine("Digite um numero para a altura");
            int altura = Convert.ToInt32(Console.ReadLine());
            int soma = area + altura;
            WriteLine("o total do retangulo deu: " + soma);
        }
        public static void atividade6() {
               
        } 
        public static void atividade7() { }
        public static void atividade8() { }
        public static void atividade9() { }
        public static void atividade10() { }
    }
}
