using System;

namespace CalculadoraDeArea
{
    public abstract class FiguraGeometrica
    {
        public double X { get; set; }
        public double Y { get; set; }
        public double Z { get; set; }

        public FiguraGeometrica(double x, double y, double z = 0)
        {
            X = x;
            Y = y;
            Z = z;
        }

        public abstract double CalcularArea();
        public abstract double CalcularPerimetro();
    }

    // Subclasse para Retângulo
    public class Retangulo : FiguraGeometrica
    {
        public Retangulo(double x, double y) : base(x, y) { }

        public override double CalcularArea()
        {
            return X * Y;
        }

        public override double CalcularPerimetro()
        {
            return 2 * (X + Y);
        }
    }

    // Subclasse para Quadrado
    public class Quadrado : FiguraGeometrica
    {
        public Quadrado(double x) : base(x, 0) { }

        public override double CalcularArea()
        {
            return X * X;
        }

        public override double CalcularPerimetro()
        {
            return 4 * X;
        }
    }

    // Subclasse para Triângulo
    public class Triangulo : FiguraGeometrica
    {
        public Triangulo(double x, double y, double z) : base(x, y, z) { }

        public override double CalcularArea()
        {
            return (X * Y) / 2;
        }

        public override double CalcularPerimetro()
        {
            return X + Y + Z;
        }
    }

    // Subclasse para Círculo
    public class Circulo : FiguraGeometrica
    {
        public Circulo(double x) : base(x, 0) { }

        public override double CalcularArea()
        {
            return Math.PI * (X * X);
        }

        public override double CalcularPerimetro()
        {
            return 2 * Math.PI * X;
        }
    }

    // Subclasse para Losango
    public class Losango : FiguraGeometrica
    {
        public Losango(double x, double y) : base(x, y) { }

        public override double CalcularArea()
        {
            return (X * Y) / 2;
        }

        public override double CalcularPerimetro()
        {
            double lado = Math.Sqrt(Math.Pow(X / 2, 2) + Math.Pow(Y / 2, 2));
            return 4 * lado;
        }
    }
}