package com.spring.demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.MovieRecommender;
import com.spring.config.AppConfig;

public class App {
	private static final Class<?> clazz = AppConfig.class;

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				new AnnotationConfigApplicationContext(clazz);
		System.out.println("================context================");
		printBeans(context);

		MovieRecommender recommender = context.getBean("movieRecommender", MovieRecommender.class);
		recommender.recommend();

		context.close();
	}

	private static void printBeans(ApplicationContext context) {
		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}
		System.out.println("================\\\\\\\\\\\\\\================");
	}
}
