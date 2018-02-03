package org.lu.spring_test1.test01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.lu.spring_test1.scanConfig.ScanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @RunWith 在测试开始的时候自动生成Spring的应用上下文
 * @ContextConfiguration 中的classes属性为CDPlayerConfig的类对象，表示要去这个
 * 		类里面加载配置，CDPlayerConfig中有@ComponentScan注解，表示spring默认
 * 		会在这个类所在包（基本包 base package）及其子包中扫描，寻找有@Component注解的类，找到之后，spring
 * 		会默认为其创建一个bean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CompactDisc compactDisc;
	
	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(compactDisc);
		assertNotNull(mediaPlayer);
	}
	
	@Test
	public void play(){
		mediaPlayer.play();
		//assertEquals("I sing beijingtiananmen\n", log.getLog());
	}
	
	@Test
	public void playTrack(){
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(2);
		compactDisc.playTrack(1);
		compactDisc.playTrack(2);
		compactDisc.playTrack(2);
	}
}
