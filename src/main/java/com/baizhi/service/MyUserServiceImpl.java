package com.baizhi.service;

import com.baizhi.dao.MyUserDAO;
import com.baizhi.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MyUserServiceImpl implements  MyUserService{
    @Autowired
    private MyUserDAO myUserDAO;

    @Override
    public void regist(MyUser myuser) {
        myUserDAO.save(myuser);
    }

    @Override
    public boolean login(MyUser myuser) {
        MyUser user=myUserDAO.queryUser(myuser);
        if(user!=null){
            return true;
        }
        return false;
    }
}
