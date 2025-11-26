package exception;

public class trycatchfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    try {
		    final	int a=2;
		    int b=	a/0;
		    	//System.out.println(b);
		    	//throw new Exception();
		    }catch(Exception E) {
		    	System.out.println("It is numerical error not divisible by 0.");
		    }finally {
		    	System.out.println("finally block should executed.");
		    }
	}
     
}
