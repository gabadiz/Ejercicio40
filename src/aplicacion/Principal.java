package aplicacion;
import java.util.*;
import dominio.*;
public class Principal{
	public static void main (String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Plazas");
		int plazas = sc.nextInt();
		System.out.println("PrecioBase");
		int precioBase = sc.nextInt();
		System.out.println(VehiculoTurismo.PrecioFinal(plazas, precioBase));
	}
}
