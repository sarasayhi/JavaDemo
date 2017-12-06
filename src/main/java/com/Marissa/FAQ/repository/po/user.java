package com.Marissa.FAQ.repository.po;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user")
public class user implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "lastTime")
    private Date lastTime;

    public user() {}

    public user(String userName, String pwd, Date lastTime) {
        this.userName = userName;
        this.pwd = pwd;
        this.lastTime = lastTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}