package com.phishing.communityservice.User;


public class User {

    private Long id;
    private String name;
    private String pnum;
    private String email;

    public User(Long id,String name ,String pnum, String email){

        this.id=id;
        this.name=name;
        this.pnum=pnum;
        this.email=email;
    }
    
}
