package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 	加了注释
	 * @param orderId
	 * @return
	 */
         //2222222222
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
	
}
