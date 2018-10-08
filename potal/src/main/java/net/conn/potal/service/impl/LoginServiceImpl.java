package net.conn.potal.service.impl;

import net.conn.common.exception.CustomException;
import net.conn.potal.mapper.UserMapper;
import net.conn.potal.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Conn
 * @Date 2018/9/27
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean login(String acconut, String password) throws CustomException {
        boolean flag = false;
        String passwordByAccount = userMapper.selectPasswordByAccount(acconut);
        if (password.equals(passwordByAccount)) {
            flag = true;
        }
        return flag;
    }
}
