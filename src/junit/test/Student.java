package junit.test;

import java.util.List;


@Schema(name="ѧ��")
public class Student {

	@NormalAttr(name="���")
	private int age;
	
	@NormalAttr(name="�Ա�",enumValue={"��","Ů"})
	private String gender;
	
	private List<Course> courses;
}
