class Inicializacion{
	byte b; short s; int i; long l;//los integrales se inicializan por defecto a 0
	float f; double d; // Los puntos flotantes se inicializan por defecto a 0.0
	boolean bl;//los booleanos se inicializan por defecto a false
	char c; //los caracteres se inicializan por defecto a espacio vacio
	//todos incluyendo a String se inicializan a null
	String str;Object obj;

}
public class InicializacionPorDefecto
{
	public static void main (String[] args)
	{
		Inicializacion ini = new Inicializacion();
		System.out.println("Inicializacion por defecto de los 8 tipos de datos ´primitivos");
		System.out.println("Los integrales son: "+ini.b+" "+ini.s+" "+ini.i+" "+ini.l);
		System.out.println("Los flotantes son: "+ini.f+" "+ini.d+" ");
		System.out.println("Los Logicos son: "+ini.bl);
		System.out.println("Los caracter son: "+ini.c);
		System.out.println("Los objetos son: "+ini.obj +" los string son: "+ini.str);
	}
}