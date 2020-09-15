package com.it.service;

/**
 * @author wangchao
 * @description TODO
 * @date 2020/09/15 11:59
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String say(String name) {
		System.out.println("欢迎你:" + name);
		return name;
	}
}
