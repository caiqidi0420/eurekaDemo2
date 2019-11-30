package com.cqd.mapper;

import com.cqd.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductMapper {
    List<Product> list();
}
