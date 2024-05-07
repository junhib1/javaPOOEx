class AreadelTriangulo {
    private double base, altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "AreaTriangulo [base=" + base + ", altura=" + altura + "]";
    }

    public double mostrarResultado() {
        return this.base * this.altura / 2;

    }

}