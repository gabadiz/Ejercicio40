package dominio;

public class VehiculoTurismo extends Vehiculo{

int plazas;

	public VehiculoTurismo( String marca, String modelo, double precioBase, int plazas){
		super(marca,modelo,precioBase);
		this.plazas = plazas;
	}

	public  double PrecioFinal(int plazas){
	double precio;
	int i=0;
	double porcentaje = 0;
		if (plazas > 5){
			for (i=plazas;i>5;i--){
				porcentaje = porcentaje + 0.1;						
			}
		
		}
		precio = PrecioBase()*porcentaje+PrecioBase();
		return precio;
	}
	public String toString(){
		return super.toString()+" Plazas: "+plazas+" Precio Final: "+PrecioFinal(plazas);
	}

}
