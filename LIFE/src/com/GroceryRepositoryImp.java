package com;

public class GroceryRepositoryImp implements GroceryRepository {

	String[] groceries = new String[TOTAL_ITEMS];

	private int position;

	public void save(String grocery) {
		System.out.println("grocery items");
		this.groceries[position] = grocery;
		this.position++;
		System.out.println("grocery name   " + grocery + "  position   " + this.position);

	}

}
