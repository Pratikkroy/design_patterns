package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.Request;

public interface AuthHandler {
    boolean handleAuth(Request request);

    AuthHandler setNextHandler(AuthHandler nextHandler);
}
