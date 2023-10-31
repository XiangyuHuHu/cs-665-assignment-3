package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: NewEmail.java
 * Description: NewEmail implements Email and give the createEmailTemplate subject and body.
 */
public class NewEmail implements Email{
    @Override
    public String getSubject() {
        return "Thank You for Joining!";
    }

    @Override
    public String getBody() {
        return "Dear New Customer,\n\nWelcome aboard! We're thrilled to have you.";
    }
}