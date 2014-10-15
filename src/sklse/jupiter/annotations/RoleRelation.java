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
	
	//Ĭ�Ϲ�ϵ������Ϊ1:1
	Cardi cardi() default Cardi.ONE_TO_ONE;
	
	boolean multiDimesion() default false;
	
	//targetΪ��Ӧ��java����
	String target() default "";
	
	//���ʹ��String�����ϵtarget �ڽ���ģʽ��ʱ����������Ӧ��inmģʽ��
	String targetSchemaName() default "";
	
	//��ϵ���ԣ��ӹ�ϵ  ����Ϊjava������
	String[] subnodes() default {""};
}