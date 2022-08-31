package com.election;

public class Voter {
    private String name;
    private int age;
    final static int VOTER_ELIGIBLE_AGE = 18;

    Voter(){
        name = null;
        age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAgeCriteria(){
        if(getAge() >= VOTER_ELIGIBLE_AGE){
            return getName() + " Is eligible to Vote";
        } else if (getAge() < VOTER_ELIGIBLE_AGE && getAge() > 0) {
            return getName() + " Is not eligible to Vote";
        } else if (getAge() < 1) {
            return "Age can't be negative or zero";
        }
        return null;
    }
}
