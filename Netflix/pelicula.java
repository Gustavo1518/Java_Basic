package Netflix;

public class pelicula extends cine implements iVisualizable{
	private int a�o;
	
	public pelicula(String titulo, char genero, String creador, double duracion, int a�o) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.a�o = a�o;
	}
	
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
  @Override
public  String toString() {  
	  return super.toString();
}
  @Override
public void info(String name) {
	// TODO Auto-generated method stub
	super.info(name);
	System.out.println("A�o : " + a�o);
}

@Override
public void marcarVisto() {
	setVisto(true);
	System.out.println("pelicula vista : " + getTitulo());	
}

@Override
public void esVisto() {
	// TODO Auto-generated method stub
}

@Override
public void tiempovisto() {
	// TODO Auto-generated method stub
	System.out.println("Tiempo visto : " + getDuracion());
}
	}
