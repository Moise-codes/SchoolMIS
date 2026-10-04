package com.moise.schoolmis.school;

public class School {

    private long id ;
    private String name;
    private String code;
    private String email;
    private String phone;
    private String address;

    public School(long id , String name , String code , String email , String phone , String address  ) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public long  getId() {
        return id ;
    }
    public void setId(long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public  void setName() {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;

    }
    public String getEmail() {
           return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;

    }

    
}
