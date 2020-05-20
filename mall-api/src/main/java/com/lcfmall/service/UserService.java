package com.lcfmall.service;




import com.lcfmall.bean.UmsMember;
import com.lcfmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author luchenfei
 * @Description 想说点什么呢？
 * @Date 2020-05-19 14:47
 */

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(String id);
}
