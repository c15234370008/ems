package com.baizhi.dao;

import com.baizhi.entity.MyProduct;

import java.util.List;

public interface MyProductDAO {
     List<MyProduct> queryAll();
     void delete(Integer id);
     void save(MyProduct myproduct);
     void update(MyProduct myproduct);
     List<MyProduct> queryProduct(String name);
}
