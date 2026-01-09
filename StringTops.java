package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringTops {


	// Method to reverse a string
	    static String Reverse(String str) {
	        String reverse = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse = reverse + str.charAt(i);
	        }
	        return reverse;
	    }
	    
	    static String removeVowels(String name) {
	   	 String regex="[aeiouAEIOU]";
	   	String replaceName= name.replaceAll(regex, "");
	   	
	   	return replaceName;
	   	 
	    }
	    
	    static void removeSpecialCharacters(String email) {
	   	 String regex="[^a-zA-Z0-9\\s]";
	   	 String replace=email.replaceAll(regex, "");
	   	 System.out.println(replace);
	    }

	    // Method to count vowels in a string
	    static void countVowels(String input) {
	        input = input.toLowerCase();
	        int count = 0;

	        for (int i = 0; i <= input.length() - 1; i++) {
	            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
	                input.charAt(i) == 'i' || input.charAt(i) == 'o' ||
	                input.charAt(i) == 'u') {
	                count++;
	            }
	        }

	        System.out.println("Vowels count: " + count);
	    }

	    // Method to count occurrences of "bb" in a string
	    static int countSubStringCount(String s1) {
	        int count = 0;
	        for (int i = 0; i < s1.length() - 1; i++) {
	            if (s1.charAt(i) == 'b' && s1.charAt(i + 1) == 'b') {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	 // Method to count duplicate characters in a string
	    static void countDuplicateCharacter(String s1) {
            int count = 0;

            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        count++; 
                        System.out.println("Dup charachters : "+s1.charAt(i));
                        break;// Avoid counting the same character multiple times
                    }
                }
            }

            System.out.println("Duplicate character count: " + count);
	    }
	    
	    //add 2 list of string
	    static void twoListOfString() {
	    	List<String>l1 =new ArrayList<>();
	    	l1.add("kishore");
	    	
	    	List<String>l2 =new ArrayList<>();
	    	l2.add("babu");
	    	
	    	l1.addAll(l2);
	    	
	    	System.out.println(l1);
	    }
	    
	    //Method to coundt duplicate string\
	    
	    static void duplicateStringCountswithIters() {
	    	String iter="kishorebabukishore";
	    	
	    	char[] chararray=iter.toCharArray();
	    	Map<Character, Integer> hashmap=new HashMap<>();
	    	for(char ch:chararray ) {
	    		if(hashmap.containsKey(ch)) {
	    			hashmap.put(ch, hashmap.get(ch) +1);
	    		}
	    		else {
	    			hashmap.put(ch, 1);
	    		}
	    	}
	    	for(Map.Entry<Character, Integer> entry:hashmap.entrySet()) {
	    		if(entry.getValue()>1) {
	    			System.out.println(entry.getKey()+ " "+entry.getValue());
	    		}
	    	}
	    	
	    	
	    }
	    
	    
	  static  void reverseSentence() {
	    	String name= "Kishore babu java!";
	    	String[] s=name.split(" ");
	    	String reverse="";
	    	for(String ss:s) {
	    	for(int i=ss.length()-1;i>=0;i--) {
	    		reverse=reverse+ss.charAt(i);
	    	}
	    	}
	    	System.out.println(reverse);
	    }
	  
	  static  void reverseparticularSentence() {
	    	String name= "Kishore babu java!";
	    	String[] s=name.split(" ");
	    	String reverse="";
	    	for(String ss:s) {
	    		if(ss.contains("babu")) {
	    	for(int i=ss.length()-1;i>=0;i--) {
	    		reverse=reverse+ss.charAt(i);
	    	}
	    	}
	    		else {
	    			reverse=reverse+ss;
	    		}
	    	}
	    	System.out.println(reverse);
	    }
	  
	  static void concat() {
		  String topic="Java Program";
		  String third="";
		  String[] split=topic.split(" ");
		  for(int i=0;i<split[0].length()-1;i++) {
			  third=third+split[0].charAt(i)+split[1].charAt(i);
		  }
		  System.out.println(third);
	  }
	  
	  static void removeIntergers() {
		  String str ="Sindhu2025";
		  int nums=0;
		char[] ch =str.toCharArray();
		for(char c:ch) {
			if(Character.isDigit(c)) {
				nums=nums+Character.getNumericValue(c);
			}
		}
		  System.out.println(nums);
	  }
	  
	 static void occur() {
		 String sind="capgeminicapgem";
		 char[]ch=sind.toCharArray();
		 Map<Character,Integer> occ=new HashMap<>();
		 for(char c:ch) {
			 if(occ.containsKey(c)) {
				 occ.put(c, occ.get(c)+1);
			 }
			 else {
				 occ.put(c, 1);
			 }
		 }
		 for(Map.Entry<Character, Integer> entry:occ.entrySet()) {
			 if(entry.getValue()>1) {
				 System.out.println(entry.getKey()+""+entry.getValue());
			 }
		 }
	 }
	  
	  static void concat1() {
		    String topic = "Java Program";
		    String[] split = topic.split(" ");

		    // loop only for first 2 characters
		    for (int i = 0; i < split[0].length() ; i++) {
		        String pair = "" + split[0].charAt(i) + split[1].charAt(i);
		        System.out.println(pair);  // print each pair separately
		    }
		}
	  
	  static void actoins() {
		  
	  }
	  
	  static void vowelsConsonants() {
		  String s="adf1242nesdn32 @$%^&*sdbfsn123";
		  String vowels="" ,conso="",special="",digits="";
		  for(int i=0;i<=s.length()-1;i++) {
			  if(Character.isLetter(s.charAt(i))) {
				  if("AEIOUaeiou".indexOf(s.charAt(i))!=-1) {
					  vowels=vowels+s.charAt(i);
				  }
				  else {
					  conso=conso+s.charAt(i);
				  }
			  }
			  else if(Character.isDigit(s.charAt(i))){
				  digits=digits+s.charAt(i);
			  }
			  else {
				  special=special+s.charAt(i);
			  }
		  }
		  System.out.println(vowels);
		  System.out.println(vowels.length());
		  System.out.println(conso);
		  System.out.println(special);
		  System.out.println(digits);
	  }
	  
	  static void vowelsAndItsValue() {
		  String name="Kishore";
		  String vowels="aeiou";
		  char[] ch=vowels.toCharArray();
		  Map<Character,Integer> vowelsCount= new HashMap<>();
		  for(char c:ch) {
			  vowelsCount.put(c, 0);
		  }
		  
		  char[] vh=name.toCharArray();
		  for(char c:vh) {
			  if(vowelsCount.containsKey(c)) {
				  vowelsCount.put(c, vowelsCount.get(c)+1);
			  }
		  }
		  
		  for(Map.Entry<Character, Integer> chh:vowelsCount.entrySet()) {
			  if(chh.getValue()>=1)
			  System.out.println(chh.getKey()+""+chh.getValue());
		  }
	  }

	  
	 static void sindhu() {
		  String s = "Hello World";
	        String[] s1 = s.split(" ");
	        for(String s2:s1){
	          char[] c = s2.toCharArray();
	          String reverse = "";
	          for(int i=c.length-1; i>=0; i--){
	              reverse = reverse+c[i];
	          }
	          reverse=reverse+" ";
	          System.out.print(reverse);
	        }
	  }
	 
	 public static void removeDuplicate(String s) {
		 HashMap<Character, Integer> count = new HashMap<>();
		 for(char c:s.toCharArray()) {
			 count.put(c, count.getOrDefault(c,0)+1);
		 }
		 //remove duplicate string
		 for(Map.Entry<Character, Integer> entry : count.entrySet()) {
			 if(entry.getValue()==1) {
				 System.out.println(entry.getKey());
			 }
		 }
		 //print vowels and its size
		 for(Map.Entry<Character, Integer> entry : count.entrySet()) {
			 if(entry.getKey()=='i') {
				 System.out.println(entry.getKey()+" times "+entry.getValue());
			 }
		 }
		 
	 }
	 static void swap2() {
		 int a=5;
		 int b=10;
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a);
		 System.out.println(b);
	 }
	 static void anagram() {
		 String s1="kishore";
		 String s2="mano";
		 
		char[] charArray = s1.toCharArray();
		char[] charArra = s2.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArra);
		
		System.out.println(charArray);
		System.out.println(charArra);

		if(charArray.equals(charArra)) {
			System.out.println("it is anagram");
		}
		else {
			System.out.println("Not");
		}
	 }
	 
	 static void palindrome() {
		 
		 String s = "dshfg$%^&*23456";
		 System.out.println(s.replaceAll("[^a-zA-z0-9\\s]",""));
		 
	 }

	    // Main method
	    public static void main(String[] args) {
	        // Test the methods
	        System.out.println("Reversed: " + Reverse("Kishore"));
	        countVowels("KISHOREBABUAEIOUA");
	        System.out.println("Count of 'bb': " + countSubStringCount("abcbbcabbcab"));
	        countDuplicateCharacter("kishorekis");

	        twoListOfString();
duplicateStringCountswithIters();
reverseSentence();
reverseparticularSentence();
concat();
concat1();
removeIntergers();
occur();
vowelsConsonants();
vowelsAndItsValue();
sindhu();
removeDuplicate("kiisshore");
swap2();
anagram();
palindrome();
	    }


}
