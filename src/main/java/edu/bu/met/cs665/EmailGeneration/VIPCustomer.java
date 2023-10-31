package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: VIPCustomer.java
 * Description: VIPCustomer extends Customer and override createEmailTemplate function
 */
public class VIPCustomer extends Customer {
    public VIPCustomer(String id, String name, String email) {
        super(id, name, email);
    }
    @Override
    protected Email createEmailTemplate() {
        return new VIPEmail();
    }

}