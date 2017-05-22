package ArithmeticOp;

import java.util.Scanner;

public class RelationalOp {

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
		
		System.out.println("==: "+(a==b));
		System.out.println("!=: "+(a!=b));
		System.out.println(">: "+(a>b));
		System.out.println("<: "+(a<b));
		System.out.println(">=: "+(a>=b));
		System.out.println("<=: "+(a<=b));
	}
	
	public static void main(String[] args) {
		
		RelationalOp ro=new RelationalOp();
		ro.userInputs();
		ro.performOperation();

	}
}
