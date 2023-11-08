package com.xworkz.Fish;

public class SaloonItemDTO {
	private int id;
	private String name;
	private int price;
	private String usage;
	private String man;

	public SaloonItemDTO() {
		System.out.println("Saloon Object is Created...");
	}

	public SaloonItemDTO(int id, String name, int price, String usage, String man) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.usage = usage;
		this.man = man;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	@Override
	public String toString() {
		return "SaloonItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", usage=" + usage + ", man=" + man
				+ "]";
	}
	

}
