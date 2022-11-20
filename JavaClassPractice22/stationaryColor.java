package JavaClassPractice22;
// overloading -having parameterised constructor 
class pen{
	pen(){
		System.out.println("This is a pen");
	}
	pen(String company){
		System.out.println("This is manufactured by " + company);
	}
	pen(int cost, String color, float size){
		System.out.println("This pen cost the company " + cost);
		System.out.println("This pen writes " + color);
		System.out.println("The Pen use ball point " + size);
	}
}
public class stationaryColor {
	public static void main(String[] args) {
		pen stationarybehaviour = new pen();
		pen stationarybehaviour1 = new pen("Reynold");
		pen stationarybehaviour2 = new pen(10,"blue", 0.2f);
	}
}
