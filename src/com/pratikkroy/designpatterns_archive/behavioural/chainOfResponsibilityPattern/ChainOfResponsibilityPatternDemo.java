package com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern;

import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler.AuthHandler;
import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler.AuthenticationHandler;
import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler.AuthorisationHandler;
import com.pratikkroy.designpatterns.behavioural.chainOfResponsibilityPattern.handler.ThrottlingHandler;

public class ChainOfResponsibilityPatternDemo {

    public static void start() {
        final Request request = new Request();
        request.username = "u";
        request.password = "p";

        final AuthHandler authHandler = new AuthenticationHandler();
        authHandler.setNextHandler(new AuthorisationHandler()).setNextHandler(new ThrottlingHandler());
        authHandler.handleAuth(request);
    }
}
