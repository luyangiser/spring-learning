package org.lu.spring_test1.test02;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Test02Config.class)
public class Test02Test {

	@Autowired
	private CompactDisc compactDisc;
	
	@Test
	public void test(){
		assertNotNull(compactDisc);
	}
}
