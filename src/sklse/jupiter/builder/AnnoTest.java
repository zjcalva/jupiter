package sklse.jupiter.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import sklse.jupiter.annotations.NormalAttr;
import junit.test.prototype.Base;
import junit.test.prototype.Child;

public class AnnoTest {

	public static void main(String[] args) throws SecurityException, NoSuchFieldException {

		Class<?> cl = Child.class;
		
		for(Field f: cl.getDeclaredFields()){
			f.setAccessible(true);
			System.out.println(f.getName());
		}
		
		for(Method m: cl.getDeclaredMethods()){
			System.out.println(m.getName());
		}
	
		Field field = cl.getDeclaredField("name");
		field.setAccessible(true);
		Annotation an[] = field.getAnnotations();
		NormalAttr nor = field.getAnnotation(NormalAttr.class);
		System.out.println(nor.name());
		for ( Annotation a : an ){
			if( a instanceof NormalAttr){
				nor = (NormalAttr) a;
				System.out.println(nor.name());
			}
		}
	}

}
