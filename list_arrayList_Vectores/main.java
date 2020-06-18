package list_arrayList_Vectores;

import java.util.*;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ejemploArray();
        ejemploVector();
	}
	public static void ejemploArray() {
		Scanner eliminar = new Scanner(System.in);	
		Scanner entrada = new Scanner(System.in);	
		int numero;
		String agregar;
		// Declaracion de un ArrayList
		
        ArrayList<String> androids = new ArrayList<String>();
        // Metodo para agregar objetos
        androids.add("Version 1");
        androids.add("Version 2");
        androids.add("Version 3");
        androids.add("Version 4");
        androids.add("Version 5");
        androids.add("Version 6");
        androids.add("Version 7");
        androids.add("Version 8");
        androids.add("Version 9");
        androids.add("Version 10 Full");
        // Nos devuelve la cantidad de objetos en nuestro ArrayList
        System.out.println("Numero de objetos almacenados : " + androids.size());
        // imprimimos nuestro ArrayList
        System.out.println(androids);
        JOptionPane.showMessageDialog(null, "SE MOSTRO LOS DATOS");
        
       System.out.println("Ingrese el index a eliminar");
       numero = eliminar.nextInt();
        androids.remove(numero);
        JOptionPane.showMessageDialog(null, "SE ELIMINO CORRECTAMENTE");
        System.out.println("Agrega un nuevo objeto");
        agregar = entrada.nextLine();
        androids.add(agregar);
        JOptionPane.showMessageDialog(null, "SE AGREGO CORRECTAMENTE");
        
        System.out.println("Numero de objetos almacenados : " + androids.size());
        System.out.println(androids);
		
	}
	public static void ejemploVector() {
		Scanner eliminar = new Scanner(System.in);	
		Scanner guardar = new Scanner(System.in);	
		int indexeliminar;
		String texagregar;
		Vector<String> androidsV2 = new Vector<String>();
		androidsV2.addElement("Tengo todo escepto ati");
		androidsV2.addElement("o tu  ninguna");
		androidsV2.addElement("cuando calienta el sol");
		System.out.println("tamaño del vector : " + androidsV2.size());
		JOptionPane.showMessageDialog(null, "SE MOSTRO LOS DATOS");
	    System.out.println("ingrese el index a eliminar ");
	    indexeliminar = eliminar.nextInt();
	    androidsV2.remove(indexeliminar);
	    JOptionPane.showMessageDialog(null, "SE eliminaron datos correctamente");
	    
	    System.out.println("ingrese tecto para agregar ");
	    texagregar = guardar.nextLine();
	    androidsV2.addElement(texagregar);
	    JOptionPane.showMessageDialog(null, "se guardo correctamente");
	    
	    JOptionPane.showMessageDialog(null, "se actualixo informacion aceptar para mostrar");
	    System.out.println("tamaño del vector : " + androidsV2.size());
	    System.out.println("informacion actual : " + androidsV2);
	    
	    
	}
}
