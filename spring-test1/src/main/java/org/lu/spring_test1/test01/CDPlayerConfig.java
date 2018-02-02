package org.lu.spring_test1.test01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class CDPlayerConfig {
	@Bean
	public BlankDisc blankDisc(){
		return new BlankDisc("dddd", "dfsaada");
	}
	
/*	@Bean
	public SgtPeppers sgtPeppers(){
		return new SgtPeppers();
	}*/
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
}
