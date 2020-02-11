package com.itdr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Users {
    private Integer id;
    private String username;
    private String password;
    private String tel;
    private Integer type = 0;
    private Integer stats = 0;

    public Integer getId() {
        return id;
    }
    @Value("1")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    @Value("sxf")
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    @Value("123")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }
    @Value("13848520194")
    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getType() {
        return type;
    }
    @Value("1")
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStats() {
        return stats;
    }
    @Value("1")
    public void setStats(Integer stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", type=" + type +
                ", stats=" + stats +
                '}';
    }
}
