package org.rf.item.service;

import java.util.List;

import org.rf.item.model.Barang;

public interface ItemService {
	List<Barang> getAllItem();
	Barang getBarang(String id);
}
