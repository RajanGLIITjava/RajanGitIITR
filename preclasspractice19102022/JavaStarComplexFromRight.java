package preclasspractice19102022;

public class JavaStarComplexFromRight {
	public static void main(String[] args) {
	
		for(int borderline=1;
				borderline<=5; 
				borderline++){
			
		for(int innerborderline=1;
				innerborderline<=5;
				innerborderline++){
					
					int counter=5;
					boolean printStar=true;
					int tempstar=(counter-borderline);
					
						if (innerborderline<=tempstar) {
							printStar=false;
							System.out.print(" "); //innborderline=1 but tempstar value is 4
							System.out.print(" ");//it will always print blanks.
						}else {
							printStar=true;
							System.out.print("*");// innboraderline will print 1:1
							System.out.print(" ");
						}
				} System.out.println();		
		}	
	}		
}
