import java.util.Scanner;
public class CalendarioV1 {
    public static void mostrarCalendario(int dias, int diaini) {
        System.out.println(" D  L  M  M  J  V  S");
        for (int i = 1; i <= diaini; i++) {
            System.out.print(" . ");
        }
        int cont = diaini;
        for (int i = 1; i <= dias; i++) {
            cont++;
            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }

            if (cont % 7 == 0) {
                System.out.println();
                cont = 0;
            }
        }
        System.out.println("\n\n");
    }

    public static void calendario(int año, int mes) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] meses = {"", "ENERO", "FEBRERO", "MARZO", "ABRIL","MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        int[] iniMes = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        if (mes < 3) {//para que el año comience en marzo
            año--;
        }

        //usamos el algoritmo de Zeller
        int a = año % 100;
        int b = año / 100;
        int m = mes;
        int q = 1;
        int h = (q + 13 * (m + 1) / 5 + a + a / 4 + b / 4 + 5 * b) % 7;
        int diaini = (h + 5) % 7;

        System.out.println(meses[mes] + " " + año);
        mostrarCalendario(dias[mes - 1], diaini);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 2) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar calendario para año y mes");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();
            int cont = 0;
            if (opcion == 1) {
                System.out.println("Ingrese el año:");
                int año = scanner.nextInt();
                System.out.println("Ingrese el mes:");
                int mes = scanner.nextInt();
                if ((año >= 2023 && año <= 2030) && (mes >= 1 && mes <= 12)) {
                    calendario(año, mes);

                } else if (opcion == 2) {
                    System.out.println("Adiós!");
                }else {
                    System.out.println("Error: por favor intentelo nuevamente.");
                }
                }


        }
    }
}

