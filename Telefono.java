
public class Telefono {
	
	// Caracteristicas
    private int id;
	private String Marca;
	private int Modelo;
	private int precio;
	
	// Metodos constructor sobrecargados
	public Telefono() {
		this.id = 5;
		this.Modelo= 1000;
		this.precio = 1000;
		this.Marca = "alcatel";
	}
	
	// Metodo Constructor
	public Telefono(int id, String Marca, int Modelo, int precio) {
		this.id = id;
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.precio = precio;
	}
	
	// Metodos mostrar informacion
	public  void mostarDatos() {
		System.out.println("id :" + " " + id);
		System.out.println("Marca :" + " "+ Marca);
		System.out.println("Modelo :" + " " + Modelo);
		System.out.println("precio :" + " " + precio);
		System.out.println("Marca :" + " " + Marca);
	}
	public int verificar(int precio) {
	  this.precio = precio;
			  if(precio <= 1000) {
				  System.out.println("Telefono de gama baja");
			  }else if(precio >= 1000 && precio <= 3000){
				  System.out.println("Telefono de gama media");
			  }else if(precio > 3000) {
				  System.out.println("Telefono de gama alta");
			  }
		return precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getModelo() {
		return Modelo;
	}

	public void setModelo(int modelo) {
		Modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
