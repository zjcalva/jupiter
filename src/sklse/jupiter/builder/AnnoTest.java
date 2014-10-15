package sklse.jupiter.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Properties;

import sklse.jupiter.annotations.NormalAttribute;
import sklse.jupiter.reflection.MetaClass;
import sklse.jupiter.reflection.Reflector;
import junit.test.prototype.Base;
import junit.test.prototype.Child;


public class AnnoTest {
	
	
	public static void main(String[] args) throws SecurityException, NoSuchFieldException {
		Class<?> cl = Child.class;
		
		System.out.println("Name".toUpperCase(Locale.ENGLISH));
		
		Reflector classInfo = Reflector.forClass(cl);
		for(Field f : classInfo.getFields()){
			System.out.println("field : "+f.getName());
		}
		
		for(String s:classInfo.getGetablePropertyNames()){
			System.out.println("Getable : "+s);
		}
		
		MetaClass mc = MetaClass.forClass(cl);
		
		//�����еı�������
		System.out.println(mc.getGetterType("bb.bb.bb.bb").getName());
		//�����е����� ��������map  ֻ���ҵ�һ����������
		System.out.println(mc.getGetterType("list[list").getName());
		
		Field field = cl.getDeclaredField("name");
		field.setAccessible(true);
		Annotation an[] = field.getAnnotations();
		NormalAttribute nor = field.getAnnotation(NormalAttribute.class);
		System.out.println(nor.name());
		for ( Annotation a : an ){
			if( a instanceof NormalAttribute){
				nor = (NormalAttribute) a;
				System.out.println(nor.name());
			}
		}
	}

}
