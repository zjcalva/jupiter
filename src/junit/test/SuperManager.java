package junit.test;

public class SuperManager extends User {
	
	@RoleBasedAttr(name ="Ȩ��",pnode="У�쵼",
			enumValue={"���","��ѯ","����","�޸�","ɾ��"})
	String privilage;

	@ContextRel(name="�˵�")
	String context_menu;
	
}

