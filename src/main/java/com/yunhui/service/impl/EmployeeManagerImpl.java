package com.yunhui.service.impl;

import com.yunhui.dao.EmployeeDao;
import com.yunhui.model.EmployeeVO;
import com.yunhui.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luoyunhui on 17/4/6.
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager {
    @Autowired
    private EmployeeDao employeeDao;

    public List<EmployeeVO> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}
