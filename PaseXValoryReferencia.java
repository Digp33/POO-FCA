class Mifecha{
	private int dia = 2;
	private int mes = 2;
	private int anio = 2024;

	public Mifecha(int dia, int mes, int anio){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	public void setDia(int dia){
	this.dia=dia;
	}
	public void setMes(int mes){
	this.mes=mes;
	}
	public void setAnio(int anio){
	this.anio=anio;
	}
	public String toString(){
	return dia+"/"+mes+"/"+anio;
	}
}

public class PaseXValoryReferencia{
	public static void main (String[] args){
	int unDia=26;
	unDia=cambiaDia(unDia);//pase por valor
	System.out.println(unDia);

	Mifecha fecha = new Mifecha(26,2,2024);
	System.out.println(fecha);
	cambiaFecha(fecha,29,9,1459);//pase por referencia
	System.out.println(fecha);
	}
	public static int cambiaDia (int nuevoDia){
	nuevoDia=14;
	return nuevoDia;
	}
	public static void cambiaFecha (Mifecha fecha,int dia, int mes, int anio){
	fecha.setDia(dia);
	fecha.setMes(mes);
	fecha.setAnio(anio);
	}
}

