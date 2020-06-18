package Logica.Logica02;

public class persona {
	//constante 
	private final static char SEXO_DEF = 'H';

	private String nombre = "";
	private int edad = 0;
	int DNI;
	private char sexo;
	private double peso = 0;
	private double altura = 0;
	
	public persona() {
		
	}
	public persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public persona(String nombre, int edad, char sexo,double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		
		generaDNI();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDNI() {
		return DNI;
	}
	public  char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public  int calcularIMC() {
		int obtener = (int) (peso / altura) * 2;
		if( obtener <= 19) {
			return -1;
		}else if( obtener >= 20 &&  obtener <= 25 ) {
			return 0;
		}
		return 1;
	}
	public  boolean esMayorDeEdad() {
		if(this.edad >= 18) {
			return true;
		}
		return false;
	}
	public char comprobarSexo(char sexo) {
         if(sexo != 'H' || sexo != 'M' ){
        	 sexo = SEXO_DEF;
       }
		return sexo;
	}
	@Override
	public String toString() {
		 String sexo;
	        if (this.sexo == 'H') {
	            sexo = "hombre";
	        } else {
	            sexo = "mujer";
	        }
		return "Nombre : " + nombre + " "+ "Edad : " + edad + " " + "DNI : " + DNI +  " " + "Peso : " + peso + " " + "Altura : " + altura;
	}
	public int generaDNI() {
      DNI = (int)(88888888* Math.random());	
      System.out.println(" Letra DNI correspondiente : " + obtenetLetra(DNI) + "Tu DNI es : ");
		 return DNI;
		 
	}
	public char obtenetLetra(int DNI) {
		 String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		 int calcular = DNI%23;
		 return caracteres.charAt(calcular);
	}
}
