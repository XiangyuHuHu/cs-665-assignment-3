package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: BusinessCustomer.java
 * Description: BusinessCustomer extends Customer and override createEmailTemplate function
 */
public class BusinessCustomer extends Customer {
    public BusinessCustomer(String id, String name, String email) {
        super(id, name, email);
    }
    @Override
    public Email createEmailTemplate() {
        return new BusinessEmail();
    }

}