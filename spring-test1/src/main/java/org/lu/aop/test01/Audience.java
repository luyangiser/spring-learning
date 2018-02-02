package org.lu.aop.test01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 用AspectJ的注解定义了一个切面，定义了观众的行为，穿插在表演进行之中
 * @author lu_gi
 *
 */
//将该类定义为一个切面
@Aspect
public class Audience {
	@Pointcut("execution(** org.lu.aop.test01.Performance.perform(..))")
	public void performance(){}
	
	/*
	 * 该注解表示在满足("execution(** org.lu.aop.test01.Performance.perform(..))")<--这一条件时，这一条件即为切点
	 * 执行该方法(silenceCellPhones)
	 * 其他的注解还有@AfterReturning,@AfterThrowing,@Around,@Before
	 *----------------------------------
	 * 上述条件解释：execution表示在执行(** org.lu.aop.test01.Performance.perform(..))这个方法时
	 * **表示任意返回值，org.lu.aop.test01.Performance.perform表示某一包下的某个方法
	 * (..)表示参数为任意参数时
	 * ---------------------------------
	 */
//	@Before("execution(** org.lu.aop.test01.Performance.perform(..))")
	//在已经定义了切点(@PointCut)的情况下，可使用已定义切点表达式为参数
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(** org.lu.aop.test01.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	@AfterReturning("execution(** org.lu.aop.test01.Performance.perform(..))")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("execution(** org.lu.aop.test01.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("ok! Silencing cell phones");
			System.out.println("ok! Taking seats");
			joinPoint.proceed();
			System.out.println("ok! CLAP CLAP CLAP!!!");
			joinPoint.proceed();
			System.out.println("ok!ok! CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("ok! Demanding a refund");
		}
	}
}
