using System;

namespace Consola1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("El total a pagar es de: $" + calculo());

        }

        static int cantidad_de(int opcion)
        {
            string producto;
            switch (opcion){
                case 1:
                    producto = "perros";
                    break;
                case 2:
                    producto = "papas";
                    break;
                case 3:
                    producto = "bebidas";
                    break;
                default:
                    return 0;
            }
            int cantidad;
            while (true)
            {
                try
                {
                    Console.Write("Ingrese la cantidad de " + producto + ": ");
                    cantidad = int.Parse(Console.ReadLine());
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("El valor debe ser un número entero.");
                }
            }
            return cantidad;
        }

        static double calculo()
        {
            const double VALOR_PERRO = 5000;
            const double VALOR_PAPAS = 3000;
            const double VALOR_BEBIDAS = 2000;
            int[] valores = new int[3] { cantidad_de(1), cantidad_de(2), cantidad_de(3) };
            double pagar = VALOR_PERRO * valores[0] + VALOR_PAPAS * valores[1] + VALOR_BEBIDAS * valores[2];
            return pagar;
        }
    }

}
