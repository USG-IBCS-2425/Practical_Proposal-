class Penguin {

	String name;
	String gender; 
	String nickname;
	String enclosure;
	double height;
	int age;
	double weight;

	public String getName(){
		return name;
	}

	public Penguin (String n, int a) {
		name = n;
		gender = "female"; 
		nickname = "pengy";
		enclosure = "penguins";
		height = 1.3;
		age = a;
		weight = 44.5;
	}
}