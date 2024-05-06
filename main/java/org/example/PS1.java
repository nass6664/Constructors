package org.example;

import org.testng.annotations.Test;

//2 types for calling a method of another class:
// 1. inheritance - extends
//2. with creating object PS2 ps = new PS2(); ps.increment
// but creating an object is not enough you need to create
// A constructor in Java which is
// a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes
public class PS1 extends PS {

    @Test
    public void testRun() {  //Paramertize constructor
        PS2 ps2 = new PS2(3);
        int a =3;
        doThis();
        System.out.println(ps2.increment());
        System.out.println(ps2.Decrement());

        //
       // PS3 ps3 = new PS3(a);  Need tp use the inhertance extend to parant
       // and super(a)
        System.out.println(ps2.multiplyByThree());

    }
}
