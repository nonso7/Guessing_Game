package com.nonso;

public class Loops {
    static void main(String[] args) {
        String[] names = {"Chinonso", "Emmanuel", "Joshua", "Goodluck"};

        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            boolean present = true;

            if (name ==  "Goodluck") {
                present = false;

            }

            String status = present ? "Present" : "Absent";
            System.out.println(name + " - " + status);
        }
    }

}
