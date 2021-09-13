package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the password? ");
        String passwordInputted = sc.nextLine();
        if(passwordInputted .equals("abc$123")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
