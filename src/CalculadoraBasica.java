import java.util.Scanner;
public class CalculadoraBasica {
    public static void menu() {
        System.out.println("------------------------------------------");
        System.out.println("Bienvenido a nuestra fabulosa Calculadora");
        System.out.println("------------------------------------------");
        System.out.println("<< Por favor elija una opcion del menú >>");
        System.out.println("0- Salir");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("------------------------------------------");
        System.out.print("   >> Ingrese una opción: ");

    }

    public static int suma(int num1, int num2) {//Nuestro metodo para sumar

        return num1 + num2;
    }

    public static int resta(int num1, int num2) {//Nuestro metodo para restar

        return num1 - num2;
    }
    public static int Multiplicacion(int num1, int num2) {//Nuestro metodo para multiplicar

        return num1 * num2;
    }
    public static double Division(double num1, double num2) {
        if (num2 == 0) {
            if (num1 > 0) {
                return Double.POSITIVE_INFINITY;
            } else if (num1 < 0) {
                return Double.NEGATIVE_INFINITY;
            } else {
                return Double.NaN;
            }
        }
        double resultado = num1 / num2;
        return resultado;
    }
    public static int leerEntero(String promt){//funsion leer entero
        int entero = -1;
        int cont = 0;
        do{
            try {
                System.out.print(promt+"");
                entero = new Scanner(System.in).nextInt();
                cont = 3;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un numero entero mayor a 0, por favor intentelo nuevamente: ");
                cont++; // cont = cont + 1
            }
        } while(cont != 3); // este while temrina cuando cont = 3
        return entero;
    }

    public static void main(String[] args) {
        int opcion;
        int num1 = 0, num2 = 0;     //Aqui declaramos las variables que vamos a usar.
        do {
            menu();
            opcion = leerEntero("");
            switch (opcion) {
                case 0:
                    System.out.print(" Adios. Vuelve pronto ...");
                    break;
                case 1:
                    System.out.println(" VAMOS A SUMAR ");
                    do {
                        num1 = leerEntero("  Ingrese el primer número: ");
                        num2 = leerEntero("  Ingrese el segundo número: ");
                        System.out.println("   El resultado es: " + suma(num1, num2));
                    }while (opcion==3);

                    break;
                case 2:
                    System.out.println(" VAMOS A RESTAR ");
                    num1 = leerEntero("  Ingrese el primer número: ");
                    num2 = leerEntero("  Ingrese el segundo número: ");
                    System.out.println("   El resultado es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println(" VAMOS A MULTIPLICAR ");
                    num1 = leerEntero("  Ingrese el primer número:");
                    num2 = leerEntero("  Ingrese el segundo número:");
                    System.out.println("   El resultado es: " + Multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println(" VAMOS A DIVIDIR ");
                    num1 = leerEntero("  Ingrese el primer número:");
                    num2 = leerEntero("  Ingrese el segundo número:");
                    System.out.println("   El resultado es: " + Division(num1, num2));
                    break;
                default:
                    System.out.println("Opcion inválida. Intentelo nuevamente: ");
                    break;
            }


        } while (opcion != 0);
    }
}
