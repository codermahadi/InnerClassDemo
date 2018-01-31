package com.mahadi;

/**
 * Created by Mahadi on 1/31/2018.
 */
public class AnnonymousDemo {

    public static void main(String[] args) {


        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Animal Can Eat");
            }
        };
        eatable.eat();
    }
}
