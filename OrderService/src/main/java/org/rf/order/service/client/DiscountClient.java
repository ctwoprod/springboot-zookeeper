package org.rf.order.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class DiscountClient {
	@Autowired
	private TheClient theClient;

	/**
	 * Create a REST-ful client to connect to the "discountService" service
	 * available on ZooKeeper.
	 *
	 */
	@FeignClient(name = "discountService")
	interface TheClient {
		@RequestMapping(value = "/discount/random", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		Double getRandomDiscount();
	}

	/**
	 * Initiate call to discountService.
	 * 
	 * @param 
	 * @return the Double
	 */
	public Double getRandomDiscount() {
		return theClient.getRandomDiscount();
	}
}
