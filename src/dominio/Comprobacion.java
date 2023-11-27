package dominio;


public class Comprobacion {
    public static void comprob() {
        Concesionario concesionario = new Concesionario();

        concesionario.annadirVehiculo(new VehiculoTurismo ("Ford", "Mustang",10000, 7));
        concesionario.annadirVehiculo(new VehiculoTurismo("BMW","A3",20000,4));
        concesionario.annadirVehiculo(new Furgoneta("Fiat", "Fiorno", 5000, 30));
        concesionario.annadirVehiculo(new Furgoneta("Mercedes","Sprinter", 40000,40));
        concesionario.mostrar();
    }
}