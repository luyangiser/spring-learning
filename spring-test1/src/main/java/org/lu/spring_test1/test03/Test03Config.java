package org.lu.spring_test1.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/org/lu/spring_test1/test03/cd.properties")
public class Test03Config {
	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc dis(){
		String title = null;
		String artist = null;
		if(env.containsProperty("disc.title")){
			title = env.getProperty("disc.title");
		}
		if(env.containsProperty("disc.artist")){
			artist = env.getProperty("disc.artist");
		}	
		return new BlankDisc(title, artist);
	}
	
}
