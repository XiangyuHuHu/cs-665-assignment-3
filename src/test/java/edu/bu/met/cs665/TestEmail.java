package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailGeneration.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEmail {
    public TestEmail() {
    }
    @Test
    public void testGetEmail() {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        assertEquals("business@company.com", businessCustomer.getEmail());
    }
    @Test
    public void testGetName() {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        assertEquals("ABC Corp", businessCustomer.getName());
    }

    @Test
    public void testGetId() {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        assertEquals("1", businessCustomer.getId());
    }

    @Test
    public void testGetEmailTemplate() {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        Email emailTemplate = ((BusinessCustomer) businessCustomer).createEmailTemplate();
        assertNotNull(emailTemplate);
        assertEquals("Exclusive Business Offers", emailTemplate.getSubject());
        assertEquals("Dear Business Customer,\n\nWe have special offers just for you!", emailTemplate.getBody());
    }
    @Test
    public void testBusinessCustomerCreation() {
        Customer businessCustomer = new BusinessCustomer("1", "ABC Corp", "business@company.com");
        assertNotNull(businessCustomer);
        assertEquals("1", businessCustomer.getId());
        assertEquals("ABC Corp", businessCustomer.getName());
        assertEquals("business@company.com", businessCustomer.getEmail());
    }

    @Test
    public void testReturningCustomerCreation() {
        Customer returningCustomer = new ReturningCustomer("2", "Alice Returner", "alice.ret@web.com");
        assertNotNull(returningCustomer);
        assertEquals("2", returningCustomer.getId());
        assertEquals("Alice Returner", returningCustomer.getName());
        assertEquals("alice.ret@web.com", returningCustomer.getEmail());
    }

    @Test
    public void testFrequentCustomerCreation() {
        Customer frequentCustomer = new FrequentCustomer("3", "Bob Frequent", "bob.freq@web.com");
        assertNotNull(frequentCustomer);
        assertEquals("3", frequentCustomer.getId());
        assertEquals("Bob Frequent", frequentCustomer.getName());
        assertEquals("bob.freq@web.com", frequentCustomer.getEmail());
    }

    @Test
    public void testNewCustomerCreation() {
        Customer newCustomer = new NewCustomer("4", "Eve Newbie", "eve.new@site.com");
        assertNotNull(newCustomer);
        assertEquals("4", newCustomer.getId());
        assertEquals("Eve Newbie", newCustomer.getName());
        assertEquals("eve.new@site.com", newCustomer.getEmail());
    }

    @Test
    public void testVIPCustomerCreation() {
        Customer vipCustomer = new VIPCustomer("5", "John VIP", "john.vip@domain.com");
        assertNotNull(vipCustomer);
        assertEquals("5", vipCustomer.getId());
        assertEquals("John VIP", vipCustomer.getName());
        assertEquals("john.vip@domain.com", vipCustomer.getEmail());
    }

}
