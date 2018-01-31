package com.mahadi;

/**
 * Created by Mahadi on 1/31/2018.
 */
public class InnerDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.show();


        Outer.Inner inner = outer.new Inner();
        inner.display();

    }
}
