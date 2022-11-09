/*
 * Program to implement the continue and break functionality
 * Create a program to print the table of 2. 
 * Create an infinite for loop, use continue if number doesn't come in table of 2,
 * and break if the loop variable exceeds 20
 */
package preclasspractice19102022;
import java.util.Scanner;
public class Javacontinuebreakpractice {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("pls enter table number");
		boolean isAnIntegerValue=sc.hasNextInt();// to avoid user to enter char val than number
		if (isAnIntegerValue) {
			int table =sc.nextInt();
	//	for(int i=1;i<=10;i++){
	//		System.out.println(table*i);
		//}
//	}else{
//		System.out.println("Enter number only");// to avoid user to enter char val than number
		//}
	//}
//}
	for(int i=1;i<=20;i++){
		if(i==1) {
			continue;
		}
		if(i==3) {
			continue;
		}
		if(i==5) {
			continue;
		}
		if(i==7) {
			continue;
		}
		if(i==9) {
			continue;
		}
		if(i==11) {
			continue;
		}
		if(i==13) {
			continue;
		}
		if(i==15) {
			continue;
		}
		if(i==17) {
			continue;
		}
		if(i==19) {
			continue;
		}
		if(i>20) {
			break;
		}else {
			System.out.println(i);
}
}
}
}
}