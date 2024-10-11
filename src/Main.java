import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        double division = a/b;
        double promedio = (a+b)/2;
        double combinacion = (a+b)+(a-b)+(a*b)+(a/b)+((a+b)/2);

        switch (oc){
            case 4:
                System.out.println("la division es: "+ division);
                break;

            case 5:
                System.out.println("El promedio es: "+ promedio);
                break;
            case 6:
                System.out.println("La combinacion de todas las operaciones es: "+ combinacion);
                break;
        }
    }
}