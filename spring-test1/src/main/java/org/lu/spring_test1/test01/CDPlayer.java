package org.lu.spring_test1.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc compactDisc;
	
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.compactDisc = cd;
	}
	
	public void play() {
		compactDisc.play();
	}

}
