package Practica;

public class Ropa {
	// Metodo constructor 
	public Ropa(String id, String talla, double precio, String color) {
		this.id = id;
		this.talla = talla;
		this.precio = precio;
		this.color = color;
	}
	
	private String id;
	private String talla;
	private double precio;
	private String color;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void mostrarinfo(String nombreclase) {
		System.out.println(nombreclase);
		System.out.println("ID : " + id);
		System.out.println("Talla : " + talla);
		System.out.println("Precio : " + precio);
		System.out.println("Color : " + color);
	}
	public void verificar() {
		if(this.precio <= 100) {
			System.out.println("precio bajo");
		}else if(this.precio >= 100 && this.precio<= 3000) {
			System.out.println("precio mediano");
		}
	}
}
