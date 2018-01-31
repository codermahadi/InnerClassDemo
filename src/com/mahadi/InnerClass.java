package com.mahadi;

/**
 * Created by Mahadi on 1/31/2018.
 */
public class InnerClass {

    private int data = 300;

    class Inner{

        void msg(){
            System.out.println("Data is " + data);
        }
    }

    void display(){

        Inner inner = new Inner();
        inner.msg();
    }
}
