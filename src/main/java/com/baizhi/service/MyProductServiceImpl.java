package com.baizhi.service;

import com.baizhi.dao.MyProductDAO;
import com.baizhi.entity.MyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MyProductServiceImpl implements MyProductService{
    @Autowired
    private MyProductDAO myProductDAO;

    @Override
    public List<MyProduct> findAll() {
        return myProductDAO.queryAll();
    }

    @Override
    public void remove(Integer id) {
        myProductDAO.delete(id);
    }

    @Override
    public void add(MyProduct myproduct) {
        myProductDAO.save(myproduct);
    }

    @Override
    public void motify(MyProduct myproduct) {
        myProductDAO.update(myproduct);
    }

    @Override
    public List<MyProduct> findProduct(String name) {
        return myProductDAO.queryProduct(name);
    }
}
