package com.baizhi.dao;

import com.baizhi.entity.MyUser;


public interface MyUserDAO {
     void save(MyUser myuser);
     MyUser queryUser(MyUser myuser);

}
