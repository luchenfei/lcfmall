package com.lcfmall.user.controller;

import com.lcfmall.bean.UmsMember;
import com.lcfmall.bean.UmsMemberReceiveAddress;
import com.lcfmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luchenfei
 * @Description 想说点什么呢？
 * @Date 2020-05-19 14:27
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/getUmsMemberReceiveAddressById")
    @ResponseBody
    public  List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById( String id){
        return userService.getUmsMemberReceiveAddressById(id);
    }
}
