package JavaClassPractice22;

class Student1{ //created a class
	int id;
	String Name;	
	
void insertRecord(int i,String n) { //declaring the method with insertRecord keyword
	id=i; //declared as integer
	Name=n;//declared as String
}

void displayInformation() {        //declaring the method with displayInformation keyword
	System.out.println(id +" " + Name);
}

}

public class JavaCallingClassAndMethods {
public static void main (String[]args) {
	Student1 s1 = new Student1(); //creating object s1 and calling class Student1
	Student1 s2= new Student1();	//creating object s1
	s1.insertRecord(1980, "Rajan");	//invoking the insert record method, if u dont mention the value else i =0 and n =null
	s2.insertRecord(1978, "Dimple Gupta");//invoking the insert record method, if u dont mention the value else i =0 and n =null
	
	s1.displayInformation(); //invoking the display information method, if u dont mention the value else i =0 and n =null
	s2.displayInformation(); //invoking the display information method, if u dont mention the value else i =0 and n =null
	
	
}
}
