package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ģʽӳ��ע�⣬ȱʡname���ƥ����java������ͬ��inmģʽ��(������version)
 * ���ƥ�䵽���inmģʽ����û��ƥ�䵽����׳��쳣
 * @author Administrator
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Schema {

	String name() default "";
	
	String version() default "";
}
