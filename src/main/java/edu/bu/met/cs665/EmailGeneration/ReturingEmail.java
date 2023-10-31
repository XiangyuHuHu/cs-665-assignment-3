package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: ReturingEmail.java
 * Description: ReturingEmail implements Email and give the createEmailTemplate subject and body.
 */
public class ReturingEmail implements Email{
    @Override
    public String getSubject() {
        return "Welcome Back!";
    }

    @Override
    public String getBody() {
        return "Dear Returning Customer,\n\nCheck out our latest products.";
    }
}