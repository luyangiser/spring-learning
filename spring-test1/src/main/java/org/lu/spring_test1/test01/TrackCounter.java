package org.lu.spring_test1.test01;

import java.util.HashMap;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {
	private HashMap<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	@Pointcut("execution(* org.lu.spring_test1.test01.BlankDisc.playTrack(int)) && args(trackNumber)")
	public void playTrack(int trackNumber){}
	
	@Before("playTrack(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount + 1);
	}
	
	@AfterReturning("playTrack(trackNumber)")
	public void showCount(int trackNumber){
		System.out.println(getPlayCount(trackNumber));
	}

	private int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}
}
