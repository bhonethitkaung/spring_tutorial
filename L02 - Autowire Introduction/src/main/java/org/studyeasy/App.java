package org.studyeasy;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla",Car.class);
		System.out.println(myCar.specs());
		context.close();
		
		
	}

}
