import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int oc = 0, num1, num2;
        double result = 0;
        do {
            System.out.println("           ");
            System.out.println("CALCULADORA");
            System.out.println("1. suma ");
            System.out.println("2. resta ");
            System.out.println("3. multiplicacion ");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            oc = teclado.nextInt();

            if (oc >= 1 && oc <= 3) {
                System.out.print("Ingrese el primer número: ");
                num1 = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = teclado.nextInt();

                switch (oc) {
                    case 1:
                        result = suma(num1, num2);
                        System.out.println("La suma es: " + result);
                        break;
                    case 2:
                        result = resta(num1, num2);
                        System.out.println("La resta es: " + result);
                        break;
                    case 3:
                        result = multiplicacion(num1, num2);
                        System.out.println("La multiplicacion es: " + result);
                        break;
                    case 4:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            }
        } while (oc != 7);
    }

    public static double suma(int a, int b) {
        return a + b;
    }

    public static double resta(int a, int b) {
        return a - b;
    }

    public static double multiplicacion(int a, int b) {
        return a * b;
    }
}
