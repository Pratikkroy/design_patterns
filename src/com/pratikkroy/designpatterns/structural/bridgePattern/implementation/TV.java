package com.pratikkroy.designpatterns.structural.bridgePattern.implementation;

public class TV implements Device {
    private boolean enabled = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(final int percentage) {
        this.volume = percentage;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(final int number) {
        this.channel = number;
    }

    @Override
    public String toString() {
        return "TV{" + "enabled=" + enabled + ", volume=" + volume + ", channel=" + channel + '}';
    }
}
