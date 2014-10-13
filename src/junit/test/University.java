package junit.test;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Schema(name="大学")
public class University {
	
	@Component
	protected Descrption desc;
	
	@ComponentMap(key="副校长",value="分校")
	@RoleSubRel(pnode="校领导",name="副校长",cardinality="*")
	@ContainRel(name="分校",targetSchema="大学",mulitValue="true",inverse="隶属")
	protected Map<Person,Affiliation> superviseMap;
	
	@NormalAttr(name="建校时间")
	protected Date foundingTime;

	@NormalAttr(name="简介")
	protected String summary;
	
	@NormalAttr(name="级别",enumValue={"985","211","教育部直属","省属"})
	protected Enum<?> level;
	
	@ContainRel(name="分校",targetSchema="大学",mulitValue="true",inverse="隶属")
	protected List<Affiliation> affiUnivList;
	
	@NormalRel(name="地址",targetSchema="地区",cardinality="*:1",inverse="大学")
	protected Address address;
	
	@ComRel(name="排名")
	protected List<Rank> rankList;
	
	@RoleRel(name="校领导",targetSchema="人",cardinality="*",inverse="职务")
	protected List<Person> schoolLeaders;
	
	protected Date arriverDate;
	
	@RoleSubRel(pnode="校领导",name="校长",cardinality="1:1")
	protected Person president;
	
	@RoleSubRel(pnode="校领导",name="副校长",cardinality="*")
	protected List<Person> vice_president;
	
protected class Rank{
	@NormalAttr(name="年份")
	int year;
	@NormalAttr(name="名次")
	int rank;
	@NormalRel(name="来源",targetSchema="机构",cardinality="*:1")
	List<Organization> orgs;
}

@Oid
private int oid;

@InstanceName
private String instName;
	
}
