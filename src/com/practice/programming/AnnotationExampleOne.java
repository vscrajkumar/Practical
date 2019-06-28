package com.practice.programming;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
 
    String name();
    String desc();
}
 
public class AnnotationExampleOne{
     
    @MyAnnotation(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
    	 try {
             Class<? extends AnnotationExampleOne> cls = this.getClass();
             Method mth = cls.getMethod("myTestMethod");
             MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
             System.out.println("key: "+myAnno.name());
             System.out.println("value: "+myAnno.desc());
         } catch (SecurityException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (NoSuchMethodException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    }
    public static void main(String a[]){
        
    	AnnotationExampleOne mat = new AnnotationExampleOne();
        mat.myTestMethod();
    }
}