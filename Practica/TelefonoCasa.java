package Practica;

public class TelefonoCasa extends Telefono implements iDevolucion{
    private  boolean inalambrico;
	public TelefonoCasa(double precio, String Modelo, String Marca, String Color, boolean inalambrico) {
		super(precio, Modelo, Marca, Color);
		// TODO Auto-generated constructor stub
		this.inalambrico = inalambrico;
	}
	public boolean isInalambrico() {
		return inalambrico;
	}
	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}
	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void informacion(String tipotelefono) {
		// TODO Auto-generated method stub
		super.informacion(tipotelefono);
		System.out.println("Inalambrico : " + inalambrico);
	}
}
