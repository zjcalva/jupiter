package junit.test;

import java.util.List;

public class Menu {

	@RoleRel(name="��ͨ����Ա",targetSchema="�û�",
			cardinality="M:N",inverse="�˵�")
	List<User> manager;
	
	@RoleRel(name="��������Ա",targetSchema="�û�",
			cardinality="M:N",inverse="�˵�")
	List<User> superManager;
}
