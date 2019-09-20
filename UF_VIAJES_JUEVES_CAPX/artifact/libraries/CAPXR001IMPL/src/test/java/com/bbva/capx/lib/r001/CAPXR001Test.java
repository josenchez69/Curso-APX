package com.bbva.capx.lib.r001;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CAPXR001-app.xml",
		"classpath:/META-INF/spring/CAPXR001-app-test.xml",
		"classpath:/META-INF/spring/CAPXR001-arc.xml",
		"classpath:/META-INF/spring/CAPXR001-arc-test.xml" })
public class CAPXR001Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CAPXR001.class);
	
	@Resource(name = "capxR001")
	private CAPXR001 capxR001;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.capxR001;
		if(this.capxR001 instanceof Advised){
			Advised advised = (Advised) this.capxR001;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		capxR001.execute("Bogota", "Cali");
	}
	
}
