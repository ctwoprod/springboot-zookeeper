package org.rf.item.repository;

import java.util.ArrayList;
import java.util.List;

import org.rf.item.model.Barang;
import org.springframework.stereotype.Component;

/*
 * DAO Sementara
 * */
@Component
public class BarangDao {
	private static List<Barang> items = new ArrayList<>();
	//initiation
	static {
		items.add(new Barang("1", "Marlboro", 25000d, "1"));
		items.add(new Barang("2", "Ardath", 17000d, "1"));
		items.add(new Barang("3", "Sampoerna", 22000d, "2"));
		items.add(new Barang("4", "LA Lights", 20000d, "2"));
		items.add(new Barang("5", "Djisamsoe", 19000d, "3"));
		//dst.
	}

	public List<Barang> getAllBarang() {
		return items;
	}

	public Barang getBarangById(String id) {
		return items.get(Integer.valueOf(id) - 1);
	}
}
