package com.spring.auth_server.dao;

import com.spring.auth_server.model.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from tb_user where username=#{username}")
    @Results(id = "user", value = {
            @Result(property = "id",column = "id"),
            @Result(property = "roles", column = "id", many = @Many(select = "com.spring.auth_server.dao.RoleMapper.getRolesByUserId"))
    })
    User getUserByName(String username);

}
