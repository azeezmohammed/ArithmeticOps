package ArithmeticOp;
import java.util.Scanner;

public class LogicalOp {
	
	boolean a,b;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter first boolean value");
		a=s.nextBoolean();
		System.out.println("Enter second boolean value");
		b=s.nextBoolean();
	}
	
	void operationsPerformed(){
		
		System.out.println("a&&b: "+(a&&b));
		System.out.println("a||b: "+(a||b));
		System.out.println("!(a&&b): "+!(a&&b));
	}

	public static void main(String[] args) {
		
		LogicalOp lo=new LogicalOp();
		lo.userInputs();
		lo.operationsPerformed();
	}

}
