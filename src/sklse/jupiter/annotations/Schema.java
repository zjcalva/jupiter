package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模式映射注解，缺省name则会匹配以java类名相同的inm模式名(不包含version)
 * 如果匹配到多个inm模式或者没有匹配到则会抛出异常
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
