package preclasspractice19102022;

public class JavaStarComplexLeftTest{
public static void main(String[] args) {

	for(int borderline=0;
			borderline<=5; 
			borderline++){
		for(int innerborderline=1;
				innerborderline<=borderline;//if u put 5 i/o borderline, it will give 5 * on each line
				innerborderline++){
					System.out.print("*");
					System.out.print(" ");
	}
			System.out.println("*");
		}
	}
}