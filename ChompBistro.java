import java.util.*;

class ChompBistro {
	private String[] employees;
	//String[] employees;
	private String[] menuItems;
	int day;

	//constructor method 
	public ChompBistro(String n, String m) {
		name = "n";
		//employees = {"Abby","Lisa","Vera","Trinity"};
		menuItem = "m";
		day = 1;
		//String[] employees = {"Abby","Lisa","Vera","Trinity"};
		//String[] menuItems = {"Hot Sandwich","Chocalate Milk","Fruit Bowl","Salad"};
	}

	public static void addBistro(name n) {
		String result= "";
		for(i=0; i< 5; i++){
			result += employee + ", ";
		}
        return result;
    }

    public static String[] getMenuItems() {
        return menuItem; 
    }

    public static void addMenu(menuItem m) {
        if (menuItem.isEmpty()) {
            menuItem = m.getName(); 
        } else {
            menuItem = menuItem + ", " + m.getName(); 
        }
    }

    public String getName(){
		return name;
	}

	public int getDays(){
		int random = (int)(Math.random()*a.length);
	}

	public static void main(String[] args) {

		bistro a = new bistro("Abby","burger");
		addBistro(a);

		bistro b = new bistro("Lisa","Cookie");
		addBistro(b);

		bistro c = new bistro("Vera","Fruit Bowl");
		addBistro(c);

		bistro d = new bistro("Trinity","Chocolate Milk");
		addBistro(d);

		Scanner s = new Scanner(System.in);

		String Choice = S.nextLine();

		if(Choice == "menu") {

			bistro.getMenu();

		}
		
	}
}