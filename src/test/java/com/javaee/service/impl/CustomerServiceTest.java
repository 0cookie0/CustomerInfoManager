package com.javaee.service.impl;

import com.javaee.domain.Customer;
import com.javaee.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void testGetAll(){
        List<Customer> all = customerService.getAll();
        System.out.println(all);
    }
}
