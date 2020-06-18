package Practica;

public class Smarphone extends Telefono implements iDevolucion {
    private String compania;
	public Smarphone(double precio, String Modelo, String Marca, String Color, String compania) {
		super(precio, Modelo, Marca, Color);
		// TODO Auto-generated constructor stub
		this.compania = compania;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void informacion(String tipotelefono) {
		// TODO Auto-generated method stub
		super.informacion(tipotelefono);
		System.out.println("Compañia : " +compania);
	}
}
