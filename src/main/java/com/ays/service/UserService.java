package com.ays.service;


import com.ays.model.User;
/**
 * @Author cp3_Ays
 * @Description //user 逻辑事物处理层
 * @Date 18:33 2019/4/10
**/
public interface UserService {
    /**
     * 功能描述:增加员工
     * @Author cp3_Ays
     * @Date 18:39 2019/4/10
     * @Param [user]
     * @return int 
    **/
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(String jobNo);
}