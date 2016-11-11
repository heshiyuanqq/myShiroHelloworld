package com.shiro.service.impl;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.util.Base64Decoder;
import com.shiro.dao.UserMapper;
import com.shiro.pojo.User;
import com.shiro.service.UserService;
import com.shiro.utils.Md5Util;
import com.thoughtworks.xstream.core.util.Base64Encoder;
@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User getUserByUsernamePassword(String username, String password) throws NoSuchAlgorithmException {
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("username", username);
			params.put("password", Md5Util.toMD5(password));
			return userMapper.getUserByUsernamePassword(params);
	}
		
}
