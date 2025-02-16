package org.example;

class A{
    int a;
    public A(){}
}
class B{
    int b;
    public B(){}
}
public class Main {
    public <T> void fun(Class<T> clazz){
        clazz.cast(A.class);
    }
    public static void main(String[] args){
        Class<A> clazz= A.class;
        System.out.println(clazz);
    }
}
