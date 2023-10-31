package edu.bu.met.cs665.EmailGeneration;
/**
 * Name: Xiangyu Hu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Main.java
 * Description: some simple test
 */
public class Main {
   /* public static void main(String[] args) {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        Customer vipCustomer = new VIPCustomer("2", "John VIP", "john.vip@domain.com");
        Customer returningCustomer = new ReturningCustomer("3", "Alice Returner", "alice.ret@web.com");
        Customer frequentCustomer = new FrequentCustomer("4", "Bob Frequent", "bob.freq@web.com");
        Customer newCustomer = new NewCustomer("5", "Eve Newbie", "eve.new@site.com");
        printEmailForCustomer(businessCustomer);
        printEmailForCustomer(vipCustomer);
        printEmailForCustomer(returningCustomer);
        printEmailForCustomer(frequentCustomer);
        printEmailForCustomer(newCustomer);
    }

    public static void printEmailForCustomer(Customer customer) {
        Email emailTemplate = customer.getEmailTemplate();

        System.out.println("==========================================");
        System.out.println("Email to: " + customer.getEmail());
        System.out.println("Subject: " + emailTemplate.getSubject());
        System.out.println("------------------------------------------");
        System.out.println(emailTemplate.getBody());
        System.out.println("==========================================\n");
    }*/

       public static void main(String[] args) {
           Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
           Email businessEmail = businessCustomer.createEmailTemplate();
           System.out.println(businessEmail.getSubject() + "\n" + businessEmail.getBody() + businessCustomer.getName());

           Customer vipCustomer = new VIPCustomer("2", "John VIP", "john.vip@domain.com");
           Email vipEmail = vipCustomer.createEmailTemplate();
           System.out.println(vipEmail.getSubject() + "\n" + vipEmail.getBody()+vipCustomer.getName());
       }

}