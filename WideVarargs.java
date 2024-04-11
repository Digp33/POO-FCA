class Amplitud{
	public String dos(int x, int y){
	return"int, int";
	}
	public String dos(long x, long y){
	return"int, int";
	}
	public String dos(short x, short y){
	return"Short Short";
	}
	public String dos(byte x, byte y){
	return"byte, byte";
	}
	public String dos(int...vals){
		return"int...";
	}
	public String dos(long...vals){
		return"long...";
	}
	public String dos(short...vals){
		return"short...";
	}
	public String dos(byte...vals){
		return"byte...";
	}//firma,objetos, varargs
	public String dos(Byte... vals){
		return "Byte...";
	}
}


public class WideVarargs{
	public static void main(String[] args){
		Amplitud amp= new Amplitud();
		byte x =1;
		byte y =2;
		System.out.println(amp.dos(x,y));
	}
}