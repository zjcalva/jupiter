package junit.test;

public @interface RoleRel {

	String name();

	String targetSchema();

	String cardinality();

	String inverse();

}
