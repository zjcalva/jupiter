package junit.test;

public interface UnivService {

	@insert("insert ��ѧ #instName# [@��Уʱ��:#foundingTime#,У�쵼:#schoolLeaders#];")
	public void addUniv(University univ);
	
	@query("query ��ѧ $x=#instName# construct $x[]")
	public University queryUniv();
}
