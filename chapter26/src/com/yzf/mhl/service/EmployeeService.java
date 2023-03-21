package com.yzf.mhl.service;

import com.yzf.mhl.dao.EmployeeDAO;
import com.yzf.mhl.domain.Employee;

/**
 * 业务层 该类完成对Employee表的各种操作(调用EmployeeDAO对象完成)
 */
public class EmployeeService {

    //定义一个EmployeeDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    // 方法 根据empID 和 pwd 返回一个Employee 对象
    public Employee getEmployeeByIdAbdPwd(String empId, String pwd){
        return employeeDAO.querySingle("select * from employee where empId= ? and pwd=md5(?)",
                Employee.class, empId, pwd);
    }
}
