package com.hs1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBeforeAdvice implements MethodBeforeAdvice {
	@Autowired
	LogService ls = null;

	@Autowired
	SecruityService ss = null;

	@Autowired
	TxService ts = null;

	public void before(Method method, Object[] args, Object target) throws Throwable {
		ss.verifyUser();
		ls.logBefore();
		ts.begin();
	}

}
