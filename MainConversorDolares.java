import java.util.Scanner;

class MainConversorDolares {

    public static void main(String[] args) {
        Scanner dollars = new Scanner(System.in);
        double pesos;

        System.out.print("INGRESE LA CANTIDAD EN PESOS QUE DESEA CONVERTIR A DOLARES: ");
        pesos = dollars.nextDouble();

        ConversorDolares convercion = new ConversorDolares();
        convercion.setPesos(pesos);
        convercion.setDolar(16.96);
        System.out.println(pesos + "  Pesos son  " + convercion.mostrarConvercion() + "  Dolares");

    }

}