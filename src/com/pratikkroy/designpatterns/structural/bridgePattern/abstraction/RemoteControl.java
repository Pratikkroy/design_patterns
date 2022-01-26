package com.pratikkroy.designpatterns.structural.bridgePattern.abstraction;

import com.pratikkroy.designpatterns.structural.bridgePattern.implementation.Device;

public class RemoteControl implements Remote {

    private Device device;

    public RemoteControl(final Device device) {
        this.device = device;
    }

    @Override
    public void togglePower() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    @Override
    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 1);
    }

    @Override
    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        this.device.setChannel(this.device.getChannel() - 1);
    }
}
