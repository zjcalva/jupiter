package junit.test.prototype;

import sklse.jupiter.annotations.NormalAttr;

public class Base {

	@NormalAttr(name="123")
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
