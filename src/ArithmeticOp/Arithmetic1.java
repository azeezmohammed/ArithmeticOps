package ArithmeticOp;

import java.util.Scanner;

public class Arithmetic1 {

		int a,b,c;
		Scanner s=new Scanner(System.in);
		
		void userInputs(){
			
			System.out.println("Enter first number");
	    	a=s.nextInt();
	    	System.out.println("Enter second number");
	    	b=s.nextInt();
	    	System.out.println();
			
		}
		
		public void performOperation()
		{
			
			c=a+b;
			System.out.println("Addition: "+c);
			c=a-b;
			System.out.println("Subtraction: "+c);
			c=a*b;
			System.out.println("Multiplication: "+c);
			c=a/b;
			System.out.println("Division: "+c);
		}
		
		public static void main(String[] args) {
			
			Arithmetic1 ar1=new Arithmetic1();
			ar1.userInputs();
			ar1.performOperation();

		}
	}


