package com.shiro.utils;

import java.io.Serializable;
import java.util.UUID;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;

public class MyJavaUuidSessionIdGenerator implements SessionIdGenerator{

	@Override
	public Serializable generateId(Session session) {
		return UUID.randomUUID().toString()+"this_is_heshiyuan_zidingyide_shirojsession_id";
	}

}
