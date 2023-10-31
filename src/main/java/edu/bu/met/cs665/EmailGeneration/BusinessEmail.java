package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: BusinessEmail.java
 * Description: BusinessCustomer implements Email and give the createEmailTemplate subject and body.
 */
public class BusinessEmail implements Email {
    @Override
    public String getSubject() {
        return "Exclusive Business Offers";
    }

    @Override
    public String getBody() {
        return "Dear Business Customer,\n\nWe have special offers just for you!";
    }
}
