package com.javaee.service;


import com.javaee.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// TODO @Transactional注解在代码执行出错的时候能够进行事务的回滚。
@Transactional
public interface CustomerService {
    /**
     * 查询全部
     * @return
     */
    public List<Customer> getAll();

    /**
     * 保存
     * @param customer
     * @return
     */
    public boolean save(Customer customer);

    /**
     * 根据id查询Customer对象
     * @param id
     * @return
     */
    public Customer getById(Integer id);

    /**
     * 根据id更新customer对象
     * @param customer
     * @return 成功与否
     */
    boolean update(Customer customer);

    /**
     * 根据id删除customer对象
     * @param id
     * @return 成功与否
     */
    boolean delete(Integer id);

    /**
     * 根据用户名模糊查找
     * @return 返回查到所有对象
     */
    List<Customer> getAllByName(String name);
}
