package shop;

import java.util.ArrayList;

public class Cart {

	ArrayList<Cloth> clothes;
	
	

	public Cart(ArrayList<Cloth> clothes) {
		this.clothes = clothes;
	}


	public float totalPriceValue() {
		
		float allPrices = 0;
		
		for (Cloth cloth : clothes){
			allPrices+= cloth.totalPrice();
		}
		
		return allPrices ;
	}
	
	
	public void printAllInCart() {
		for (Cloth cloth : clothes){
			cloth.printInformation();
		}
 	}
	
	
	public void addToCart(Cloth cloth) {
		clothes.add(cloth);
		System.out.println(cloth.model + " added to cart succefully");
	}
	
	public boolean removeFromCart(int id) {
		
		for (Cloth cloth : clothes){
			if(cloth.id == id) {
				clothes.remove(cloth); 
				System.out.println("cloth of id = " + id + " removed from cart succefully");
				return true;
			}else {
				System.out.println("sorry cloth of id = " + id + " doesn't exist in your cart");
				return false;
			}
		}
		
		return false;
	}
	
	public void count() {
		System.out.println( clothes.size() +" clothes in this shop");
	}
	
}
