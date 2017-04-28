package com.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by Elivs on 2017/4/25.
 */
@Data
public class UserBean {

    @NotEmpty(message = "用户名不能为空")
    @Length(max = 18, min = 6, message = "账户必须在6-18位之间")
    private String username;

    @NotEmpty(message = "密码不能为空")
    private String password;
}
