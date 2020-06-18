package list_arrayList_Vectores;

import javax.swing.JOptionPane;

public class principalExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numeros = {1, 2,3};
			System.out.println(numeros[0]);
			System.out.println(numeros[1]);
			System.out.println(numeros[2]);
			System.out.println(numeros[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se produjo un error al intentar mostras los datos indexacion" );
			// nos muestras aquellas clases donde paso error
			e.printStackTrace();
		}finally {
			System.out.println("se termino de ejecutar las pruebas");
		}
	}

}
