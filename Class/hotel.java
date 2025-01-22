
public class hotel {

	public static void main(String[] args) {
		//Create Food class with a few variables in it and create its 5 objects in Hotel class.
		food f1 = new food();
		food f2 = new food();
		food f3 = new food();
		food f4 = new food();
		food f5 = new food();
		
		f1.name="Bread";
		f1.id=102;
		f1.price=150;
		System.out.println(f1.name);
		System.out.println(f1.id);
		System.out.println(f1.price);
		System.out.println();
		
		f2.name="Rice";
		f2.id=1045;
		f2.price=15;
		System.out.println(f2.name);
		System.out.println(f2.id);
		System.out.println(f2.price);
		System.out.println();
		
		f3.name="milk";
		f3.id=1067;
		f3.price=120;
		System.out.println(f3.name);
		System.out.println(f3.id);
		System.out.println(f3.price);
		System.out.println();
		
		f4.name="Paneer";
		f4.id=1032;
		f4.price=200;
		System.out.println(f4.name);
		System.out.println(f4.id);
		System.out.println(f4.price);
		System.out.println();
		
		f5.name="cake";
		f5.id=567;
		f5.price=350;
		System.out.println(f5.name);
		System.out.println(f5.id);
		System.out.println(f5.price);
	}

}
