package com.yunhui.dao;

import com.yunhui.model.EmployeeVO;

import java.util.List;

/**
 * Created by luoyunhui on 17/4/6.
 */
public interface EmployeeDao {
    List<EmployeeVO> getAllEmployees();
}
