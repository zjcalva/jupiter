package junit.test;

public interface UnivService {

	@insert("insert 大学 #instName# [@建校时间:#foundingTime#,校领导:#schoolLeaders#];")
	public void addUniv(University univ);
	
	@query("query 大学 $x=#instName# construct $x[]")
	public University queryUniv();
}
