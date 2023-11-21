package dominio;
import java.util.*;
public class VehiculoTurismo{
String marca;
String modelo;
double precioBase;
int plazas;

	public VehiculoTurismo( String marca, String modelo, double precioBase, int plazas){
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.plazas = plazas;
	}



	public static double PrecioFinal(int plazas, double precioBase){
	double precio;
	int i=0;
	double porcentaje = 0;
		if (plazas > 5){
			for (i=plazas;i>5;i--){
				porcentaje = porcentaje + 0.1;						
			}
		
		}
		precio = precioBase*porcentaje+precioBase;
		return precio;
	}
	public String toString(){
		return "Marca: "+marca+" Modelo: "+modelo+" Precio Base: "+precioBase+" Plazas: "+plazas+" Precio Final: "+PrecioFinal(plazas,precioBase);
	}

}
