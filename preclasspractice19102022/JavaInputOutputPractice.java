package preclasspractice19102022;
import java.util.Scanner;
public class JavaInputOutputPractice {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;
			System.out.println("enter int value");
			num1=in.nextInt();
			System.out.println("integer->"+num1);
			
			System.out.println("Enter float value");
			num2=in.nextFloat();
			System.out.println("float->"+num2);
			
			System.out.println("Enter String number");
			str=in.next();
			System.out.println("string->"+str);
			
			System.out.println("Enter Double number");
			num3=in.nextDouble();
			System.out.println("Doube->"+num3);
			
			System.out.println("Enter Character value");
			character=in.next().charAt(0);
			System.out.println("Character->"+character);

	}

}
