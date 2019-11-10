package com.company.manager;

public class CommunityHours{
    private int hours;
    final private int GRADUATION_HOURS_AMOUNT = 100;

    public CommunityHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean meetsGraduationRequirement() {
        if(hours >= GRADUATION_HOURS_AMOUNT) {
            return true;
        }
        return false;
    }

    public int getGraduationHoursAmount() {
        return this.GRADUATION_HOURS_AMOUNT;
    }
}
