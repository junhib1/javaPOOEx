public class MainGasolinera {
    public static void main(String[] args) {
        Gasolinera gasolinera = new Gasolinera();
        gasolinera.setGalones(10); // 10 galones surtidos
        gasolinera.setPrecioPorLitro(1.5); // $1.5 por litro

        System.out.println(gasolinera.toString());
    }
}