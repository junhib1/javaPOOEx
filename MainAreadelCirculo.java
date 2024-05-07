package javaPOOEx;
class AreadelCirculo {
    private double area, pi;

    public AreadelCirculo() {

    }

    @Override
    public String toString() {
        return "AreadelCirculo [area=" + area + ", pi=" + pi + "]";
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double mostrarResultado() {
        return this.pi * this.area * this.area;

    }

}