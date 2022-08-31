package com.election;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter1 = new Voter();
        voter1.setName("John");
        voter1.setAge(10);
        System.out.println(voter1.getAgeCriteria());
    }
}
