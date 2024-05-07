class ConversionTemp {

    private float grados;

    ConversionTemp() {

    }

    public float getGrados() {
        return grados;
    }

    public void setGrados(float grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "ConversionTemp [grados=" + grados + "]";
    }

    public float mostrarGrados() {
        return this.grados * 9 / 5 + 32;
    }

}
