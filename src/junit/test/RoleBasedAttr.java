package junit.test;

public @interface RoleBasedAttr {

	String name();

	String pnode();

	String[] enumValue() default "";

}
