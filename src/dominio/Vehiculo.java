package dominio;

public abstract class Vehiculo {
    String marca;
    String modelo;
    double precioBase;

    double variable;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public double getprecioBase(){
        return precioBase;
    }

    abstract double precioFinal();

    public String toString(){
        return "Marca: "+marca+" Modelo: "+modelo+" Precio Base: "+precioBase;
    }

}
