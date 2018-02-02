package org.lu.spring_test1.test01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	
	public BlankDisc(String title, String artist){
		this.artist = artist;
		this.title = title;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	public void playTrack(int trackNumber) {
		System.out.println("I am playing track " + trackNumber);
	}

}
