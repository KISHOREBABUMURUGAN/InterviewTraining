package Number;

import java.util.Scanner;

//array of objects // constructor
public class occurnecyString {
	int rollno;
	String name;
	public occurnecyString(int r,String n) {
		
		this.rollno=r;
		this.name=n;
	}
	
	void print() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println("***********:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurnecyString [] o=new occurnecyString[5];
		o[0]=new occurnecyString(1,"kishore");
		o[1]=new occurnecyString(2,"babu");
		o[2]=new occurnecyString(3,"Murugan");
		
		for(int i=0;i<o.length;i++) {
			o[i].print();
		}
	}

}
