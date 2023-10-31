package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: VIPEmail.java
 * Description: VIPEmail implements Email and give the createEmailTemplate subject and body.
 */
public class VIPEmail implements Email{
    @Override
    public String getSubject() {
        return "VIP Exclusive Offers";
    }

    @Override
    public String getBody() {
        return "Dear VIP Customer,\n\nWe've curated some exclusive offers just for you!";
    }
}