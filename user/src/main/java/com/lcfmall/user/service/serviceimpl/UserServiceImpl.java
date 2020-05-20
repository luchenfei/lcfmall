package com.lcfmall.user.service.serviceimpl;


import com.lcfmall.bean.UmsMember;
import com.lcfmall.bean.UmsMemberReceiveAddress;
import com.lcfmall.service.UserService;
import com.lcfmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.lcfmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luchenfei
 * @Description 想说点什么呢？
 * @Date 2020-05-19 14:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper  userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> um=null;
//        um=userMapper.selectAllUser();
        um=userMapper.selectAll();
        return um;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(String id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }


}
