package oops;


abstract class mainuser{
	abstract void call();
	
	void cut() {
		System.out.println("cut the call");
	}
}

class assistant extends mainuser{

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("attend the call.");
	}
	
	void em() {
		
	}
	
}
public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mainuser u =new assistant();
u.call();

	}

}
