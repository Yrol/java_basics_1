package com.yrol;

public interface Walk {

    // declaring a default method using
    default int getSpeed() {
        return 10;
    }
}
