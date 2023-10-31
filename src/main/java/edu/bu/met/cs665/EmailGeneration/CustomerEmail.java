package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: CustomerEmail.java
 * Description: some ideal but not using the factory pattern
 */
import java.util.ArrayList;

public class CustomerEmail implements Email{
    private String subject;
    private String body;
    ArrayList<Customer> AllCustomer = new ArrayList<Customer>();
    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getBody() {
        return body;
    }
}