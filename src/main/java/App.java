/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = Integer.parseInt(input.nextLine());

        System.out.println((age > 15) ? "You are legally old enough to drive." : "You are not legally old enough to drive.");
    }
}