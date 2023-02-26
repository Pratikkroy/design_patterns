package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.Request;

public class ThrottlingHandler extends BaseAuthHandler {
    private static int counter = 0;

    @Override
    public boolean handleAuth(final Request request) {
        System.out.println("ThrottlingHandler");
        counter++;
        if (counter>10) {
            return false;
        }
        return handleNext(request);
    }
}
