package com.javaee.service.impl;

import com.javaee.dao.CustomerDao;
import com.javaee.domain.Customer;
import com.javaee.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public List<Customer> getAll() {

        return customerDao.getAll();
    }

    @Override
    public boolean save(Customer customer) {
        return customerDao.save(customer) > 0;
    }

    @Override
    public Customer getById(Integer id) {
        return customerDao.getById(id);
    }

    @Override
    public boolean update(Customer customer) {
        return customerDao.update(customer) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return customerDao.delete(id) > 0;
    }

    @Override
    public List<Customer> getAllByName(String name) {
        return customerDao.getAllByName(name);
    }
}
