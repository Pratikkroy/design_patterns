package com.pratikkroy.design_patterns.structural.bridge_pattern.abstraction.impl;

import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
