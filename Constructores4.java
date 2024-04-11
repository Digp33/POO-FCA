class Gama extends Sigma{
	Gama(){
		new Sigma();
	}
}

class Zetta extends Gama{
	Zetta(){
		new Zetta();
	}
}


class Sigma extends Zetta{
	Sigma(){
		new Zetta();
	}
}
public class Constructores4{
	public static void main(String[] args) {
		new Sigma();
		//herencia circular.
	}
}