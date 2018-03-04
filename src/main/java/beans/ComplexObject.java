package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ComplexObject {
	//邮寄地址
	private List<String> address;
	private Map<String,Object> map;
	private Properties properties;
	private String[] names;
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}
	
	
	
}
