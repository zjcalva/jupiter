package junit.test;

import java.util.List;


@Schema(name="学生")
public class Student {

	@NormalAttr(name="年纪")
	private int age;
	
	@NormalAttr(name="性别",enumValue={"男","女"})
	private String gender;
	
	private List<Course> courses;
}
