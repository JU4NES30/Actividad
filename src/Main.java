import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Estudiantes:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Obtener información de un estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Listar todos los estudiantes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID del estudiante: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    gestion.agregarEstudiante(id, nombre, edad);
                    break;
                case 2:
                    System.out.print("Ingresa el ID del estudiante: ");
                    id = scanner.nextLine();
                    gestion.obtenerEstudiante(id);
                    break;
                case 3:
                    System.out.print("Ingresa el ID del estudiante: ");
                    id = scanner.nextLine();
                    gestion.eliminarEstudiante(id);
                    break;
                case 4:
                    gestion.listarEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

class Estudiante {
    private String id;
    private String nombre;
    private int edad;

    public Estudiante(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
    }
}

class GestionEstudiantes {
    private HashMap<String, Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(String id, String nombre, int edad) {
        Estudiante estudiante = new Estudiante(id, nombre, edad);
        estudiantes.put(id, estudiante);
        System.out.println("Estudiante agregado: " + estudiante);
    }

    // Método para obtener información de un estudiante
    public Estudiante obtenerEstudiante(String id) {
        Estudiante estudiante = estudiantes.get(id);
        if (estudiante != null) {
            System.out.println("Información del estudiante: " + estudiante);
        } else {
            System.out.println("Estudiante con ID " + id + " no encontrado.");
        }
        return estudiante;
    }

    // Método para eliminar un estudiante
    public void eliminarEstudiante(String id) {
        Estudiante estudiante = estudiantes.remove(id);
        if (estudiante != null) {
            System.out.println("Estudiante eliminado: " + estudiante);
        } else {
            System.out.println("Estudiante con ID " + id+ "no encontrado.");
        }
    }

    // Método para listar todos los estudiantes
    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (Estudiante estudiante : estudiantes.values()) {
                System.out.println(estudiante);
            }
        }
    }
}