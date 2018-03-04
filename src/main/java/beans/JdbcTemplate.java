package beans;

import java.util.HashMap;


public class JdbcTemplate {
	//JdbcTemplate 依赖datasource
	private DataSource dataSource;
	private String str;
	private HashMap<String,String> map;
	public void setHashMap(HashMap<String, String> HashMap) {
		this.map = HashMap;
		System.out.println("setmap");
	}
	public HashMap<String, String> getHashMap() {
		return map;
	}
	//set注入
	public void setDataSource(DataSource dataSource) {
		System.out.println("setDataSource");
		this.dataSource = dataSource;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setStr(String str) {
		this.str = str;
		System.out.println("setStr");
	}
	public String getStr() {
		return str;
	}
	
	public JdbcTemplate() {
		super();
	}
	
	
}
