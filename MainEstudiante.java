import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los datos del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int age = scanner.nextInt();
        System.out.print("Ingrese la calificación del estudiante: ");
        double score = scanner.nextDouble();

        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(name, age, score);

        // Imprimir los detalles del estudiante
        System.out.println(estudiante.toString());
    }
}