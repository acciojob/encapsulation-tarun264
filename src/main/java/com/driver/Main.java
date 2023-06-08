package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw= new RWOnly();

        rw.setName("Tarun");
        // the name is private
        String myName=rw.getName();
        System.out.print(myName);
    }
}