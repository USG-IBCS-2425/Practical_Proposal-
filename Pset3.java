class Wallet {
	private double Money;
	private String IDnumber;

	public Wallet(double money, String iDnumber) {
		Money = money;
		IDnumber = iDnumber;
	}

	public void setMoney(double amount) {
        Money = amount;
    }

    public double getMoney() {
        return Money;
    }

    public void setIDnumber(String id) {
        IDnumber = id;
    }

	public String getIDnumber() {
		return IDnumber;
	}

	public double payday(double moneyin) {
		Money = moneyin + Money;
		return Money;
	}

	public double pay(double moneyout) {
		Money = Money - moneyout;
		return Money;
	}

}


class Shape {

	double area;

	public double area() {

		return 2.0;
	
	}

}


class Rectangle extends Shape {

	public double arear(double x, double y) {

		area = x * y;

		return area;
	}
}

class Circle extends Shape {

	public double areac(double radius) {

		area = radius * radius * 3.14;

		return area;	
	}

}

class Pset3 {

	public static void main(String[] args) {
		Wallet myWallet = new Wallet(250.0,"123456abc");
		System.out.println("Wallet ID:" + myWallet.getIDnumber());
		System.out.println("The initial amount of money is" + " " + myWallet.getMoney());

		myWallet.payday(100.0);
		System.out.println("The amount in the wallet now is" + " " + myWallet.getMoney());
		myWallet.pay(200.0);
		System.out.println("The amount in the wallet now is" + " " + myWallet.getMoney());

		Circle c = new Circle();
		double carea = c.areac(2.0);
		System.out.println("The area of the circle is" + " " + carea);
		Rectangle r = new Rectangle();
		double rarea = r.arear(4,5);
		System.out.println("The amount in the wallet now is" + " " + rarea);
	}

}