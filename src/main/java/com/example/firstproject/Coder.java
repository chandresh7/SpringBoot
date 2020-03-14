package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Coder {
     private int cid;
     private String cname;
     private String tech;
     @Autowired
     private Laptop laptop;

    public Coder() {
        System.out.println("object created");
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
    public  void show(){
        System.out.println("in show method");
        laptop.compile();
    }
}
