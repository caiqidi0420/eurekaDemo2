package com.cqd.controller;

import com.cqd.entity.Product;
import com.cqd.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("test1")
    public String test1(){
        return "---test1--";
    }

    @RequestMapping("list")
    public List<Product> list(){
        List<Product> list = productMapper.list();
        return list;
    }
}
