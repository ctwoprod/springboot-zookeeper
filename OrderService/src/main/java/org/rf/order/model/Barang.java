package org.rf.order.model;


public class Barang {
	private String id;
	private String name;
	private Double price;
	private String kelompok;

	public Barang() {
		// TODO Auto-generated constructor stub
	}

	public Barang(String id, String name, Double price, String kelompok) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kelompok = kelompok;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getKelompok() {
		return kelompok;
	}

	public void setKelompok(String kelompok) {
		this.kelompok = kelompok;
	}

}

