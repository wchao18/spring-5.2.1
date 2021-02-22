package com.it;

import com.it.entity.factory.UserFactoryBean;
import com.it.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangchao
 * @description TODO
 * @date 2020/09/15 12:02
 */
@Configuration
@ComponentScan(basePackages = "com.it")
public class Entrance {

	private static ApplicationContext config = new ClassPathXmlApplicationContext("spring-config.xml");

	//config = new AnnotationConfigApplicationContext(Entrance.class);

	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		WelcomeService welcomeService = (WelcomeService)classPathXmlApplicationContext.getBean("welcomeService");
		welcomeService.say("spring");*/
		//testAnnotationConfig();
		getFactoryBean();
	}

	private static void testAnnotationConfig() {


		String[] beanDefinitionNames = config.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

	private static void getFactoryBean() {
		//获取的是user对象
		Object userFactoryBean = config.getBean("userFactoryBean");
		System.out.println(userFactoryBean);

		Object userFactoryBean1 = config.getBean("&userFactoryBean");
		System.out.println(userFactoryBean1);
	}


	private static void getBeanFactory() {

	}
}
