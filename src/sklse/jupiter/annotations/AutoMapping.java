package sklse.jupiter.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ͬ���Զ�ӳ�䣬���ڷ�static��final����Getter��Setter��java�����Զ�������inmͬ��������ӳ���ϵ
 * �������������ӳ���ϵ�������
 * û��ƥ�䵽�ı�������warning
 * @author Administrator
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AutoMapping {

	
}
