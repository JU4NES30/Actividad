import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int oc = 0, a = 0, b = 0;
        double result = 0;
        do {
            System.out.println("CALCULADORA/n");
            System.out.println("1. suma ");
            System.out.println("2. resta ");
            System.out.println("3. multiplicacion ");
            System.out.println("4. Division ");
            System.out.println("5. promedio ");
            System.out.println("6. combinacion ");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");
            oc = teclado.nextInt();

            if (oc >= 1 && oc <= 6) {
                System.out.print("Ingrese el primer número: ");
                a = teclado.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = teclado.nextInt();

                switch (oc) {
                    case 1:
                        result = suma(a, b);
                        System.out.println("La suma es: " + result);
                        break;
                    case 2:
                        result = resta(a, b);
                        System.out.println("La resta es: " + result);
                        break;
                    case 3:
                        result = multiplicacion(a, b);
                        System.out.println("La multiplicacion es: " + result);
                        break;
                    case 4:
                        if (b != 0) {
                            result = division(a, b);
                            System.out.println("La division es: " + result);
                        } else {
                            System.out.println("Error: No se puede dividir por cero");
                        }
                        break;
                    case 5:
                        result = promedio(a, b);
                        System.out.println("El promedio es: " + result);
                        break;
                    case 6:
                        if (b != 0) {
                            result = combinacion(a, b);
                            System.out.println("La combinacion de todas las operaciones es: " + result);
                        } else {
                            System.out.println("Error: No se puede dividir por cero en la combinación");
                        }
                        break;
                    case 7:
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

    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static double promedio(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static double combinacion(int a, int b) {
        return (a + b) + (a - b) + (a * b) + ((double) a / b) + ((a + b) / 2.0);
    }
}
