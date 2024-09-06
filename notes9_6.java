class notes9_6 {

	public static void main(String[] args) {
		
		//data in java need sto have a type decalred
		int x = 5;

		//java will turn this into 4.0
		float y = 4;
		double z = 5.2;

		//booleans are either true or false
		boolean val = true;
		char myChar = 'A';
		String name = "Mr. Considine";

		// print the data
		System.out.println(x);
		System.out.println(y + z);

		//numerical data treats operators with math
		//wheras string data treats operators with concatenation
		System.out.println(val);
		System.out.println(name + name + name);

		//java operators
		//+, -, *, /, %--> remainder, ++, --

		//module operator calculates the remainder

		System.out.println(20 % 3);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);



	}

}