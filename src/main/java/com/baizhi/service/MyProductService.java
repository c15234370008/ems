package com.baizhi.service;

import com.baizhi.entity.MyProduct;

import java.util.List;

public interface MyProductService {
    List<MyProduct> findAll();
    void remove(Integer id);
    void add(MyProduct myproduct);
    void motify(MyProduct myproduct);
    List<MyProduct> findProduct(String name);
}
