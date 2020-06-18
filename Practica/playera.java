package Practica;

public class playera extends Ropa implements iDevolucion{
    
	public playera(String id, String talla, double precio, String color, String corte) {
		super(id, talla, precio, color);
		this.corte = corte;
	}
	private String corte;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	@Override
	public void mostrarinfo(String nombreclase) {
		super.mostrarinfo(nombreclase);
		System.out.println("Corte : " + corte);
	}
	@Override
	public void verificar() {
		// TODO Auto-generated method stub
		super.verificar();
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Hacer Devolucion playera");
	}
}
