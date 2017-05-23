package ArithmeticOp;
import java.util.Scanner;

public class BasicCalc {

	int a,b,ch;
	Scanner s=new Scanner(System.in);
	
	void menu(){
		
		System.out.println("------*------");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("------*------");
		System.out.println();
		System.out.println("Enter your choice");
		ch=s.nextInt();
	}
	
	void userInputs(){
		
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second number");
		b=s.nextInt();
	}
	
	void operationPerformed(){
		
		if(ch==1)
			System.out.println("a+b: "+(a+b));
		else if(ch==2)
			System.out.println("a-b: "+(a-b));
		else if(ch==3)
			System.out.println("a*b: "+(a*b));
		else if(ch==4)
			System.out.println("a/b: "+(a/b));
		else
			System.out.println("Wrong selection");
	}
	
	public static void main(String[] args){
		
		BasicCalc bc=new BasicCalc();
		bc.userInputs();
		bc.menu();
		bc.operationPerformed();
	}
}
