package com.ays.controller;

import com.alibaba.fastjson.JSONObject;
import com.ays.model.Department;
import com.ays.model.Rank;
import com.ays.model.User;
import com.ays.service.DepartmentService;
import com.ays.service.RankService;
import com.ays.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import java.util.List;
/**
 * 功能描述:
 * @Author cp3_Ays
 * @Date 15:11 2019/4/15
**/
@Controller
@RequestMapping("/user")
@Api(value = "用户信息", description = "用户信息", produces = MediaType.APPLICATION_JSON)
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private RankService rankService;
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/addUi.htm")
    public String addUi(HttpServletRequest request,Model model){
        List<Rank> ranks = rankService.getAllRank();
        Department department = new Department();
        List<Department> depts = departmentService.getDepartmentListByCon(department);
        model.addAttribute("ranks",ranks);
        model.addAttribute("depts",depts);
        return "user/add";
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject add(HttpServletRequest request, User user) {
        JSONObject json = new JSONObject();
        if(userService.addUser(user) > 0){
            json.put("msg","添加成功");
        }else{
            json.put("msg","添加失败,请稍后添加!");
        }
        return json;
    }

}