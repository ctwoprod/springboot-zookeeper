package org.rf.order.service;

import org.rf.order.dto.OrderRequest;
import org.rf.order.dto.OrderResponse;

public interface OrderService {
	OrderResponse makeOrder(OrderRequest request);
}
