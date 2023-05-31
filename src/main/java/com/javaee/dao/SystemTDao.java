package com.javaee.dao;

import com.javaee.domain.SystemT;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SystemTDao {

    @Select("select * from systemt where username=#{username} and password=#{password}")
    SystemT login(SystemT systemT);


    @Insert("insert into systemt values (null,#{username},#{password})")
    Integer insert(SystemT systemT);

    @Select("select * from systemt where username=#{username}")
    int searchByUsername(SystemT systemT);
}
