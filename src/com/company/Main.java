package com.company;

import com.company.manager.CommunityHours;
import com.company.manager.Person;

public class Main {

    public static void main(String[] args) {
        CommunityHours firstCommunityHours = new CommunityHours(100);
        Person person = new Person(firstCommunityHours);
        person.getCommunityHours().setHours(100);
        printUserInformation(person, firstCommunityHours);
        hasMetRequirements(person);

        System.out.println("");
        System.out.println("");

        CommunityHours secondCommunityHours = new CommunityHours(80);
        Person secondPerson = new Person("IntelliJ", 99, "Unidentified", "@gmail.com", "(123)-456-7891", secondCommunityHours);
        printUserInformation(secondPerson, secondCommunityHours);
        hasMetRequirements(secondPerson);


    }

    public static void printUserInformation(Person person, CommunityHours communityHours) {
        System.out.println(person.getName() + " currently has " + communityHours.getHours() + " hours.");
    }

    public static void hasMetRequirements(Person person) {
        if(person.getCommunityHours().meetsGraduationRequirement()) {
            System.out.println("Congratulations! " + person.getName() + " has met the graduation requirement!");
            System.out.println(person.getName() + " currently has " + person.getCommunityHours().getHours() + " out of " + person.getCommunityHours().getGraduationHoursAmount() + ".");
        } else {
            System.out.println(person.getName() + " has not met the graduation requirement yet!");
            System.out.println(person.getName() + " still has " +
                    (person.getCommunityHours().getGraduationHoursAmount() - person.getCommunityHours().getHours()) +
                    " hours out of " +
                    person.getCommunityHours().getGraduationHoursAmount() +
                    " to achieve.");
        }
    }
}
