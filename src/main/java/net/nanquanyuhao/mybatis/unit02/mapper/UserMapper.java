package net.nanquanyuhao.mybatis.unit02.mapper;

import net.nanquanyuhao.mybatis.unit02.po.User;

public interface UserMapper {

	User findUserById(int id);
}
