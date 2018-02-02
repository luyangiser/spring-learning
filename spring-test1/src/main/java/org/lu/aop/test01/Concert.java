package org.lu.aop.test01;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance {

	public void perform() {
		System.out.println("I am perforing");
	}

}
