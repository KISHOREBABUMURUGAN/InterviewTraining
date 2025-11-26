package oops;

interface programmer{
	void user1();
}

class mainprogrammers implements programmer{

	@Override
	public void user1() {
		System.out.println("Give access;");
		
	}
	
}
public class interfaceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer u =new  mainprogrammers();
u.user1();
	}

}
