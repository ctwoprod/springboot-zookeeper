package org.rf.item.service.impl;

import java.util.List;

import org.rf.item.model.Barang;
import org.rf.item.repository.BarangDao;
import org.rf.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private BarangDao barangDao;

	public List<Barang> getAllItem() {
		return barangDao.getAllBarang();
	}

	public Barang getBarang(String id) {
		return barangDao.getBarangById(id);
	}
}
