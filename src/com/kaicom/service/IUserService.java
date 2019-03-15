package com.kaicom.service;

import com.kaicom.exception.SelfException;

public interface IUserService {
	public String login(String userName , String password);
	
	public String testTran() throws SelfException;
}
