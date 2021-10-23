package com.torryharris.model;

public class GenericPrint <T,E>{
    private T obj1;
    private E obj2;

    public GenericPrint(T obj1, E obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj) {
        this.obj1 = obj;
    }

    public E getObj2() {
        return obj2;
    }

    public void setObj2(E obj2) {
        this.obj2 = obj2;
    }
}
