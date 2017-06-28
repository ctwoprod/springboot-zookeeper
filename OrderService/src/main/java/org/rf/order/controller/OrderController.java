package org.rf.order.controller;

import org.rf.order.dto.OrderRequest;
import org.rf.order.dto.OrderResponse;
import org.rf.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;

	@RequestMapping(path = "/make-order", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse makeOrder(@RequestBody OrderRequest request) {
		logger.info(":::call  /make-order ");
		return orderService.makeOrder(request);
	}
}
