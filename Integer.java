package Number;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Integer {

	
	static int reverseNumber(int nums) {
		int reverse=0; int rem;
		
		while(nums!=0){
			rem=nums%10;
			reverse=(reverse*10)+rem;
			nums=nums/10;
		}
		return reverse;
	}
	
	 void countDuplicatesInArray(int nums) {
		 int[] array = new int[nums]; // Allocate space for 10 inputs
		 int[] count = new int[nums]; // Assuming numbers are between 0 and 9

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 10 numbers between 0 and 9:");

		 // Read input into array
		 for (int i = 0; i < array.length; i++) {
		     array[i] = sc.nextInt();
		 }

		 // Count each number
		 for (int i = 0; i < array.length; i++) {
		     count[array[i]]++;
		 }

		 // Print the count
		 for (int i = 0; i < count.length; i++) {
		     if (count[i] > 0) {
		         System.out.println("Number " + i + " occurs " + count[i] + " times.");
		     }
		 }
	 }
		 void countDuplicatesArray() {
			 int[] numbers = {1, 2, 3, 2, 4, 5, 1, 2, 3};

		        // Create an array to store counts (assuming numbers are between 0 and 100)
		        int[] count = new int[100];

		        // Count each number
		        for (int num : numbers) {
		            count[num]++;
		        }

		        // Print duplicates
		        System.out.println("Duplicate numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            if (count[i] > 1) {
		                System.out.println(i + " appears " + count[i] + " times");
		            }
		        }
	}
		 
		 //prime number
		static void checkPrimeNumber() {
			 int i=2;
			 if(i%2==0) {
				 System.out.println(i+"is not a prime number");
			 }
			 else {
				 System.out.println(i+"is a prime number.");
			 }
		 }
		 
		//fibonacci series
		static void fibonacciSeries() {
			
			int first=0,second=1,n=10,add;
			for(int i=0;i<=n;i++) {
				System.out.print(+first+" ");
			add=first+second;
			first=second;
			second=add;
			
			}
		}
		
		//palindrome
		static void reverseNumber1() {
			int num=1234,reverse=0,rem;
			if(num>1) {
				
				rem=num%10;
				reverse=(reverse*10)+rem;
				num=num/10;
			}
			System.out.println(reverse);
		}
		
		static void concatTwoArrays() {
			int[] a= {1,2};
			int []b= {3,4};
			int c[]= new int[a.length+b.length];
			
//			System.arraycopy(a, 0, c, 0, a.length);
//			System.arraycopy(b, 0, c, a.length, b.length);
//			System.out.println(Arrays.toString(c));
			c[0]=a[0]; c[1]=a[1]; c[2]=b[0]; c[3]=b[1]; 
			
			for(int print:c) {
				System.out.println(print);
			}
		}
		
		static void afreen() {
			int a=10;
			System.out.println(++a);// pre increment
			System.out.println(a++);// post increment
			System.out.println(a++);// post increment
		}
	
		//Java Program to Calculate Average Using Arrays
		static void calculateAverage() {
			int[]mark= {100,95,88,76,55};
			float calc=0;
			for(int i=0;i<=mark.length-1;i++) {
				calc=calc+mark[i];
			}
			System.out.println(calc/mark.length);
		}
		
		//Largest number in an array
		static void largestNumberOfArray() {
			int [] numbers={95,88,76,55,99};
			int largest=numbers[0];
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]>largest) {
					largest=numbers[i];
				}
			}
			System.out.println("The largest number in an array is :"+largest);
		}
		
		//array contains given value
		static void arrayContainsValue() {
			int [] array={100,95,88,76,55};
			for(int arr:array) {
				if(arr==30) {
					System.out.println("present");
					break;
				}
				else {
					System.out.println("not present");
				}
			}
		}
		
		//descending order
		static void descending() {
			int []nums= {87,98,65,100,150};
			int temp;
			Map<String, Integer>map=new HashMap<>();
			for(int i=0;i<nums.length;i++) {
				for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
				}
			}
			System.out.println(Arrays.toString(nums));
		}
		
		static void factorial() {
			int nums =7,fact = 1;
			for(int i =1;i<=nums;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseNumber(1234));
Integer i= new Integer();
//i.countDuplicatesInArray(12);
i.countDuplicatesArray();
checkPrimeNumber();
fibonacciSeries();
concatTwoArrays();
afreen();
calculateAverage();
largestNumberOfArray();
descending();
factorial();
int count=0;
for(int j=0;j<5;j++) {
	count++;
}
System.out.println("total :"+count);
	}
}
