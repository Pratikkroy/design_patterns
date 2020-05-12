package com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.impl;

import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.Device;

public abstract class BasicDevice implements Device {

    private boolean isOn;
    private int volume;
    private int channel;
    private int MAX_CHANNEL;

    public BasicDevice(final boolean isOn, final int volume, final int channel, final int MAX_CHANNEL) {
        this.isOn = isOn;
        this.volume = volume;
        this.channel = channel;
        this.MAX_CHANNEL = MAX_CHANNEL;
    }

    @Override
    public boolean isEnabled() {
        return this.isOn;
    }

    @Override
    public void enable() {
        this.isOn = true;
    }

    @Override
    public void disable() {
        this.isOn = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(final int percent) {
        if(percent > 100){
            this.volume = 100;
        }
        else if(percent < 0){
            this.volume = 0;
        }
        else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(final int channel) {
        this.channel = channel%(MAX_CHANNEL+1);
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a BasicDevice.");
        System.out.println("| I'm " + (isOn ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
