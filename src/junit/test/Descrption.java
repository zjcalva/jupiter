package junit.test;

import java.sql.Date;

public class Descrption {

	@NormalAttr(name="建校时间")
	protected Date foundingTime;

	@NormalAttr(name="简介")
	protected String summary;
	
	@NormalAttr(name="级别",enumValue={"985","211","教育部直属","省属"})
	protected Enum<?> level;
	
}
