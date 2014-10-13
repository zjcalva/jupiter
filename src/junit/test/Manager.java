package junit.test;

public class Manager extends User {
	
	@RoleBasedAttr(name ="权限",pnode="校领导",
			enumValue={"浏览","查询"})
	String privilage;

	@ContextRel(name="菜单")
	String context_menu;
	
	@IdentiRel(pnode="菜单")
	String identiRel;
}
