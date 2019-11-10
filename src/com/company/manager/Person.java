package com.company.manager;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private CommunityHours communityHours;


    public Person(CommunityHours communityHours) {
        this("Unknown", 0, "Unidentified", "None", "None", communityHours);
    }

    public Person(String name, int age, String gender, String email, String phoneNumber, CommunityHours communityHours) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.communityHours = communityHours;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CommunityHours getCommunityHours() {
        return communityHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
