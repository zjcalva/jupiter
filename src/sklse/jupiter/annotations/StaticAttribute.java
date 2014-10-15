package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * static 属性
 * @author Administrator
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Deprecated
public @interface StaticAttribute {

	String name() default "";
	
	boolean multiValue() default false;
	
	boolean multiDimesion() default false;
	
	//默认类型为string(inm)
	PropertyType proType() default PropertyType.STRING;
	
	//枚举类型
	String[] enumValues() default {""};
}