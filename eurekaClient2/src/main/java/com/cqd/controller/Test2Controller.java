package com.cqd.controller;

import com.cqd.api.Test1Api;
import com.cqd.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Test2Controller {
    @Autowired
    private Test1Api test1Api;

    @RequestMapping("test2")
    public String testClient2(){
        String s = test1Api.test1();
        return s;

    }
    @RequestMapping("list1")
    public List<Product> list(){
        List<Product> list = test1Api.list();
        return list;
    }
}
