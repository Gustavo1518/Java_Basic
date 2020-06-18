package Netflix;

public class serie extends cine implements iVisualizable{
	private int nTemporadas = 1;
	
	public serie(String titulo, char genero, String creador, double duracion, int nTemporadas) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.nTemporadas = nTemporadas;
	}
	
	public int getnTemporadas() {
		return nTemporadas;
	}
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
   
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public void info(String name) {
		// TODO Auto-generated method stub
		super.info(name);
		System.out.println("Numero de temporadas" + nTemporadas);
	}

	@Override
	public void marcarVisto() {
		setVisto(true);
		System.out.println("peliculas vista :" + getTitulo());
		System.out.println("Duracion de visto : " + getDuracion());
		
	}

	@Override
	public void esVisto() {
		// TODO Auto-generated method stub
	}

	@Override
	public void tiempovisto() {
		// TODO Auto-generated method stub
		
	}

}
