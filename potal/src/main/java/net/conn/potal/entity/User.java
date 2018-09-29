package net.conn.potal.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: user
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * Column:    id
     */
    private Integer id;

    /**
     * 用户名
     *
     * Column:    name
     */
    private String name;

    /**
     * 密码
     *
     * Column:    password
     */
    private String password;

    /**
     * 手机号码
     *
     * Column:    phone
     */
    private String phone;

    /**
     * 创建时间
     *
     * Column:    createtime
     */
    private Date createtime;
}