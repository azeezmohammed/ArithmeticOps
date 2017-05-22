package ArithmeticOp;

import java.util.Scanner;

public class Inc_Dec {

	int x;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter a number");
    	x=s.nextInt();
    	System.out.println();
		
	}
	
	public void performOperation()
	{
		
		System.out.println("x++: "+(x++));
		System.out.println("++x: "+(++x));
		System.out.println("x--: "+(x--));
		System.out.println("--x: "+(--x));
	}
	
	public static void main(String[] args) {
		
		Inc_Dec id=new Inc_Dec();
		id.userInputs();
		id.performOperation();

	}
}
