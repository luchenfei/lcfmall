package com.lcfmall.user.mapper;


import com.lcfmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author luchenfei
 * @Description 想说点什么呢？
 * @Date 2020-05-19 15:00
 */
public interface UserMapper  extends Mapper<UmsMember>{
    List<UmsMember> selectAllUser();
}
