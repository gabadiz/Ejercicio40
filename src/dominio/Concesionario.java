package dominio;
import java.util.*;


public class Concesionario{

	ArrayList <Vehiculo> lista  = new ArrayList<>();

	double Total;
	double precio;

	public void annadirVehiculo(Vehiculo v){
		lista.add(v);

	}
	public void calcularPrecio(){
		for (int i =0; i<lista.size();i++){
			precio = (lista.get(i).precioFinal());
			Total = precio + Total;
		}
	}

	public void mostrar(){
		for (int i=0;i<lista.size();i++){
			System.out.println(lista.get(i));

		}

		calcularPrecio();
		System.out.println("Total: "+Total);
	}

}
