package org.rf.order.service.client;

import org.rf.order.model.Barang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class ItemClient {
	@Autowired
	private TheClient theClient;
	
	/**
	 * Create a REST-ful client to connect to the "itemService" service available on
	 * ZooKeeper.
	 *
	 */
	@FeignClient(name = "itemService")
	interface TheClient {
		@RequestMapping(value = "/item/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		Barang getBarangById(@PathVariable("id") String id);
	}
	
	/**
	 * Initiate call to itemService.
	 * 
	 * @param id
	 * @return the Barang
	 */
	public Barang getBarangById(String id) {
		return theClient.getBarangById(id);
	}
}
