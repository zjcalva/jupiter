package junit.test;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Schema(name="��ѧ")
public class University {
	
	@Component
	protected Descrption desc;
	
	@ComponentMap(key="��У��",value="��У")
	@RoleSubRel(pnode="У�쵼",name="��У��",cardinality="*")
	@ContainRel(name="��У",targetSchema="��ѧ",mulitValue="true",inverse="����")
	protected Map<Person,Affiliation> superviseMap;
	
	@NormalAttr(name="��Уʱ��")
	protected Date foundingTime;

	@NormalAttr(name="���")
	protected String summary;
	
	@NormalAttr(name="����",enumValue={"985","211","������ֱ��","ʡ��"})
	protected Enum<?> level;
	
	@ContainRel(name="��У",targetSchema="��ѧ",mulitValue="true",inverse="����")
	protected List<Affiliation> affiUnivList;
	
	@NormalRel(name="��ַ",targetSchema="����",cardinality="*:1",inverse="��ѧ")
	protected Address address;
	
	@ComRel(name="����")
	protected List<Rank> rankList;
	
	@RoleRel(name="У�쵼",targetSchema="��",cardinality="*",inverse="ְ��")
	protected List<Person> schoolLeaders;
	
	protected Date arriverDate;
	
	@RoleSubRel(pnode="У�쵼",name="У��",cardinality="1:1")
	protected Person president;
	
	@RoleSubRel(pnode="У�쵼",name="��У��",cardinality="*")
	protected List<Person> vice_president;
	
protected class Rank{
	@NormalAttr(name="���")
	int year;
	@NormalAttr(name="����")
	int rank;
	@NormalRel(name="��Դ",targetSchema="����",cardinality="*:1")
	List<Organization> orgs;
}

@Oid
private int oid;

@InstanceName
private String instName;
	
}
