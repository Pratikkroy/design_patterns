package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.Request;

public class AuthenticationHandler extends BaseAuthHandler {

    @Override
    public boolean handleAuth(final Request request) {
        System.out.println("AuthenticationHandler");
        if (request.username.equals("u") && request.password.equals("p")) {
            return handleNext(request);
        } else {
            return false;
        }
    }
}
