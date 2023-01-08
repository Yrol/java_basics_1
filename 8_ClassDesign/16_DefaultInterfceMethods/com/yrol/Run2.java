package com.yrol;

// Extending the Walk interface and overriding getSpeed method
public interface Run2 extends Walk {

    default int getSpeed() {
        return 10;
    }
}
