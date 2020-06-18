package Netflix;

public class cine {
	private String titulo;
	private char genero;
	private String creador;
	private double duracion;
	private boolean visto = false;
	
	public cine(String titulo, char genero, String creador, double duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	@Override
	public String toString() {
		if(visto) {
			return "peliculas y series mas vistas son :" + titulo;
		}
		return "no hay peliculas vistas aun";
	}
	public void info(String name) {
		System.out.println(name);
		System.out.println("Titulo : " + titulo);
		System.out.println("Genero : " + genero);
		System.out.println("Creador : " + creador);
		System.out.println("Duracion : " + duracion);
	}
	 
}
