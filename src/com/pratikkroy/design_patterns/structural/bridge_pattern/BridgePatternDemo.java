package com.pratikkroy.design_patterns.structural.bridge_pattern;

import com.pratikkroy.design_patterns.structural.bridge_pattern.abstraction.impl.AdvancedRemote;
import com.pratikkroy.design_patterns.structural.bridge_pattern.abstraction.impl.BasicRemote;
import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.Device;
import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.impl.Radio;
import com.pratikkroy.design_patterns.structural.bridge_pattern.implementation.impl.Tv;

public class BridgePatternDemo {
    public static void demo(){

        System.out.println();
        System.out.println("Bridge pattern demo.....");
        System.out.println();

        Device[] testDevices = {new Tv(), new Radio()};

        for(Device device: testDevices){
            System.out.println("Tests with basic remote.");
            BasicRemote basicRemote = new BasicRemote(device);
            basicRemote.togglePower();
            basicRemote.channelUp();
            basicRemote.volumeDown();
            device.printStatus();

            System.out.println("Tests with advanced remote.");
            AdvancedRemote advancedRemote = new AdvancedRemote(device);
            advancedRemote.togglePower();
            advancedRemote.mute();
            device.printStatus();
        }

    }
}
