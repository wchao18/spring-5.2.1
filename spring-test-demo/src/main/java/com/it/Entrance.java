package com.it;

import com.it.service.WelcomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangchao
 * @description TODO
 * @date 2020/09/15 12:02
 */
public class Entrance {

	public static void main(String[] args) {
		System.out.println("容器开始启动");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		WelcomeService welcomeService = (WelcomeService)classPathXmlApplicationContext.getBean("welcomeService");
		welcomeService.say("哈哈");
	}
}
