package com.champbay.blog.springboottest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootTestApplication.class)
@ActiveProfiles("test")
public class SpringbootTest {
	
	@Value("${top-attr:}")
	private String topAttr;
	
	@Value("${myname:}")
	private String myName;
	
	@Value("${prod-attr:}")
	private String prodAttr;
	
	@Value("${dev-attr:}")
	private String devAttr;
	
	@Value("${test-attr:}")
	private String testAttr;
	
	@Test
	public void testPropertyFile() {
		Assert.assertTrue("hello".equals(topAttr));
		
		Assert.assertTrue("testname".equals(myName));
		
		Assert.assertTrue(StringUtils.isEmpty(prodAttr));
		
		Assert.assertTrue(StringUtils.isEmpty(devAttr));
		
		Assert.assertTrue("test-attribute".equals(testAttr));
	}

}
