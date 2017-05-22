package ArithmeticOp;

import java.util.Scanner;

public class DoubleTest {
	
	double a,b;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter first number");
    	a=s.nextDouble();
    	System.out.println("Enter second number");
    	b=s.nextDouble();
    	System.out.println();
		
	}
	
	public void performOperation()
	{
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
	}

	public static void main(String[] args) {
		
		DoubleTest dt=new DoubleTest();
		dt.userInputs();
		dt.performOperation();

	}

}
