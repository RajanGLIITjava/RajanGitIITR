import java.util.Scanner;
public class UserInputValidation{
	public static void main(String[] arg){
	
		int a;
		char c;
		boolean b1;
		String str1;
		double d1;
		long l1;

		String reply="yes";

		while(reply.equals("yes")){
			System.out.println("please enter the integer number");
			Scanner sc =new Scanner(System.in);	
			a= sc.nextInt();
			System.out.println("Times five of our integer value will be" +" " +a*5);
			System.out.println("Do you want to continue testing other Data Members yes/no");
			reply=sc.next();

	}
	System.out.println("Thank you for your Testing the Rajan Test & Trial Version");
}
}