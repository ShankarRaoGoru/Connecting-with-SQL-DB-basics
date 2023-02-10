package com.example.sql_rocks;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //hibernate can identify whose attributes to pick for table creation
@Table(name="user_information") //for giving the table name,by default table name will be the class name
public class User {
    @Id //written on the attribute which has to become the primary key
    private int admNo;
    private String name;
    private int age;
    private String mobNo;

    private String collgeName;
    @Column(name="gmail",unique = true)
    private String email;

    public User() {
    }

    public User(int admNo, String name, int age, String mobNo,String collgeName,String email) {
        this.admNo = admNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
        this.collgeName=collgeName;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdmNo() {
        return admNo;
    }

    public String getCollgeName() {
        return collgeName;
    }

    public void setCollgeName(String collgeName) {
        this.collgeName = collgeName;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
