
public class family {

	public static void main(String[] args) {
		//Create Relative class with a few variables in it and create its 5 objects in Family class.
		relative r1 = new relative();
		relative r2 = new relative();
		relative r3 = new relative();
		relative r4 = new relative();
		relative r5 = new relative();
		
		r1.name="Rahul";
		r1.relative_name="Abhishek";
		r1.relation="Brother";
		
		System.out.println(r1.name);
		System.out.println(r1.relative_name);
		System.out.println(r1.relation);
		System.out.println();
		
		r2.name="Abhi";
		r2.relative_name="Jayshree";
		r2.relation="Mother";
		
		System.out.println(r2.name);
		System.out.println(r2.relative_name);
		System.out.println(r2.relation);
		System.out.println();
		
		r3.name="Rahul";
		r3.relative_name="Lahu";
		r3.relation="Father";
		
		System.out.println(r3.name);
		System.out.println(r3.relative_name);
		System.out.println(r3.relation);
		System.out.println();
		
		r4.name="Shekhar";
		r4.relative_name="Baburao";
		r4.relation="Grand-Father";
		
		System.out.println(r4.name);
		System.out.println(r4.relative_name);
		System.out.println(r4.relation);
		System.out.println();
		
		r5.name="sarthak";
		r5.relative_name="Aashutosh";
		r5.relation="cousin";
		
		System.out.println(r5.name);
		System.out.println(r5.relative_name);
		System.out.println(r5.relation);
	}

}
