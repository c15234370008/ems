package com.baizhi.service;


import com.baizhi.entity.MyUser;



public interface MyUserService {
    void regist(MyUser myuser);
    boolean login(MyUser myuser);
}
