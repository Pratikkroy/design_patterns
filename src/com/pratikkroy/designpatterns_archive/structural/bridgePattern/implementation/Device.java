package com.pratikkroy.designpatterns.structural.bridgePattern.implementation;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percentage);

    int getChannel();

    void setChannel(int number);
}
