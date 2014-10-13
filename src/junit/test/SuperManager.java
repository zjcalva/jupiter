package junit.test;

public class SuperManager extends User {
	
	@RoleBasedAttr(name ="权限",pnode="校领导",
			enumValue={"浏览","查询","增加","修改","删除"})
	String privilage;

	@ContextRel(name="菜单")
	String context_menu;
	
}

