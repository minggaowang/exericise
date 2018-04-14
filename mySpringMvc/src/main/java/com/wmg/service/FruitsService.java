package com.wmg.service;

import com.wmg.entity.Fruits;

public interface FruitsService {

    /**
     * 通过名称获取水果
     * @param name
     * @return
     */
    public Fruits queryByFruitName(long name);
}
