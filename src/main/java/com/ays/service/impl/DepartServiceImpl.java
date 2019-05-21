package com.ays.service.impl;

import com.ays.dao.DepartmentMapper;
import com.ays.model.Department;
import com.ays.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: cp3_Ays
 * @Description:  部门信息逻辑事物处理层
 * @Create Date: 2019/4/15 16:19
 * @Modified By：
 * @Copyright: 2019/4/15 company:jrs.
 */
@Service
public class DepartServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public int addDepartment(Department department) {
        return departmentMapper.insertSelective(department);
    }

    @Override
    public List<Department> getDepartmentListByCon(Department department) {
        return departmentMapper.selectDepartmentByCon(department);
    }

    @Override
    public Department getDepartmentByDeptNo(Integer id) {
        return null;
    }

    @Override
    public int updateDepartmentByDeptNo(Integer id) {
        return 0;
    }
}
