package junit.test;

public class Manager extends User {
	
	@RoleBasedAttr(name ="Ȩ��",pnode="У�쵼",
			enumValue={"���","��ѯ"})
	String privilage;

	@ContextRel(name="�˵�")
	String context_menu;
	
	@IdentiRel(pnode="�˵�")
	String identiRel;
}
