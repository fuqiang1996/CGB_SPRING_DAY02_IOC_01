package junittest;

import java.util.Arrays;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ComplexObject;

public class JunitTestIOC01 {
	private ClassPathXmlApplicationContext ctx;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testBeans(){
		ComplexObject bean = ctx.getBean("complexObject", ComplexObject.class);
		System.out.println(bean.getAddress());
		System.out.println(Arrays.toString(bean.getNames()));
		System.out.println(bean.getMap());
		System.out.println(bean.getProperties());
	}
	
	@After
	public void destroy(){
		
	}
}
