package com.it.service;

import org.springframework.stereotype.Service;

/**
 * @author wangchao
 * @description TODO
 * @date 2020/09/15 11:59
 */
//@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String say(String name) {
		System.out.println("welcome:" + name);
		return name;
	}
}
