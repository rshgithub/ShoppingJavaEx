package shop;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cloth cloth1 = new Cloth(1, "first cloth", "red", 100, 2, Size.Large);
		cloth1.totalPrice();
		cloth1.printInformation();
		
		Cloth cloth2 = new Cloth(2, "sec cloth", "yellow", 500, 3, Size.Mediam);
		cloth2.totalPrice();
		cloth2.printInformation();
		
		Cloth cloth3 = new Cloth(3, "third cloth", "red", 400, 4, Size.Small);
		cloth3.totalPrice();
		cloth3.printInformation();
		
		Cloth cloth4 = new Cloth(4, "fourth cloth", "black", 200, 1, Size.XXL);
		cloth4.totalPrice();
		cloth4.printInformation();
		
		
		
		System.out.print("-------------------------------------------------------\n");

		ArrayList<Cloth> clothes = new ArrayList<>();
		Collections.addAll(clothes, cloth1,cloth2,cloth3);
		
		Cart cart1 = new Cart(clothes);
		cart1.printAllInCart();
		cart1.totalPriceValue();
		cart1.count();
		System.out.print("-----------\n");
		cart1.addToCart(cloth4);
		System.out.print("-----------\n");
		cart1.removeFromCart(cloth1.id);
		System.out.print("-----------\n");
		cart1.printAllInCart();
		
	}

}
