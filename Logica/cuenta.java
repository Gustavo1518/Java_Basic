package Logica;

public class cuenta {
	private String titular;
	private double cantidad;
	
	public cuenta(String titular) {
		this.titular = titular;
	}
	public cuenta(String titular, double cantidad) {
		this.titular = titular;
		  if (cantidad < 0) {
	            this.cantidad = 0;
	        } else {
	            this.cantidad = cantidad;
	        }
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public double ingresar(double cantidad) {
		if(cantidad > 0){
			return this.cantidad += cantidad;
		}
		return cantidad;
	}
	public void retirar(double cantidad) {
	       if (this.cantidad - cantidad < 0) {
	            this.cantidad = 0;
	        } else {
	            this.cantidad -= cantidad;
	        }
	}
 public void informacion() {
	 System.out.println("Titular : " + titular + "Saldo actual : " + cantidad);
 }

}
