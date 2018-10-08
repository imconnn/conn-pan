package net.conn.potal.service;


import net.conn.common.exception.CustomException;

/**
 * @Author Conn
 * @Date 2018/9/27
 */
public interface LoginService {
    boolean login(String account, String password) throws CustomException;
}
