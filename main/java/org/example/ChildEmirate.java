package org.example;

import java.io.IOException;

public class ChildEmirate extends ParentAirCraft {

    public static void main(String[] args) throws IOException {

        ChildEmirate c = new ChildEmirate();
        c.engine();
        c.saftyGuidelines();
        c.bodyColor();

    }

    @Override
    public void bodyColor() {
        System.out.println("Red Colr on the body");
    }
}
