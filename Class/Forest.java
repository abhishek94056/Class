
public class Forest {

	public static void main(String[] args) {
		//Create Animal class with a few variables in it and create its 5 objects in Forest class.
		animal a1 = new animal();
		animal a2 = new animal();
		animal a3 = new animal();
		animal a4 = new animal();
		animal a5 = new animal();
		
		a1.Breed ="german sheferd";
		a2.Breed ="Bull-Dog";
		a3.Breed ="Labrador";
		a4.Breed ="golden retriver";
		a5.Breed ="beagle";
		
		a1.id=102;
		a2.id=103;
		a3.id=104;
		a4.id=105;
		a5.id=106;
		
		a1.height="5feet";
		a2.height="7feet";
		a3.height="3feet";
		a4.height="2feet";
		a5.height="4feet";
		
		a1.name="Lucci";
		a2.name="rocky";
		a3.name="sweety";
		a4.name="jully";
		a5.name="jocky";
		
		a1.weight="2feet";
		a2.weight="2.4feet";
		a3.weight="4.3feet";
		a4.weight="3feet";
		a5.weight="2.9feet";
		
		System.out.println(a1.Breed);
		System.out.println(a1.id);
		System.out.println(a1.height);
		System.out.println(a1.name);
		System.out.println(a1.weight);
		System.out.println();
		
		System.out.println(a2.Breed);
		System.out.println(a2.id);
		System.out.println(a2.height);
		System.out.println(a2.name);
		System.out.println(a2.weight);
		System.out.println();
		
		System.out.println(a3.Breed);
		System.out.println(a3.id);
		System.out.println(a3.height);
		System.out.println(a3.name);
		System.out.println(a3.weight);
		System.out.println();
		
		System.out.println(a4.Breed);
		System.out.println(a4.id);
		System.out.println(a4.height);
		System.out.println(a4.name);
		System.out.println(a4.weight);
		System.out.println();
		
		System.out.println(a5.Breed);
		System.out.println(a5.id);
		System.out.println(a5.height);
		System.out.println(a5.name);
		System.out.println(a5.weight);
	}

}
