package junit.test.prototype;

import java.util.List;
import java.util.Map;

import sklse.jupiter.annotations.NormalAttribute;

public class Base {

	@NormalAttribute(name="123")
	public String name;
	
	public Map<String,List<Integer>> map;
	
	public List<Integer> list;
	
	public Base bb;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, List<Integer>> getMap() {
		return map;
	}

	public void setMap(Map<String, List<Integer>> map) {
		this.map = map;
	}

	public Base getBb() {
		return bb;
	}

	public void setBb(Base bb) {
		this.bb = bb;
	}
	
	
}
