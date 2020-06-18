package Practica;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playera Playera = new playera("56", "Mediana", 199.99, "azul", "V");
		calcetin Calcetin = new calcetin("001", "chica", 19.99, "rojo");
		pantalon Pantalon = new pantalon("001", "Grande", 999, "Azul", "liso", "Hombre");
		
		Playera.mostrarinfo("playera roja");
		Playera.verificar();
		Playera.hacerDevolucion();
		System.out.println(" ");
		Calcetin.mostrarinfo("calcetin chico");
		Calcetin.verificar();
		Calcetin.hacerDevolucion();
		System.out.println(" ");
		Pantalon.mostrarinfo("pantalon grande");
		Pantalon.verificar();
		Pantalon.hacerDevolucion();
		System.out.println("*****************************");
		Smarphone iphone = new Smarphone(10000, "x", "iphone", "Negro", "Telcel");
		iphone.hacerDevolucion();
        iphone.informacion("Smarphone");
		System.out.println("  ");
		TelefonoCasa tec = new TelefonoCasa(500, "ps", "vtech", "Negro", false);
		tec.hacerDevolucion();
		System.out.println("  ");
		TelefonoCasa nuevo = new TelefonoCasa(1000, "chino", "china", "rojo", true);
		nuevo.hacerDevolucion();
		nuevo.informacion("Telefono de casa");
	
	}

}
