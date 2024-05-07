public class CostoAuto {
    private double costoVehiculo;
    private double porcentajeGananciaVendedor;
    private double impuestoLocal;

    // Constructor
    public CostoAuto(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
        this.porcentajeGananciaVendedor = 0.12; // 12% ganancia del vendedor
        this.impuestoLocal = 0.06; // 6% impuesto local
    }

    // Getters
    public double getCostoVehiculo() {
        return costoVehiculo;
    }

    public double getPorcentajeGananciaVendedor() {
        return porcentajeGananciaVendedor;
    }

    public double getImpuestoLocal() {
        return impuestoLocal;
    }

    // Calcula el costo final para el consumidor
    public double calcularCostoFinal() {
        return costoVehiculo + (costoVehiculo * porcentajeGananciaVendedor) + (costoVehiculo * impuestoLocal);
    }

    // toString metodo
    @Override
    public String toString() {
        return "Costo final para el consumidor: $" + String.format("%.2f", calcularCostoFinal());
    }
}