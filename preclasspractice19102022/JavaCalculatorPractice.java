/*
Write a program in java to implement a basic calculator using 
switch case statement and Accept two no as user input and print
the result based on operation. 
Display list of options 
        1 → addition
        2 → subtraction
        3 → multiplication
        4 → division
Perform division only if the second number is not equal to 0.
If the second number is 0 print “Cannot be divided” on console.
 */
package preclasspractice19102022;
import java.util.Scanner;
public class JavaCalculatorPractice {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input First Number");		
		int firstnum= sc.nextInt();
		System.out.println("Input Second Number");
		int secondnum= sc.nextInt();
		
		System.out.println("Choose 1 → addition");
		System.out.println("Choose 2 → Substraction");
		System.out.println("Choose 3 → multiplication");
		System.out.println("Choose 4 → Division");
		int choose =sc.nextInt();
		
		switch (choose){
		case 1:System.out.println(firstnum+secondnum);break;	
		case 2:System.out.println(firstnum-secondnum);break;
		case 3:System.out.println(firstnum*secondnum);break;
		case 4:
			if(secondnum==0) { 
				System.out.println("Cannot be divided");
			}
			else {
			System.out.println(firstnum/secondnum);break;
			}
		}
	}
}
