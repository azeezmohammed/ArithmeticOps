package ArithmeticOp;
import java.util.Scanner;

public class BitwiseOp {
	
	int a,b;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter first value");
		a=s.nextInt();
		System.out.println("Enter second value");
		b=s.nextInt();
	}
	
	void operationsPerformed(){
		
		System.out.println("a&b: "+(a&b));
		System.out.println("a|b: "+(a|b));
		System.out.println("(a^b): "+(a^b));
		System.out.println("(a>>b): "+(a>>b));
		System.out.println("(a<<b): "+(a<<b));
		System.out.println("(a>>>b): "+(a>>>b));
	}

	public static void main(String[] args) {
		
		BitwiseOp bo=new BitwiseOp();
		bo.userInputs();
		bo.operationsPerformed();
	}

}