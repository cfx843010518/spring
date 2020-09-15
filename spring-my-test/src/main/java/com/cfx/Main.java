package com.cfx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Persion persion = annotationConfigApplicationContext.getBean(Persion.class);
		System.out.println(persion);

	}
}
