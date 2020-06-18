package Logica;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // objetos
		cuenta Cuenta1 = new cuenta("Gustavo meneses sierra");
		cuenta Cuenta2 = new cuenta("Gustavo ms", 3000);
		
		Cuenta1.informacion();
		Cuenta2.informacion();
		
		Cuenta1.ingresar(3000);
		
		
		Cuenta2.retirar(200);
		Cuenta2.ingresar(36.50);
		
		Cuenta1.informacion();
		Cuenta2.informacion();
		
		Cuenta2.retirar(1000);
		Cuenta2.informacion();
	}

}
