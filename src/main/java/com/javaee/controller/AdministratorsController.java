package com.javaee.controller;

import com.javaee.domain.SystemT;
import com.javaee.service.SystemTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdministratorsController {
    @Autowired
    private SystemTService systemTService;

    /**
     * 登录校验
     * @return  根据用户名和密码查询管理员对象,没有则返回null
     */
    @PostMapping("/login")
    public Result userLogin(@RequestBody SystemT systemT){
        System.out.println("login收到请求");
        System.out.println(systemT);
        //调用service的login方法,返回管理员对象,如果为空则不存在
        SystemT ad =  systemTService.login(systemT);
        if(ad != null){
            return new Result(Code.GET_OK,ad,"success");
        }
        return null;
    }
    @PutMapping
    public Result update(@RequestBody SystemT systemT) {
        System.out.println("admin-put收到请求");
        System.out.println(systemT);
        boolean flag = systemTService.insert(systemT);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,null,flag?"success":"false");
    }

    @GetMapping("/searchByUsername")
    public Result searchByUsername(@RequestBody String username){
        System.out.println("进入searchByUsername username = " + username);
        SystemT systemT = new SystemT();
        systemT.setUsername(username);
        Boolean flag =  systemTService.searchByUsername(systemT) > 0;
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,null,flag?"success":"false");
    }



}
