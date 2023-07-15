package org.zgy.octopus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zgy.octopus.entity.Employee;
import org.zgy.octopus.mapper.EmployeeMapper;
import org.zgy.octopus.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
