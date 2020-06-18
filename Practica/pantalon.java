package Practica;

public class pantalon extends Ropa implements iDevolucion{

	public pantalon(String id, String talla, double precio, String color, String corte, String sexo) {
		super(id, talla, precio, color);
		// TODO Auto-generated constructor stub
		this.corte = corte;
		this.sexo = sexo;
	}
	private String corte;
	private String sexo;

	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public void mostrarinfo(String nombreclase) {
		// TODO Auto-generated method stub
		super.mostrarinfo(nombreclase);
		System.out.println("Corte : " + corte);
		System.out.println("Sexo :" + sexo);
	}
	@Override
	public void verificar() {
		// TODO Auto-generated method stub
		super.verificar();
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("Hacer Devolucion pantalon");
	}
}
