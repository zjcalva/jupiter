package junit.test;

import java.util.List;

public class Menu {

	@RoleRel(name="普通管理员",targetSchema="用户",
			cardinality="M:N",inverse="菜单")
	List<User> manager;
	
	@RoleRel(name="超级管理员",targetSchema="用户",
			cardinality="M:N",inverse="菜单")
	List<User> superManager;
}
