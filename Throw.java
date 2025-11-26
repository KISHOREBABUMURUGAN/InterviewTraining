package exception;

public class Throw {
 static void check(int a) {
	  if(a<18) {
		  throw new ArithmeticException("Age Invalid");
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  check(21);
  }catch(ArithmeticException E) {
	  System.out.println(E.getMessage());
  }
  finally {
	  System.out.println("Hellow Java||");
  }
	}

}
