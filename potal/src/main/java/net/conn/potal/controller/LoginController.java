package net.conn.potal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.conn.common.exception.CustomException;
import net.conn.common.method.ResultInfo;
import net.conn.potal.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Conn
 * @Date 2018/9/27
 */
@Api(value = "首页相关操作", tags = {"Potal"})
@RestController
@RequestMapping("/potal")
public class LoginController {
    @Resource
    private LoginService loginService;

    @ApiOperation(value = "登陆", httpMethod = "POST", response = ResultInfo.class)
    @PostMapping("/login")
    public ResultInfo login(String account, String password) {
        try {
            boolean flag = loginService.login(account, password);
            return ResultInfo.success().build(flag);
        } catch (CustomException e) {
            e.printStackTrace();
            return ResultInfo.failure(e.getMessage());
        }
    }
}
