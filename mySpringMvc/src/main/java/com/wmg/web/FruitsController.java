package com.wmg.web;

import com.wmg.entity.Fruits;
import com.wmg.service.FruitsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fruits")
public class FruitsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    FruitsService fruitsService;

    @RequestMapping(value = "/{name}/detail", method = RequestMethod.GET)
    @ResponseBody
    public Fruits getFruit(@PathVariable("name") Long name, Model model){
        Fruits fruits = fruitsService.queryByFruitName(name);
        return fruits;
    }
}
