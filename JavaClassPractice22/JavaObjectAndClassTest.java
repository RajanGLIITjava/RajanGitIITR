package JavaClassPractice22;

class Customer{
	String fullName;
	int age;
	
}

public class JavaObjectAndClassTest {
	public static void main(String[] args) {
		Customer cus1= new Customer();
		cus1.fullName="Rajan";
		cus1.age=45;
	System.out.println("Customer Name is" + " " +cus1.fullName);
	System.out.println(cus1.fullName +" your age is" +" " + cus1.age);
}
}

