package net.nanquanyuhao.mybatis.unit01.dao;

import net.nanquanyuhao.mybatis.unit01.po.User;

public interface UserDao {

	User findUserById(int id);
}
