package com.company;

import com.company.manager.CommunityHours;
import com.company.manager.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String personName;
        CommunityHours communityHours;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the community hours program! (Version 1.1)");
        System.out.println();
        System.out.println("In this program you'll be able to do the following!");
        System.out.println();
        System.out.println("- Create your profile (Name & Amount of hours)");
        System.out.println("- Check the amount of hours you have");
        System.out.println("- Check the required community hours");
        System.out.println();

        System.out.println("To get started what is your name?");
        personName = scanner.nextLine();

        System.out.println("How many community hours do you have?");
        communityHours = new CommunityHours(scanner.nextInt());

        scanner.nextLine();
        scanner.close();

        System.out.println();
        Person person = new Person(personName, communityHours);
        person.printPersonsCommunityHours(person, communityHours);
    }

}
