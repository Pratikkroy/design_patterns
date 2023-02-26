package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.Request;

public class AuthorisationHandler extends BaseAuthHandler {

    @Override
    public boolean handleAuth(final Request request) {
        System.out.println("AuthorisationHandler");
        if (request.username.equals("p")) {
            request.role = "admin";
        } else {
            request.role = "user";
        }
        return handleNext(request);
    }
}
