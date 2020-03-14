package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private  int lid;
    private String lname;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public void compile(){
        System.out.println("compiling the Laptop");
    }
}
