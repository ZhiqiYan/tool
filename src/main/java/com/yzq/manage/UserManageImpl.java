package com.yzq.manage;

import com.yzq.mapper.UserMapper;
import com.yzq.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: yanzhiqi
 * @create: 2018-07-31 12:36
 **/
@Service("userManage")
public class UserManageImpl implements UserManage{

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUser(long userId) {
        return userMapper.selectUser(userId);
    }
}
