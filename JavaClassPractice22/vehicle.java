package JavaClassPractice22;

class car {
	void run() {
		System.out.println("The Car is running");
	}
}
class car2 extends car{
	void run() {
		System.out.println("The car is running in speed");
	}
}

public class vehicle {
	public static void main(String[] args){
car2 obj= new car2();
obj.run();
}
}