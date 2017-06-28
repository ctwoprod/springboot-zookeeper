package org.rf.stock.service.impl;

import java.util.Random;

import org.rf.stock.service.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
	//asal-asalan count stock
	public Integer countStock(String id){
		if(id.equalsIgnoreCase("1") || id.equalsIgnoreCase("3")){
			randInteger(0, 100);
		}
		return randInteger(20, 100);
	}
	
	public int randInteger(int min, int max) {
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
