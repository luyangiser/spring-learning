package org.lu.spring_test1.test01;

import org.springframework.stereotype.Component;


/*
 * @Component("somename") -> 默认情况下，如果不给Component设置ID，
 * 							 Spring会设置一个默认的ID，即类名的首字母小写，
 * 							 这种形式即是自定义名称
 * @Named("somename") 等价于上面
 */
//@Component
public class SgtPeppers implements CompactDisc {
	private String title = "beijingtiananmen";
	private String artist = "I";
	public void play() {
		System.out.println(artist + " sing " + title);
	}
	public void playTrack(int trackNumber) {
	}

}
