// Java program to demonstrate 
// the setCharAt() Method. 

class GFG { 
	public static void main(String[] args) 
	{ 

		// create a StringBuilder object 
		// with a String pass as parameter 
		StringBuilder str 
			= new StringBuilder("WelcomeGeeks"); 

		// print string 
		System.out.println("String = "
						+ str.toString()); 

		// set char at index 2 to 'L' 
		str.setCharAt(2, 'L'); 

		// print string 
		System.out.println("After setCharAt() String = "
						+ str.toString()); 
	} 
} 
