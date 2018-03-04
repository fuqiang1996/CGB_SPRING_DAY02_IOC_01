package junittest;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DataSource;
import beans.JdbcTemplate;

public class TestIoc {
	//初始化容器的方法
	private ClassPathXmlApplicationContext ctx;
	
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("ioc.xml");
	}
	
	@Test
	public void testJdbcTemplate(){
		JdbcTemplate bean = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		DataSource data = bean.getDataSource();
		System.out.println(data);
		String str = bean.getStr();
		System.out.println(str.getClass());
		Map<String, String> map = bean.getHashMap();
		System.out.println(map.getClass());
	}
	@Test
	public void testJdbcTemplate1(){
		String str = new String("aa");
		System.out.println(str.getClass());
	}
	@After
	public void destroy(){
		ctx.close();
	}
}
