package com.cqd.api;

import com.cqd.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(name="ENREKA-CLIENT01",url = "http://localhost:8083")
@FeignClient(name = "CLIENT1",url = "http://localhost:8083")
public interface Test1Api {
    @RequestMapping("test1")
    public String test1();

    @RequestMapping("list")
    public List<Product> list();
}
