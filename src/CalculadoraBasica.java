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
    public static double Division(int num1, int num2) {
        double resultados;
        try {
            resultados = (double) num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero");
            resultados = Double.NaN;
        }
        return resultados;
    }
    public static void main(String[] args) {
        int opcion;
        int num1, num2,resultado;//Aqui declaramos las variables que vamos a usar y la inicializamos en 0.
        double resultados;
        do {
            menu();
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 0:
                    System.out.print(" Adios. Vuelve pronto ...");
                    break;
                case 1:
                    System.out.println(" VAMOS A SUMAR ");
                    System.out.print("Ingrese el primer número: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = new Scanner(System.in).nextInt();
                    resultado = suma(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.println(" VAMOS A RESTAR ");
                    System.out.print("Ingrese el primer número: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = new Scanner(System.in).nextInt();
                    resultado = resta(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.println(" VAMOS A MULTIPLICAR ");
                    System.out.print("Ingrese el primer número: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = new Scanner(System.in).nextInt();
                    resultado = Multiplicacion(num1, num2);
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    System.out.println(" VAMOS A DIVIDIR ");
                    System.out.print("Ingrese el primer número: ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = new Scanner(System.in).nextInt();
                    resultados = Division(num1, num2);
                    System.out.println("El resultado de la division es: " + resultados);
                    break;
                default:
                    System.out.println("Opcion inválida. Intentelo nuevamente: ");
                    break;
            }
        } while (opcion != 0);//calculadora terminada
    }
}
