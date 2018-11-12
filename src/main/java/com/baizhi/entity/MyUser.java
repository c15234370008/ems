package com.baizhi.entity;

public class MyUser {
    private Integer id;
    private String username;
    private String realname;
    private Integer age;
    private String password;
    private String sex;

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public MyUser(Integer id, String username, String realname, Integer age, String password, String sex) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.age = age;
        this.password = password;
        this.sex = sex;
    }

    public MyUser() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
