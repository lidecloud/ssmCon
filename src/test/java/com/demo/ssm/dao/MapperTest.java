package com.demo.ssm.dao;

import com.demo.ssm.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testCRUD() {
        employeeMapper.insert(new Employee(null, "张三", "m", "123@qq.com", 1));
        System.out.println("success");
        System.out.println("success2");
    }
}
