package com.javaee.dao;

import com.javaee.domain.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CustomerDao {
    @Select("select * from customer")
    public List<Customer> getAll();

    @Update("insert into customer values (null,#{name},#{address},#{phone},#{email},curdate(),0,0)")
    public Integer save(Customer customer);

    @Select("select * from customer where id=#{id}")
    Customer getById(Integer id);

    @Update("update customer set name=#{name},address=#{address},phone=#{phone},email=#{email},date=#{date},consumption=#{consumption},level=#{level} where id=#{id}")
    Integer update(Customer customer);

    @Delete("delete from customer where id=#{id}")
    Integer delete(Integer id);

    @Select("select * from customer where name like CONCAT('%',#{name},'%') ")
    List<Customer> getAllByName(String name);
}
