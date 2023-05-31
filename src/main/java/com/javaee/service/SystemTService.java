package com.javaee.service;

import com.javaee.domain.SystemT;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SystemTService {

    /**
     * 根据用户名和密码查询管理员对象,没有则返回null
     * @param systemT
     * @return
     */
    SystemT login(SystemT systemT);

    /**
     * 根据systemT插入systemT表,返回成功与否(影响行数大于0)
     * @param systemT
     * @return
     */

    boolean insert(SystemT systemT);

    /**
     * 根据用户名查询,返回查询的条数
     * @param systemT
     * @return
     */
    int searchByUsername(SystemT systemT);
}
