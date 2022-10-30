//Write a basic for loop program to print odd numbers lying in range 1 to 10.
//hint: use i = i+2 in syntax, initialize i =1; run till range 10;
package preclasspractice19102022;
import java.util.Scanner;
public class JavaForLoopPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	for(int i=1;i<=10;i=i+2){
	System.out.println(i);		

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int j=0;j<=9;j=j+2){
			System.out.println(arr[j]);
		
			for(int k:arr)
			System.out.println(k);

}
		}

}
}