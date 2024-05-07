public class Gasolinera {
    private double galones;
    private double precioPorLitro;
    private final double CONVERSION_FACTOR = 3.78541; // 1 galón = 3.78541 litros

    // Constructor default
    public Gasolinera() {
        this.galones = 0;
        this.precioPorLitro = 0;
    }

    // Getters and Setters
    public double getGalones() {
        return galones;
    }

    public void setGalones(double galones) {
        this.galones = galones;
    }

    public double getPrecioPorLitro() {
        return precioPorLitro;
    }

    public void setPrecioPorLitro(double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    // Calcular el costo en litros.
    public double calcularCosto() {
        double litros = this.galones * CONVERSION_FACTOR;
        return litros * this.precioPorLitro;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Gasolinera{" +
                "galones=" + galones +
                ", precioPorLitro=" + precioPorLitro +
                ", costo=" + calcularCosto() +
                '}';
    }
}