package Netflix;

import java.io.ObjectInputStream.GetField;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj
		pelicula titanic = new pelicula("titanic", 'A', "Desconocido", 15.02, 1999);
		titanic.info("CATEGORIA PELICULAS");
		titanic.marcarVisto();
		titanic.tiempovisto();
		System.out.println("****************************");
		pelicula amor = new pelicula("amor io", 'C', "yo", 1.35, 2008);
		amor.info("CATEGORIA PELICULAS");
		System.out.println("****************************");
		pelicula sexo = new pelicula("sex", 'x', "desconocido", 30.00, 2020);
		sexo.info("CATEGORIA PELICULAS");
		System.out.println("****************************");
		serie smallville = new serie("smallville", 'A', "desconocido", 45.00, 11);
		smallville.info("CATEGORIA SERIES");
		System.out.println("****************************");
		serie hola = new serie("serie2", 'h', "Desconocido", 45.00, 3);
		hola.info("CATEGORIAS SERIE");
		hola.marcarVisto();
	    System.out.println("****************************");
	    serie dos = new serie("dos", 'x', "netflix", 15.00, 8);
	    dos.info("CATEGORIA SERIES");
	    dos.marcarVisto();
	    dos.esVisto();
	    System.out.println("****************************");
		String[] peliculas = new String[5];
		peliculas[0] = "titanic";
		peliculas[1] = "hola ";
		peliculas[2] = "mm";
		peliculas[3] = "usted no sabne";
		peliculas[4] = "tengo1";
		System.out.println(peliculas[0]);
		String[] series = new String[5];
		series[0] = "*";
		series[1] = "**";
		series[2] = "***";
		series[3] = "****";
		series[4] = "*****";
		System.out.println(series[4]);
	}	
}
