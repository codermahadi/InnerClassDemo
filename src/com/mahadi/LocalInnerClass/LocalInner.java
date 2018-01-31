package com.mahadi.LocalInnerClass;

/**
 * Created by Mahadi on 1/31/2018.
 * Local inner class cannot be invoke from outside the method
 * Local inner class connot be access non-final local variable
 */
public class LocalInner {

    private int data = 30; // instance Variable

    void display(){

        int value = 20; // local Variable but non-final

        class Local{

            void msg(){

                System.out.println("Value is " + data);
            }

        } // end Loaca class

        Local local = new Local();
        local.msg();

    }// end display method

    public static void main(String[] args) {

        LocalInner localInner = new LocalInner();

        localInner.display();
    }
}

