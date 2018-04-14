package com.wmg.service.impl;

import com.wmg.dao.FruitsDao;
import com.wmg.entity.Fruits;
import com.wmg.service.FruitsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitsServiceImpl implements FruitsService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FruitsDao fruitsDao;

    public Fruits queryByFruitName(long name) {
        return fruitsDao.queryByFruitName(name);
    }
}
