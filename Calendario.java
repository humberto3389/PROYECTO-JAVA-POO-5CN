import java.util.Scanner;
public class Calendario {
    public static void mostrarCalendario(int dias, int diaini){
        System.out.println(" D  L  M  M  J  V  S");
        for (int i = 1; i <= diaini; i++) {
            System.out.print(" . ");
        }

        int cont = diaini;
        for (int i = 1; i <= dias; i++) {
            cont++;
            if (i < 10) {
                System.out.print("0" + i + " ");
            } else {
                System.out.print(i + " ");
            }

            if (cont % 7 == 0){
                System.out.println();
                cont = 0;
            }
        }
        System.out.println("\n\n");

    }


    public static void calendario(int mes){
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] iniMes = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

        switch (mes){
            case 1:
                System.out.println("ENERO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 2:
                System.out.println("FEBRERO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 3:
                System.out.println("MARZO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 4:
                System.out.println("ABRIL");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 5:
                System.out.println("MAYO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 6:
                System.out.println("JUNIO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 7:
                System.out.println("JULIO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 8:
                System.out.println("AGOSTO");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 10:
                System.out.println("OCTUBRE");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            case 12:
                System.out.println("DICIEMBRE");
                mostrarCalendario(dias[mes-1], iniMes[mes-1]);
                break;
            default:
                System.out.println("Error: Ese mes no existe");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 2) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar calendario para un mes");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el número de mes:");
                    int mes = scanner.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        calendario(mes);
                    } else {
                        System.out.println("Error: ese mes no existe");
                    }
                    break;
                case 2:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }
}
