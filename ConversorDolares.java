class ConversorDolares {
    private double pesos, dolar;

    ConversorDolares() {

    }

    @Override
    public String toString() {
        return "ConversorDolares [pesos=" + pesos + ", dolar=" + dolar + "]";
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double mostrarConvercion() {

        return this.pesos / this.dolar;
    }

}