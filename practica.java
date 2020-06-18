
public class practica {

	public static void main(String[] args) {
		int [][] miArreglo = new int [5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				miArreglo[i][j] = i*2;
				System.out.println(miArreglo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("fin del programa");
	}

}
