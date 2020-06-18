package Practica;

public class Playerapersonalizada extends Ropa{
    private String cuenta;
	public Playerapersonalizada(String id, String talla, double precio, String color, String cuenta) {
		super(id, talla, precio, color);
		// TODO Auto-generated constructor stub
		this.cuenta = cuenta;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
}
