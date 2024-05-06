package org.example;

public class PS3  {
int a;

    public PS3(int a) {
        this.a =a;
    }

    public int multiplyByTwo() {
        a = a * 2;
        return a;
    }
    public int multiplyByThree() {
        a = a * 3;
        return a;
    }
}
//all the methods are abstract and they don't have any body
//all if the class has implemented methods and none implemented methods
// we call that an abstract methods.

//interface on the other have a;ll the class must be implemented.
//if any method in class which is abstrct then the whole will be treated as
//abstract class
//if anyh class if defined as an abstract, then you can not ininstiate that class