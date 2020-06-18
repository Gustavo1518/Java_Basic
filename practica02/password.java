package practica02;

public class password {
	private final int LEN = 8;
	private String contraseña;
	private int longitud;
	
	public password(){
		
	}
    
	public password(int longitud) {
		this.longitud = longitud;
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		contraseña = generarPassword();
	}

	public String getContraseña() {
		return contraseña;
	}
	public boolean esFuerte() {
	       int cuentanumeros=0;
	        int cuentaminusculas=0;
	        int cuentamayusculas=0;
	        //Vamos caracter a caracter y comprobamos que tipo de caracter es
	        for (int i=0;i<contraseña.length();i++){
	                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
	                    cuentaminusculas+=1;
	                }else{
	                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
	                        cuentamayusculas+=1;
	                }else{
	                    cuentanumeros+=1;
	                    }
	                }
	            }
	            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
	            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
	            return true;
	        }else{
	            return false;
	        }
	}
	public String generarPassword() {
	       String password="";
	        for (int i=0;i<longitud;i++){
	            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
	            int eleccion=((int)Math.floor(Math.random()*3+1));
	  
	            if (eleccion==1){
	                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
	                password+=minusculas;
	            }else{
	                if(eleccion==2){
	                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
	                    password+=mayusculas;
	                }else{
	                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
	                    password+=numeros;
	                }
	            }
	        }
	        return password;
	}
}
