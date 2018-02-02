package org.lu.spring_test1.test03;

import org.lu.spring_test1.test02.CompactDisc;

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

}
