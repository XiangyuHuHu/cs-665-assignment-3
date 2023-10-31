package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: FrequentEmail.java
 * Description: FrequentEmail implements Email and give the createEmailTemplate subject and body.
 */
public class FrequentEmail implements Email {
    @Override
    public String getSubject() {
        return "Loyalty Rewards";
    }

    @Override
    public String getBody() {
        return "Dear Frequent Customer,\n\nEarn double points this week!";
    }
}

