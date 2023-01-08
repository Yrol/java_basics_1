package com.yrol;

public interface Run {

    // declaring a default method using
    default int getSpeed() {
        return 10;
    }
}
