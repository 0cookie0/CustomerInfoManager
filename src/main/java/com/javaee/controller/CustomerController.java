package com.javaee.controller;

import com.javaee.domain.Customer;
import com.javaee.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public Result getAll() {
        System.out.println("进入getAll");
        List<Customer> all = customerService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code,all,msg);
    }
    @GetMapping("/getAllByName")
    public Result getAll(@RequestParam String name) {
        System.out.println("getAll(@PathVariable String name) name="+name);
        List<Customer> all = customerService.getAllByName(name);
        System.out.println(all);
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code,all,msg);
    }
    @PostMapping
    public Result save(@RequestBody Customer customer) {
        System.out.println("进入save");
        System.out.println(customer);
        boolean flag = customerService.save(customer);
//        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @PutMapping
    public Result update(@RequestBody Customer customer) {
        System.out.println("进入put");
        System.out.println(customer);
        boolean flag = customerService.update(customer);
//        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Customer customer = customerService.getById(id);
        Integer code =  customer != null ? Code.GET_OK : Code.GET_ERR;
        String msg = customer != null ? "" : "数据查询失败，请重试！";
        return new Result(code,customer,msg);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        System.out.println(this.toString() +"delete(@PathVariable Integer id)" );
        boolean flag = customerService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @PostMapping("/deleteGroup")
    public Result delete(@RequestBody List<Customer> customers) {
        System.out.println(this.toString()+"delete(@RequestBody List<Customer> customer) ");
        System.out.println("List<Customer>="+customers);
//        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
        for (Customer customer : customers) {
            if(!customerService.delete(customer.getId())){
                return new Result(Code.DELETE_ERR,false);
            }
        }
        return new Result(Code.DELETE_OK,true);
    }
}
