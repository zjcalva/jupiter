package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * local ����
 * @author Administrator
 *
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface LocalAttribute {

	String name() default "";
	
	boolean multiValue() default false;
	
	boolean multiDimesion() default false;
	
	//Ĭ������Ϊstring(inm)
	PropertyType proType() default PropertyType.STRING;
	
	//ö������
	String[] enumValues() default {""};
}