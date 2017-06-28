package org.rf.item.controller;

import java.util.List;

import org.rf.item.model.Barang;
import org.rf.item.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	@RequestMapping(path = "/item/all", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Barang> getItemAll() {
		logger.info(":::call  /item/all");
		return itemService.getAllItem();
	}

	@RequestMapping(path = "/item/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Barang getItem(@PathVariable("id") String id) {
		logger.info(":::call  /item/{id}");
		return itemService.getBarang(id);
	}
}
