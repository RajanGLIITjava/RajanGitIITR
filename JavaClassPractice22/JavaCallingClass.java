package JavaClassPractice22;
class Student{// name of class outside the main 
	int id;      //variable and its type declared outside the main 
	String name; //variable and its type declared outside the main
}

public class JavaCallingClass {
	public static void main(String[] args) {
		Student s1= new Student(); // calling Class Student created above and store value in "S1" object
		s1.id= 1980;		//initializing thru reference from class Student outside the main
		s1.name= "rajan"; 	//initializing thru reference from class Student outside the main
		System.out.println(s1.id); // Calling Method "id" from class created
		System.out.println(s1.name);// Calling Method "id" from class created
}
}
