package javaPOOEx;
import java.util.Scanner;

class MainAreadelCirculo {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a;
        do {
            System.out.println("ESCOGE UNA OPCION");
            System.out.println("1: AREA DEL CIRCULO");
            System.out.println("0: SALIR");
            a = op.nextInt();
            if (a == 1) {
                double area;
                System.out.println("ingresa el radio del circulo: ");
                area = op.nextDouble();
                AreadelCirculo circulo = new AreadelCirculo();
                circulo.setArea(area);
                circulo.setPi(3.1416);
                System.out.println("El area del circulo es: " + circulo.mostrarResultado());
            }
        } while (a > 0);
    }
}