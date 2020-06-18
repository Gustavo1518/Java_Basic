package Practica;

public class Telefono {
	public Telefono(double precio, String Modelo, String Marca, String Color){
      this.precio = precio;
      this.Modelo = Modelo;
      this.Marca = Marca;
      this.Color = Color;
	}
	private double precio;
	private String  Modelo;
	private String Marca;
	private String Color;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public void informacion(String tipotelefono) {
		System.out.println(tipotelefono);
		System.out.println("Precio : " + precio);
		System.out.println("Modelo : " + Modelo);
		System.out.println("Marca : " + Marca);
		System.out.println("Color : " + Color);
	}

}
