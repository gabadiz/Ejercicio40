package dominio;

public class Furgoneta extends Vehiculo{
    double m3;
    public Furgoneta(String marca, String modelo, double precioBase, double m3) {
        super(marca, modelo, precioBase);
        this.m3 = m3;
    }
    double precio=0;
    public double precioFinal(){
        double raiz= Math.cbrt(m3);
        precio = getprecioBase() * raiz/2;
        return precio;
    }
    public String toString(){
        return super.toString()+" M3: "+m3+" Precio Final: "+precioFinal();
    }

}
