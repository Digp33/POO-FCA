public class TiposdeDatos{
	public static void main(String[] args){
		byte a= -128; //2^7
		byte b= 127;
		System.out.println("El byte va desde "+a+" hasta "+b);
		byte $a=(byte)-129; //2^7
		byte _b= (byte)128;
		System.out.println("El byte va desde "+$a+" hasta "+_b);
		short c=-32768;
		short d=32767;//2^15
		System.out.println("El short va desde "+c+" hasta "+d);
		int e,f;//2^31
		e = -2147483648;
		f = 2147483647;
		System.out.println("El int va desde "+e+" hasta "+f);
		long g,h;//2^63
		g = -9223372036854775808l;//Termina en l minúscula
		h = 9223372036854775807L;//Termina en L mayuscula
		System.out.println("El long va desde "+g+" hasta "+h);
		//para el flotante se agrega una f o F al final 
		float i = 3.141569f;
		System.out.println("El float es "+i);
		//para el double no es necesario poner la d, es double por defecto
		double j = 3.141569e-2;
		System.out.println("El double es "+j);
		//El lógico o boolean
		boolean k = true;
		boolean l = (5>7);//se puede asignar a partir de la evaluacion de una asegnacion
		System.out.println("El logico verdadero es "+k+" o "+l);
		//los char o caracteres can del 0 al 65,535 que representa alguna letra
		char m = 'a';
		char n = '\u0000';//representa valor vacio
		char o = '\u003D';//Representa el signo igual
		System.out.println("Algunos caracteres son "+m+" o "+n+" o "+o);
		//El string o cadena en java es un tipo de objeto
		String cadena = "ABCDEFG";
		for(int x = 0; x< cadena.length();x++){
		System.out.println(cadena.charAt(x));	
		}
		
	}	

}


