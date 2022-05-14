package com.spring.auth_server.dao;


import com.spring.auth_server.model.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {

    @Select("select * from tb_role where id in (select role_id from tb_user_role where user_id = #{userId})")
    List<Role>getRolesByUserId(int userId);


}
