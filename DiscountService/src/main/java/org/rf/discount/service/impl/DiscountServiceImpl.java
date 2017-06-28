package org.rf.discount.service.impl;

import java.util.Calendar;

import org.rf.discount.service.DiscountService;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Override
	public Double getDiscount() {
		return returnDiscount();
	}

	//discount asal-asalan
	private Double returnDiscount() {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		if (day < 5) {
			return 0.2;
		} else if (day > 5 && day < 25) {
			return 0d;
		}
		return 0.1;
	}

}
