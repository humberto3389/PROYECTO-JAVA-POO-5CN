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
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
        } else if (num2 !=0) {
            System.out.println("el ");
        }
        return num1 / num2;
    }

    public static int leerEntero(String promt, int intentos) {//funsion leer entero
        int entero = 0;
        for (int cont = 1; cont <= intentos; cont++) {
            try {
                System.out.print(promt);
                entero = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un numero entero, le quedan " + (intentos-cont) + " intento(s)");
            }
        }
        return entero;
    }

    public static void main(String[] args) {
        int opcion;
        int num1, num2;
        do {
            menu();
            opcion = leerEntero("", 3);
            switch (opcion) {
                case 0:
                    System.out.println("Adios. Vuelve pronto ...");
                    break;
                case 1:
                    System.out.println("VAMOS A SUMAR");
                    num1 = leerEntero("Ingrese el primer número: ", 3);
                    if (num1 != 0) {
                        num2 = leerEntero("Ingrese el segundo número: ", 3);
                        if (num2 != 0) {
                            System.out.println("El resultado es: " + suma(num1, num2));
                        }
                    }
                    break;
                case 2:
                    System.out.println("VAMOS A RESTAR");
                    num1 = leerEntero("Ingrese el primer número: ", 3);
                    if (num1 != 0) {
                        num2 = leerEntero("Ingrese el segundo número: ", 3);
                        if (num2 != 0) {
                            System.out.println("El resultado es: " + resta(num1, num2));
                        }
                    }
                    break;
                case 3:
                    System.out.println("VAMOS A MULTIPLICAR");
                    num1 = leerEntero("Ingrese el primer número: ", 3);
                    if (num1 != 0) {
                        num2 = leerEntero("Ingrese el segundo número: ", 3);
                        System.out.println("El resultado es: " + Multiplicacion(num1, num2));
                    }
                case 4:
                    System.out.println("VAMOS A DIVIDIR");
                    num1 = leerEntero("Ingrese el primer número: ", 3);
                    if (num1 != 0) {
                        num2 = leerEntero("Ingrese el segundo número: ", 3);
                        if (num2 != 0) {
                            System.out.println("El resultado es: " + Division(num1, num2));
                        }else{
                            System.out.println("Error al dividir por " + num2 + " ,intente con otro numero");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion inválida. Intentelo nuevamente: ");
                    break;
            }
        } while (opcion != 0) ;
    }
}

