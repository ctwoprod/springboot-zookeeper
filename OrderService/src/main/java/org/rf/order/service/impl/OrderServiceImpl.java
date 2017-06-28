package org.rf.order.service.impl;

import java.util.UUID;

import org.rf.order.dto.OrderRequest;
import org.rf.order.dto.OrderResponse;
import org.rf.order.model.Barang;
import org.rf.order.service.OrderService;
import org.rf.order.service.client.DiscountClient;
import org.rf.order.service.client.ItemClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private ItemClient itemClient;
	@Autowired
	private DiscountClient discountClient;

	public OrderResponse makeOrder(OrderRequest request) {
		Barang barang = itemClient.getBarangById(request.getBarang().getId());
		Double discount = discountClient.getRandomDiscount();
		Double newPrice = barang.getPrice() - (barang.getPrice() * discount);
		barang.setPrice(newPrice);
		OrderResponse response = new OrderResponse(UUID.randomUUID().toString(), barang);
		return response;
	}
}
