package org.lu.aop.test01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
	@DeclareParents(value="org.lu.aop.test01.Performance+",
			defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
