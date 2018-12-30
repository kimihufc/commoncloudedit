package com.hjl.yh;

/**
 * @author: HJL
 * @create: 2018-12-30 14:12
 */
public class User {

    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户登录名
     */
    private String name;
    /**
     * 用户密码
     */
    private String pass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
