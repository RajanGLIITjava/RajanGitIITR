package preclasspractice19102022;
import java.util.Scanner;
public class JavaTernaryChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the number");
		int num1 = in.nextInt();
		System.out.println(num1);
String result=(num1%2==0)? ("its even number") : "its odd number";//we used String and variable result
System.out.println(result);
}
}

//check whether the given number is even number or not using Ternary operator
/*package preclasspractice19102022;
import java.util.Scanner;
public class JavaTernaryChallenge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the even number");
		int num1 = in.nextInt();
		int num2=2;
		System.out.println(num1);
		int num3=num1%num2;
		if(num3==0){
			System.out.println("its even number");
		}else {
			System.out.println("its odd number");
		}
}
}
*/