package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Customer.java
 * Description: abstract class Customer, top customer class.
 */
public abstract class Customer {
    protected String id;
    protected String name;
    protected String email;
    protected abstract Email createEmailTemplate();

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }


}