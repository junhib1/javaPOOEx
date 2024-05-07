import java.util.Scanner;

class MainAreadelTriangulo {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int a;
        do {
            System.out.println("ESCOGE UNA OPCION");
            System.out.println("1: AREA DEL TRIANGULO");
            System.out.println("0: SALIR");
            a = op.nextInt();
            if (a == 1) {
                double base, altura;
                System.out.print("ingresa la base del triangulo: ");
                base = op.nextDouble();
                System.out.print("ingresa la altura del trinagulo: ");
                altura = op.nextDouble();
                AreadelTriangulo triangulo = new AreadelTriangulo();
                triangulo.setAltura(altura);
                triangulo.setBase(base);
                System.out.println("El area del triangulo es: " + triangulo.mostrarResultado());
            }
        } while (a > 0);
    }
}