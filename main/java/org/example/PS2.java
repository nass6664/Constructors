package org.example;

public class PS2 extends PS3{

    int a;

    public PS2(int a) {
        super(a);  //Parent class Constructor is invoked
        this.a=a;  //current class variable
    }

    //defualt constuctors
    public int increment() {
        a = a + 1;
        return a;
    }
    public int Decrement() {
        a = a - 1;
        return a;
    }
}
