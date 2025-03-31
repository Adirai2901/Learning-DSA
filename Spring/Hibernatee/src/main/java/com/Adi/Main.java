package com.Adi;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Student sd = new Student();

        sd.setRoll(1);
        sd.setMarks(100);
        sd.setName("Aditya");

        sd.setRoll(2);
        sd.setMarks(200);
        sd.setName("Ram");

        sd.setRoll(3);
        sd.setMarks(300);
        sd.setName("Sham");

        sd.setRoll(4);
        sd.setMarks(400);
        sd.setName("Sam");

        Session s = null;


        System.out.println(sd);
    }
}