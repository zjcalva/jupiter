package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Administrator
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RoleRelation {

	String name() default "";
	
	//默认关系基数比为1:1
	Cardi cardi() default Cardi.ONE_TO_ONE;
	
	boolean multiDimesion() default false;
	
	//target为对应的java类名
	String target() default "";
	
	//如果使用String代表关系target 在建立模式的时候必须填入对应的inm模式名
	String targetSchemaName() default "";
	
	//关系属性，子关系  名字为java变量名
	String[] subnodes() default {""};
}