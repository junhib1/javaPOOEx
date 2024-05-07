public class SecondsByDay {
    private int dias;

    // Constructor
    public SecondsByDay(int dias) {
        this.dias = dias;
    }

    // Getter
    public int getDias() {
        return dias;
    }

    // Setter
    public void setDias(int dias) {
        this.dias = dias;
    }

    // Calcula la cantidad de segundos en un día
    private int segundosPorDia() {
        return 24 * 60 * 60; // 24 horas * 60 minutos * 60 segundos
    }

    // Calcula la cantidad de segundos en un número determinado de días
    public int calcularSegundos() {
        return dias * segundosPorDia();
    }

    // toString metodo
    @Override
    public String toString() {
        return "La cantidad de segundos en " + dias + " días es: " + calcularSegundos();
    }
}