namespace Geometria
{
    using CalculadoraDeArea;
    using System.Security.AccessControl;
    using static System.Console;
    internal class Program
    {

        static void Main(string[] args)
        {

            WriteLine("Digite o valor de X:");
            double x = Convert.ToDouble(ReadLine());

            WriteLine("Digite o valor de Y:");
            double y = Convert.ToDouble(ReadLine());

            double z = 0;
            WriteLine("digite o valor de Z para o triangulo:");
            z = Convert.ToDouble(ReadLine());

            var retangulo = new Retangulo(x, y);
            var quadrado = new Quadrado(x);
            var triangulo = new Triangulo(x, y, z);
            var circulo = new Circulo(x);
            var losango = new Losango(x, y);

            WriteLine("\n--- Cálculos ---");
            WriteLine($"Retângulo: Área = {retangulo.CalcularArea()}, Perímetro = {retangulo.CalcularPerimetro()}");
            WriteLine($"Quadrado: Área = {quadrado.CalcularArea()}, Perímetro = {quadrado.CalcularPerimetro()}");
            WriteLine($"Triângulo: Área = {triangulo.CalcularArea()}, Perímetro = {triangulo.CalcularPerimetro()}");
            WriteLine($"Círculo: Área = {circulo.CalcularArea()}, Perímetro = {circulo.CalcularPerimetro()}");
            WriteLine($"Losango: Área = {losango.CalcularArea()}, Perímetro = {losango.CalcularPerimetro()}");

        }


    }
}
