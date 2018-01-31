package com.mahadi.InterfaceInner;

/**
 * Created by Mahadi on 1/31/2018.
 * Nested interface must be public
 * Nested interfaces are declared static implicitly.
 */
public interface Displayble {

    void show();

    interface Message{

        void msg();
    }
}
