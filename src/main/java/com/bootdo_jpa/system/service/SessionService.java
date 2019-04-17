package com.bootdo_jpa.system.service;

import java.util.Collection;
import java.util.List;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import com.bootdo_jpa.system.domain.UserDO;
import com.bootdo_jpa.system.domain.UserOnline;

@Service
public interface SessionService {
	
	List<UserOnline> list();

	List<UserDO> listOnlineUser();

	Collection<Session> sessionList();
	
	boolean forceLogout(String sessionId);
}
