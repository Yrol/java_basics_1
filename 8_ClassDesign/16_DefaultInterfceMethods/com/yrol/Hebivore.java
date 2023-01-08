package com.yrol;

public interface Hebivore {

    default void eatPlant() {
        System.out.println("Eating plant");
    }
}
