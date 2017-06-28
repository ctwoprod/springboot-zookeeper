package org.rf.discount.controller;

import org.rf.discount.service.DiscountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {
	private static final Logger logger = LoggerFactory.getLogger(DiscountController.class);

	@Autowired
	private DiscountService discountService;

	@RequestMapping(path = "/discount/random", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Double getDiscount() {
		logger.info(":::call  /discount/random ");
		return discountService.getDiscount();
	}

}
