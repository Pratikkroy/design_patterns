package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.Request;

public abstract class BaseAuthHandler implements AuthHandler {
    private AuthHandler nextHandler;

    @Override
    public AuthHandler setNextHandler(final AuthHandler nextHandler) {
        return this.nextHandler = nextHandler;
    }

    protected boolean handleNext(final Request request) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handleAuth(request);
    }
}
