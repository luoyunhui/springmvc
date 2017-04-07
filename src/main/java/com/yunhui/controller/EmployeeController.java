package com.yunhui.controller;

import com.yunhui.model.EmployeeVO;
import com.yunhui.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by luoyunhui on 17/4/6.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @RequestMapping("/display")
    public String toIndex(HttpServletRequest request, Model model) {

        List<EmployeeVO> list = employeeManager.getAllEmployees();
        model.addAttribute("list", list);
        return "employeesListDisplay";
    }
}
