package junit.test;

import java.sql.Date;

public class Descrption {

	@NormalAttr(name="��Уʱ��")
	protected Date foundingTime;

	@NormalAttr(name="���")
	protected String summary;
	
	@NormalAttr(name="����",enumValue={"985","211","������ֱ��","ʡ��"})
	protected Enum<?> level;
	
}
