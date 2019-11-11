package com.company.manager;

public class Person {
    private String name;
    private CommunityHours communityHours;

    public Person(CommunityHours communityHours) {
        this("Unknown", communityHours);
    }

    public Person(String name,CommunityHours communityHours) {
        this.name = name;
        this.communityHours = communityHours;
    }

    public void printPersonsCommunityHours(Person person, CommunityHours communityHours) {
        System.out.println("------------ Your Information ------------");
        System.out.println();
        System.out.println("Your name: " + person.getName());
        System.out.println("Amount of community hours: " + communityHours.getHours());
        System.out.println();
        System.out.println("REQUIRED AMOUNT OF HOURS: " + communityHours.getGraduationHoursAmount());
        System.out.println("You have " + communityHours.getHours() + " out of the " + communityHours.getGraduationHoursAmount() + " required amount of hours.");
        System.out.println();
        System.out.println("------------ Your Information ------------");

    }

    public String getName() {
        return name;
    }


    public CommunityHours getCommunityHours() {
        return communityHours;
    }

    public void setName(String name) {
        this.name = name;
    }

}
