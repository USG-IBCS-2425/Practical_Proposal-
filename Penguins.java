class Penguins {

	String enclosurename = "penguins";

	static String animals = "";

	static int animalsnum = 0;

	public static void main(String[] args) {

		Penguin a = new Penguin("Apple",5);
		addAnimal(a);

		Penguin b = new Penguin("Banana",5);
		addAnimal(b);

		Penguin c = new Penguin("coconut",5);
		addAnimal(c);

		Penguin d = new Penguin("durian",5);
		addAnimal(d);

		Penguin f = new Penguin("fig",5);
		addAnimal(f);

		System.out.println("Penguins in the enclosure: " + getAnimal());
		System.out.println("There are " + countAnimals() + " penguins in the enclosure.");

	}

	public static void addAnimal(Penguin p) {

        if (animals.isEmpty()) {

            animals = p.getName(); 

        } else {

            animals = animals + ", " + p.getName(); 

        }

        animalsnum++;	

    }

	public static String getAnimal() {
        return animals; 
    }

    public static int countAnimals() {
        return animalsnum;
    }








}