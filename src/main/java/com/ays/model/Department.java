package com.ays.model;
/**
 * @Author cp3_Ays
 * @Description //实体  department
 * @Date 15:44 2019/4/10
**/
public class Department {
    private Integer id;

    private String deptName;

    private String deptNo;

    private String leaderNo;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getLeaderNo() {
        return leaderNo;
    }

    public void setLeaderNo(String leaderNo) {
        this.leaderNo = leaderNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}