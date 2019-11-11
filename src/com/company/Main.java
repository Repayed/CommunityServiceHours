package com.company;

import com.company.manager.CommunityHours;
import com.company.manager.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String personName;
        CommunityHours communityHours;


//        CommunityHours firstCommunityHours = new CommunityHours(100);
//        Person person = new Person(firstCommunityHours);
//        person.getCommunityHours().setHours(100);
//        printUserInformation(person, firstCommunityHours);
//        hasMetRequirements(person);
//
//        System.out.println("");
//        System.out.println("");
//
//        CommunityHours secondCommunityHours = new CommunityHours(80);
//        Person secondPerson = new Person("IntelliJ", 99, "Unidentified", "@gmail.com", "(123)-456-7891", secondCommunityHours);
//        printUserInformation(secondPerson, secondCommunityHours);
//        hasMetRequirements(secondPerson);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the community hours program! (Version 1.1)");
        printWhiteSpace(1);
        System.out.println("In this program you'll be able to do the following!");
        printWhiteSpace(1);
        System.out.println("- Create your profile (Name & Amount of hours)");
        System.out.println("- Check the amount of hours you have");
        System.out.println("- Check the required community hours");
        printWhiteSpace(  1);


        System.out.println("To get started what is your name?");
        personName = scanner.nextLine();

        System.out.println("How many community hours do you have?");
        communityHours = new CommunityHours(scanner.nextInt());

        scanner.nextLine();

        printWhiteSpace(1);
        Person person = new Person(personName, communityHours);
        person.printPersonsCommunityHours(person, communityHours);


    }

//    public static void hasMetRequirements(Person person) {
//        if(person.getCommunityHours().meetsGraduationRequirement()) {
//            System.out.println("Congratulations! " + person.getName() + " has met the graduation requirement!");
//            System.out.println(person.getName() + " currently has " + person.getCommunityHours().getHours() + " out of " + person.getCommunityHours().getGraduationHoursAmount() + ".");
//        } else {
//            System.out.println(person.getName() + " has not met the graduation requirement yet!");
//            System.out.println(person.getName() + " still has " +
//                    (person.getCommunityHours().getGraduationHoursAmount() - person.getCommunityHours().getHours()) +
//                    " hours out of " +
//                    person.getCommunityHours().getGraduationHoursAmount() +
//                    " to achieve.");
//        }
//    }

    public static void printWhiteSpace(int amountOfLines) {
        for(int i = 0; i <= amountOfLines; i++) {
            System.out.println();
        }
    }
}
