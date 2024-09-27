import java.util.*;

class Student {

	int rafNum;

	String name;

	public Student(String n) {

		rafNum = (int)(Math.random()*10000);

	}

	public int getNum() {
		return rafNum;
	}

	public String getName() {
		return name;
	}
}


class Raffle {

	Student[] sArr;
	int[] rafNums;

	public Raffle(Student[] s) {
	
		sArr = s;
		
		rafNums = new int[s.length];

		for (int i = 0; i < sArr.length; i++) {

			rafNums[i] = sArr[i].getNum();
		}
	}

	public void printRafNums() {
		for (int n : rafNums) {
			System.out.println(n);
		}
	}

	public Student getWinner() {

		int choice = (int)(Math.random() * sArr.length);

		System.out.println("The winning number is: " + rafNums[choice]);

		return sArr[choice];
	}
}

class classnote_9_26 {

	public static void main(String[] args) {

		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		Student s4 = new Student("D");
		Student s5 = new Student("E");
		Student s6 = new Student("F");
		Student s7 = new Student("H");
		Student s8 = new Student("I");
		Student s9 = new Student("J");
		Student s10 = new Student("K");

		Student[] s = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

		Raffle a = new Raffle(s);

		a.printRafNums();

		Student win1 = a.getWinner();

		System.out.println(win1.getName() + " is the winner!");

		Raffle b = new Raffle(s);

		b.printRafNums();

		Student win2 = b.getWinner();

		System.out.println(win2.getName() + " is the winner!");

		Raffle c = new Raffle(s);

		c.printRafNums();

		Student win3 = c.getWinner();

		System.out.println(win3.getName() + " is the winner!");

	}
}