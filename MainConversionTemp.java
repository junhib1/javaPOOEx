import java.util.Scanner;

class MainConversionTemp {

    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        float grados;
        System.out.println("Ingrese los grados centigrados: ");
        grados = temperatura.nextFloat();

        ConversionTemp temp = new ConversionTemp();
        temp.setGrados(grados);

        System.out.println("Conversion de grados centigrados a fahrenheit");
        System.out.println(+grados + "  Grados Centigrados son  " + temp.mostrarGrados() + "  Grados Fahrenheit");
    }

}