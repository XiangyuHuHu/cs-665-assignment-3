package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: NewCustomer.java
 * Description: NewCustomer extends Customer and override createEmailTemplate function
 */
public class NewCustomer extends Customer {
    public NewCustomer(String id, String name, String email) {
        super(id, name, email);
    }
    @Override
    protected Email createEmailTemplate() {
        return new NewEmail();
    }

}