package com.ays.service;

import com.ays.model.Department;

import java.util.List;

/**
 * @Author: cp3_Ays
 * @Description:
 * @Date:Create：in 2019/4/15 15:21
 * @Modified By：
 * @Copyright: 2019/4/15 company:jrs.
 */
public interface DepartmentService {
    /**
     * 功能描述:增加部门信息
     * @Author cp3_Ays
     * @Date 16:01 2019/4/15
     * @Param [department]
     * @return int 
    **/
    int addDepartment(Department department);
    /**
     * 功能描述: 查询部门信息集合  con:条件
     * @Author cp3_Ays
     * @Date 16:02 2019/4/15
     * @Param [department]
     * @return java.util.List<com.ays.model.Department> 
    **/
    List<Department> getDepartmentListByCon(Department department);
    /**
     * 功能描述:根据部门id查询部门信息
     * @Author cp3_Ays
     * @Date 16:05 2019/4/15
     * @Param [deptNo]
     * @return com.ays.model.Department 
    **/
    Department getDepartmentByDeptNo(Integer id);
    /**
     * 功能描述:根据部门Id更新部门信息
     * @Author cp3_Ays
     * @Date 16:06 2019/4/15
     * @Param [id]
     * @return int 
    **/
    int updateDepartmentByDeptNo(Integer id);
}
