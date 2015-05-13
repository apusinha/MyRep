

/*This program computes the factorial of a number*/

public class Fact { //define class
	
	public static void main (String[] args) { //The program starts here 
		int input = Integer.parseInt(args[0]); //Get the users input
		double result = factorial(input); //Compute the factorial
		System.out.println(result); //Print out the result	
	}
	
	public static double factorial(int x) {
		if (x < 0)
			return 0.0;
		double fact = 1.0;	
		while (x > 1) {
			fact = fact * x;
			x = x - 1;
		}
		return fact;	
			
	}
	

}