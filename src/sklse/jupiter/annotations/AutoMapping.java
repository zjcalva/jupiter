package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 同名自动映射，对于非static，final且有Getter，Setter的java变量自动建立与inm同名变量的映射关系
 * 如果变量已配置映射关系则会跳过
 * 没有匹配到的变量给出warning
 * @author Administrator
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AutoMapping {

	
}
