package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: ReturningCustomer.java
 * Description: ReturningCustomer extends Customer and override createEmailTemplate function
 */
public class ReturningCustomer extends Customer {
    public ReturningCustomer(String id, String name, String email) {
        super(id, name, email);
    }
    @Override
    protected Email createEmailTemplate() {
        return new ReturingEmail();
    }

}