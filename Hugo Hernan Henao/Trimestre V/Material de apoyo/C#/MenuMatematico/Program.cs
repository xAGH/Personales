using System;

namespace MenuMatematico
{
    class Program
    {
        static void Main(string[] args)
        {
            iniciar();
        }

        static int seleccionar_opcion()
        {
            int eleccion;
            string mensaje = "Elija una opción:\n\n";
            mensaje += "1. Constante.\n2. Seno.\n3. Coseno.\n4. Potencia.\n5. Raíz.\n6. Salir.\nIngrese una opción: ";
            Console.WriteLine("Bienvenido.");
            while (true)
            {
                try
                {
                    Console.Write(mensaje);
                    eleccion = int.Parse(Console.ReadLine());
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Ingrese un valor entero");
                }
            }
            return eleccion;
        }

        static void iniciar()
        {
            bool bandera = true;
            string resultado;
            while (bandera)
            {
                int eleccion = seleccionar_opcion();
                switch (eleccion)
                {
                    case 1:
                        resultado = constantes();
                        break;
                    case 2:
                        resultado = calculo_sin_cos(1);
                        break;
                    case 3:
                        resultado = calculo_sin_cos(2);
                        break;
                    case 4:
                        resultado = caculo_potencia();
                        break;
                    case 5:
                        resultado = calculo_raiz();
                        break;
                    case 6:
                        Console.Clear();
                        resultado = "Saliendo.";
                        bandera = false;
                        break;
                    default:
                        resultado = "Entrada inválida";
                        break;
                }
                Console.WriteLine(resultado);
            }
        }

        static string constantes()
        {
            Console.WriteLine("==================== Eligió Contantes ====================");
            const double PI = Math.PI;
            const double E = Math.E;
            int eleccion;
            string resultado;
            string mensaje = "Que desea ver: \n1. Pi.\n2. E.\n3. Ambos.\n4. Volver.\nIngrese una opción: ";
            while (true)
            {
                try
                {
                    Console.Write(mensaje);
                    eleccion = int.Parse(Console.ReadLine());
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Ingrese un valor entero");
                }
            }

            switch (eleccion)
            {
                case 1:
                    resultado = "El valor de PI es: " + PI;
                    break;
                case 2:
                    resultado = "El valor de EULER es: " + E;
                    break;
                case 3:
                    resultado = "El valor de PI es: " + PI + " y el valor de EULER es: " + E;
                    break;
                default:
                    resultado = "Saliendo...";
                    break;
            }

            return resultado;
        }

        static string calculo_sin_cos(int sin_cos)

        {
            Console.WriteLine("==================== Eligió Seno - Coseno ====================");
            double numero;
            while (true)
            {
                try
                {
                    Console.Write("Ingrese un número: ");
                    numero = double.Parse(Console.ReadLine());
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Solo se permiten números.");
                }
            }
            if (sin_cos == 1)
            {
                double seno = Math.Sin(numero);
                return "El seno de " + numero + " es " + seno;
            }
            else
            {
                double coseno = Math.Cos(numero);
                return "El coseno de " + numero + " es " + coseno;
            }
            
        }

        static string caculo_potencia()
        {
            Console.WriteLine("==================== Eligió Potencia ====================");
            double numero, potencia, numero_potenciado;
            while (true)
            {
                try
                {
                    Console.Write("Ingrese un número: ");
                    numero = double.Parse(Console.ReadLine());
                    Console.Write("Ingrese la potencia: ");
                    potencia = double.Parse(Console.ReadLine());
                    if (potencia == 0 && numero == 0)
                    {
                        Console.Clear();
                        Console.WriteLine("La potencia no puede ser 0 si el número es 0.");
                        continue;
                    }
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Solo se permiten números.");
                }
            }
            numero_potenciado = Math.Pow(numero, potencia);
            return "El número " + numero + " elevado al " + potencia + " es " + numero_potenciado;
        }

        static string calculo_raiz()
        {
            Console.WriteLine("==================== Eligió Raíz ====================");
            double numero;
            double raiz;
            while (true)
            {
                try
                {
                    Console.Write("Ingrese un número: ");
                    numero = double.Parse(Console.ReadLine());
                    Console.Write("Ingrese la raíz: ");
                    raiz = double.Parse(Console.ReadLine());
                    if (numero < 0 &&  raiz % 2 == 0)
                    {
                        Console.Clear();
                        Console.WriteLine("El número no puede ser negativo si la raíz es par.");
                        continue;
                    }
                    break;
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Solo se permiten números.");
                }
            }
            double raiz_formato = 1 / raiz;
            return "La raíz " + raiz + " de " + numero + " es " + Math.Pow(numero, raiz_formato);
        }
    }
}
