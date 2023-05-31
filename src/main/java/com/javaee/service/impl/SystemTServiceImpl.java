package com.javaee.service.impl;



import com.javaee.dao.SystemTDao;
import com.javaee.domain.SystemT;
import com.javaee.service.SystemTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemTServiceImpl implements SystemTService {

    @Autowired
    private SystemTDao systemTDao;


    @Override
    public SystemT login(SystemT systemT) {
        return systemTDao.login(systemT);
    }

    @Override
    public boolean insert(SystemT systemT) {
        return systemTDao.insert(systemT) > 0;
    }

    @Override
    public int searchByUsername(SystemT systemT) {

        return systemTDao.searchByUsername(systemT);
    }
}
