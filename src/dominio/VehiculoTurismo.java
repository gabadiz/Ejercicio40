package dominio;
import java.util.*;
public class VehiculoTurismo{
String marca;
String modelo;
double precioBase;
int plazas;

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

}
