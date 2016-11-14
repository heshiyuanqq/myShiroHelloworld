package com.shiro.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shiro.pojo.User;
import com.shiro.utils.IbatisMapper;



@IbatisMapper
public interface UserMapper {

	User getUserByUsernamePassword(HashMap<String, Object> params);

	List<User> getListByConditions(HashMap<String, Object> params);

	User getByUsername(String username);

	List<String> getRolenameListByUsername(String username);



}
