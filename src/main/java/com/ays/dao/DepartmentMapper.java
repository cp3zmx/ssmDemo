package com.ays.dao;

import com.ays.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    List<Department> selectDepartmentByCon(Department department);
}