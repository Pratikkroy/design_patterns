package com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.impl;

import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.Device;

public class Tv extends BasicDevice {

    // used for instantiation
    private static final boolean isOn = false;
    private static final int volume = 30;
    private static final int channel = 0;
    private static final int MAX_CHANNEL = 100;


    public Tv(){
        super(isOn, volume, channel, MAX_CHANNEL);
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (super.isEnabled() ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + super.getVolume() + "%");
        System.out.println("| Current channel is " + super.getChannel());
        System.out.println("------------------------------------\n");
    }
}
