package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: FrequentCustomer.java
 * Description: FrequentCustomer extends Customer and override createEmailTemplate function
 */
public class FrequentCustomer extends Customer {
    public FrequentCustomer(String id, String name, String email) {
        super(id, name, email);
    }
    @Override
    protected Email createEmailTemplate() {
        return new FrequentEmail();
    }

}