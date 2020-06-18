package Netflix;

public class pelicula extends cine implements iVisualizable{
	private int año;
	
	public pelicula(String titulo, char genero, String creador, double duracion, int año) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.año = año;
	}
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
  @Override
public  String toString() {  
	  return super.toString();
}
  @Override
public void info(String name) {
	// TODO Auto-generated method stub
	super.info(name);
	System.out.println("Año : " + año);
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
