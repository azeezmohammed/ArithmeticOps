package ArithmeticOp;

import java.util.Scanner;

public class Arithmetic2 {

	int a,b;
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
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
	}
	
	public static void main(String[] args) {
		
		Arithmetic2 ar2=new Arithmetic2();
		ar2.userInputs();
		ar2.performOperation();

	}
}
