package dominio;


public class Comprobacion {
    public static void comprob() {
        Concesionario concesionario = new Concesionario();
        VehiculoTurismo vh1 = new VehiculoTurismo("Ford", "Focus", 10000, 5);
        VehiculoTurismo vh2 = new VehiculoTurismo("Mercedes", "Clase A", 20000, 3);
        VehiculoTurismo vh3 = new VehiculoTurismo("BMW", "Serie 1", 30000, 7);
        concesionario.annadir(vh1);
        concesionario.annadir(vh2);
        concesionario.annadir(vh3);
        concesionario.mostrar();
    }
}