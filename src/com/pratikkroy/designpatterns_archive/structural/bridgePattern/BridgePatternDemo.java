package com.pratikkroy.designpatterns.structural.bridgePattern;

import com.pratikkroy.designpatterns.structural.bridgePattern.abstraction.Remote;
import com.pratikkroy.designpatterns.structural.bridgePattern.abstraction.RemoteControl;
import com.pratikkroy.designpatterns.structural.bridgePattern.implementation.Radio;
import com.pratikkroy.designpatterns.structural.bridgePattern.implementation.TV;

public class BridgePatternDemo {

    public static void start() {

        final TV tv = new TV();
        final Radio radio = new Radio();

        final Remote tvRemote = new RemoteControl(tv);
        final Remote radioRemote = new RemoteControl(radio);

        System.out.println("Created two different remotes to control TV and Radio by using a single interface "
                + "RemoteControl.");

        tvRemote.togglePower();
        radioRemote.togglePower();

        System.out.println("TV before channel up :: "+ tv);
        tvRemote.channelUp();
        System.out.println("TV after channel up :: "+ tv);

        System.out.println("Radio before volume up :: "+ radio);
        radioRemote.volumeUp();
        System.out.println("Radio after volume up :: "+ radio);


    }
}
