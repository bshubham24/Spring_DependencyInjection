package com.example.demo;

import com.example.demo.component.EmployeeBean;
import com.example.demo.component.demoBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {
    public static final Logger logger = LoggerFactory.getLogger(SpringDemoApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Demo");
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		// logger.debug("\n*** Example using @Autowire annotation on property ***");
		// logger.debug("Checking context: {}",context.getBean(demoBean.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework");
		employeeBean.showEmployeeDetails();
	}

}
