package ArithmeticOp;

import java.util.Scanner;

public class AssignmentOp {

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
		
		System.out.println("=: "+(a=b));
		System.out.println("+=: "+(a+=b));
		System.out.println("-=: "+(a-=b));
		System.out.println("*=: "+(a*=b));
		System.out.println("/=: "+(a/=b));
		System.out.println("%=: "+(a%=b));
	}
	
	public static void main(String[] args) {
		
		AssignmentOp as=new AssignmentOp();
		as.userInputs();
		as.performOperation();

	}
}
