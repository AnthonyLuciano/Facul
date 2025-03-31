namespace Geometria
{
    using CalculadoraDeArea;
    using System.Security.AccessControl;
    using static System.Console;
    internal class Program
    {

        static void Main(string[] args)
        {

            Console.WriteLine("Digite o valor de X:");
            double x = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite o valor de Y:");
            double y = Convert.ToDouble(Console.ReadLine());

            double z = 0;
            Console.WriteLine("digite o valor de Z para o triangulo:");
            z = Convert.ToDouble(Console.ReadLine());

            var retangulo = new Retangulo(x, y);
            var quadrado = new Quadrado(x);
            var triangulo = new Triangulo(x, y, z);
            var circulo = new Circulo(x);
            var losango = new Losango(x, y);

            Console.WriteLine("\n--- Cálculos ---");
            Console.WriteLine($"Retângulo: Área = {retangulo.CalcularArea()}, Perímetro = {retangulo.CalcularPerimetro()}");
            Console.WriteLine($"Quadrado: Área = {quadrado.CalcularArea()}, Perímetro = {quadrado.CalcularPerimetro()}");
            Console.WriteLine($"Triângulo: Área = {triangulo.CalcularArea()}, Perímetro = {triangulo.CalcularPerimetro()}");
            Console.WriteLine($"Círculo: Área = {circulo.CalcularArea()}, Perímetro = {circulo.CalcularPerimetro()}");
            Console.WriteLine($"Losango: Área = {losango.CalcularArea()}, Perímetro = {losango.CalcularPerimetro()}");

        }


    }
}
