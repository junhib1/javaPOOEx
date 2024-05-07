public class MainCostoAuto {
    public static void main(String[] args) {
        // Leer el costo del automóvil
        System.out.print("Ingrese el costo del automóvil: ");
        double costoVehiculo = Double.parseDouble(System.console().readLine());

        // Crear objeto CostoAuto
        CostoAuto costoAuto = new CostoAuto(costoVehiculo);

        // Imprimir el costo final para el consumidor
        System.out.println(costoAuto.toString());
    }
}