
public class Demo {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.name = "Swift"; c1.age = 2;
		c2.name = "Altroz"; c2.age = 5;
		c3.name = "Baleno"; c3.age = 7;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		
		System.out.println(c1.age);
		System.out.println(c2.age);
		System.out.println(c3.age);
	}
}
