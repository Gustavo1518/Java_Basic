public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creacion del objeto Telefono
        Telefono alcatel = new Telefono();
        alcatel.mostarDatos();
        alcatel.verificar(1000);
        System.out.println("");
        
        Telefono iphone = new Telefono(5, "iphone", 20, 1000);
        iphone.mostarDatos();
        iphone.verificar(1000);
        System.out.println("");
        
        Telefono huawei = new Telefono(1, "huawei", 10, 10000);
        huawei.mostarDatos();
        huawei.verificar(10000);
        System.out.println("");
        
        Telefono Motorola = new Telefono(01, "Motorola E", 002, 3001);
        Motorola.mostarDatos();
        Motorola.verificar(3001);
        System.out.println( Motorola.getPrecio());
        Motorola.setPrecio(1000);
        Motorola.mostarDatos();
        Motorola.verificar(1000);
       
	}     
}
