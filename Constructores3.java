class X {
	public int x;
	public X(){
		System.out.println(x);
	}
}

class Y extends X{
	public Y(){
		x=1;
		System.out.println(x);
	}
}


class Z extends Y {
	public Z(){
		x=2;
		System.out.println(x);
	}
}


public class Constructores3{
	public static void main(String[] args) {
		new Z();
	}
}
