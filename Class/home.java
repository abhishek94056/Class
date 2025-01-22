
public class home {

	public static void main(String[] args) {
		//Create Pet class with a few variables in it and create its 2 objects in Home class.
		pet p1 = new pet();
		pet p2 = new pet();
		
		p1.id=1007;
		p1.type="dogy";
		p1.name="lucci";
		p1.weight=12.234F;
		p1.colour="white";
		
		System.out.println(p1.id);
		System.out.println(p1.type);
		System.out.println(p1.name);
		System.out.println(p1.weight);
		System.out.println(p1.colour);
		System.out.println("");
		
		p2.id=1008;
		p2.type="cat";
		p2.name="sweety";
		p2.weight=2.44F;
		p2.colour="black";
		
		System.out.println(p2.id);
		System.out.println(p2.type);
		System.out.println(p2.name);
		System.out.println(p2.weight);
		System.out.println(p2.colour);

	}

}
