package shop;

public class Cloth {

	int id ;
	String model;
	String color;
	int price ;
	int quantity ;
	Size size;
	
	public Cloth(int id, String model, String color, int price, int quantity, Size size) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.size = size;
	}

	
	public double totalPrice() {
		int total = price * quantity;
		
		if(quantity > 10) {
			return total - ( total * 0.02);
		}
		
		return total;
	}
	
	
	public void printInformation() {
		System.out.print("Cloth information : id = " + id + "\n" +"model = " + model + "\n"+
				"color = " + color + "\n" + "price = " + price + "\n" +"quantity  = " + quantity + "\n"
				+"size  = " + size + "\n\n"
				);
	}	
}
