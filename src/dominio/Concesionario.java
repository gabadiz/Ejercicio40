package dominio;
import java.util.*;


public class Concesionario{
	ArrayList <Vehiculo> lista  = new ArrayList<>();

	double Total = 0;
	public void annadir(VehiculoTurismo vehiculo){
		lista.add(vehiculo);

		Total = Total + vehiculo.PrecioFinal(vehiculo.plazas);
	}
	public void annadirFurgoneta(Furgoneta vehiculo){
		lista.add(vehiculo);

		Total = Total + vehiculo.PrecioFinal(vehiculo.m3);
	}

	public void mostrar(){
		for (int i=0;i<lista.size();i++){
			System.out.println(lista.get(i));

		}
		System.out.println("Total: "+Total);
	}

}
