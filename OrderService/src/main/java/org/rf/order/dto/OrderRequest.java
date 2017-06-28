package org.rf.order.dto;

import org.rf.order.model.Barang;

public class OrderRequest {
	private String id;
	private Barang barang;

	public OrderRequest() {
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(String id, Barang barang) {
		super();
		this.id = id;
		this.barang = barang;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Barang getBarang() {
		return barang;
	}

	public void setBarang(Barang barang) {
		this.barang = barang;
	}

}
