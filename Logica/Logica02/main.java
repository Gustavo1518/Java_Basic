package Logica.Logica02;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null,"Introduce tu Nombre");
		int  edad =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        
        String texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
        
        texto = JOptionPane.showInputDialog("Introduce tu peso");
        double peso = Double.parseDouble(texto);
        
        texto = JOptionPane.showInputDialog("Introduce tu altura");
        double altura = Double.parseDouble(texto);
        
        persona Persona1 = new persona();
        persona Persona2 = new persona(nombre, edad, sexo);
        persona Persona3 = new persona(nombre, edad, sexo, peso, altura);
        
        Persona1.setNombre(nombre);
        Persona1.setEdad(edad);
        Persona1.setSexo(sexo);
        Persona1.setPeso(peso);
        Persona1.setAltura(altura);
        
        Persona2.setPeso(45);
        Persona2.setAltura(1.56);
        
       System.out.println("DATOS DE PERSONA 1");
       System.out.println(Persona1.toString());
       MuestraMensajePeso(Persona1);
       MuestraMayorDeEdad(Persona1);
       System.out.println(Persona1.generaDNI());
       System.out.println(Persona1.comprobarSexo(sexo));
       
       System.out.println("DATOS DE PERSONA 2");
       System.out.println(Persona2.toString());
       MuestraMensajePeso(Persona2);
       MuestraMayorDeEdad(Persona2);
       System.out.println(Persona2.generaDNI());
       System.out.println(Persona2.comprobarSexo(sexo));
       
       
       System.out.println("DATOS DE PERSONA 3");
       System.out.println(Persona3.toString());
       MuestraMensajePeso(Persona3);
       MuestraMayorDeEdad(Persona3);
       System.out.println(Persona3.generaDNI());
       System.out.println(Persona3.comprobarSexo(sexo));
        
	    
	}
    public static void MuestraMensajePeso(persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 1:
                System.out.println("La persona esta en su peso ideal");
                break;
            case 0:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case -1 :
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
