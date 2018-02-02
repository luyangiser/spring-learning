package org.lu.spring_test1.scanConfig;

import org.lu.spring_test1.test01.CDPlayer;
import org.lu.spring_test1.test01.CompactDisc;
import org.lu.spring_test1.test01.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//第一种配置组件扫描和显式配置的方式，有两个注解，会自动去扫描配置中的包
/*@Configuration
@ComponentScan(basePackages = {"org.lu.spring_test1.test01"})
public class ScanConfig {

}*/

//第二种配置组件扫描和显式配置的方式，用Bean注解
@Configuration
public class ScanConfig {
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
	}
	
	//该方法等价于上面两个函数的效果
	/*@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}*/
}