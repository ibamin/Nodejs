package javabook.chapter8.defaultexample;

public interface MyInterface {
    public void method1();   
    
    public default void method2(){
        System.out.println("MyInterface-method2 ����");
    }
}