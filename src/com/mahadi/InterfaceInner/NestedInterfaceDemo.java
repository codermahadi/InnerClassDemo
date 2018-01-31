package com.mahadi.InterfaceInner;

/**
 * Created by Mahadi on 1/31/2018.
 */
public class NestedInterfaceDemo implements Displayble.Message {

    @Override
    public void msg() {
        System.out.println("Hello Nested Interface");
    }

    public static void main(String[] args) {

        Displayble.Message message = new NestedInterfaceDemo();
        message.msg();
    }
}
