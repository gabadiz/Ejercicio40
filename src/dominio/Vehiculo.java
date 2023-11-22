package dominio;

public class Vehiculo {
    String marca;
    String modelo;
    double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public double PrecioBase(){
        return precioBase;
    }


    public String toString(){
        return "Marca: "+marca+" Modelo: "+modelo+" Precio Base: "+precioBase;
    }

}
