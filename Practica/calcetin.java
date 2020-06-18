package Practica;

public class calcetin extends Ropa implements iDevolucion {

	public calcetin(String id, String talla, double precio, String color) {
		super(id, talla, precio, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mostrarinfo(String nombreclase) {
		// TODO Auto-generated method stub
		super.mostrarinfo(nombreclase);
	}
	@Override
	public void verificar() {
		// TODO Auto-generated method stub
		super.verificar();
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Hacer Devolucion Calcetin");
	}
}
