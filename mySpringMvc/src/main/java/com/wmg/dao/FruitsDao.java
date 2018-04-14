package com.wmg.dao;

import com.wmg.entity.Fruits;

public interface FruitsDao {

	/**
	 * 通过name查询水果
	 * 
	 * @param name
	 * @return
	 */
	Fruits queryByFruitName(long name);

}
