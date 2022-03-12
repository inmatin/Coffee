
public class Coffee {

	private double price;
	private int size;
	private boolean whipped;
	private static final double unitPrice = 0.75;

	// overload constructors

	// no arg or no-parameter constructor
	public Coffee() {

	}

	// paramaterized constructor
	public Coffee(double price, int size) {

		this.price = price;
		this.size = size;

	}

	// paramaterized constructor
	public Coffee(double price, int size, boolean whipped) {
		//this is a constructor
		this.price = price;
		this.size = size;
		this.whipped = whipped;

	}

	// paramaterized constructor
	public Coffee(int size) {
		this.size = size;

	}

	// copy constructor
	public Coffee(Coffee c) {
		this.price = c.price;
		this.size = c.size;
		this.whipped = c.whipped;

	}
	
	//worker/helper = method
	
	//price of coffee is 0.75*size
	
	public double computePrice() {
		
		return unitPrice*size;
		
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isWhipped() {
		return whipped;
	}

	public void setWhipped(boolean whipped) {
		this.whipped = whipped;
	}
}
